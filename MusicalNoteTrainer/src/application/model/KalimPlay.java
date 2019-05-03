package application.model;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import application.controller.KalimbaController;

public class KalimPlay implements Runnable {
	public static HashMap<Long, String > map = new HashMap<>();
	public void run() {
		long i = 0;
		long tt = 0;
		long maxTime = 0;
		String fileName="data/kalim_saves/";
		fileName+=KalimbaController.finame;
		
		try {
			// open the file for reading
			Scanner scan = new Scanner( new File(fileName) );
			long start =0;
			
			while( scan.hasNextLine() ) {
				String line = scan.nextLine();
				String[] tokens = line.split(",");
				if (i==0) {
					start = Long.parseLong(tokens[1]);
					i++;
				}
				if(KalimbaController.pla==true) {
				 
				Thread.sleep(Long.parseLong(tokens[1])-start);
				KalimbaController.lastPressed = tokens[0]; Thread play = new Thread(new MultithreadingKalimba()); play.start();
				start=Long.parseLong(tokens[1]);
				
				}
				}
				
				
			
			
			// close the file!
			scan.close();
			
		}catch( IOException | NumberFormatException | InterruptedException e ) {
			e.printStackTrace();
		}
		
	}

}
