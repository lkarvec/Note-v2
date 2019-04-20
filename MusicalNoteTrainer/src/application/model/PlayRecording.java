package application.model;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import application.controller.XylophoneController;

public class PlayRecording implements Runnable {
	
	public void run() {
		
		try {
			// open the file for reading
			Scanner scan = new Scanner( new File("data/try.csv") );
			long start =0;
			int i=0;
			while( scan.hasNextLine() ) {
				String line = scan.nextLine();
				String[] tokens = line.split(",");
				if (i==0) {
					start = Long.parseLong(tokens[1]);
					i++;
				}
				Thread.sleep(Long.parseLong(tokens[1])-start);
				XylophoneController.lastPressed = tokens[0]; Thread play = new Thread(new Multithreadxylo()); play.start();
				start=Long.parseLong(tokens[1]);
				}
				
				
			
			
			// close the file!
			scan.close();
			
		}catch( IOException | NumberFormatException | InterruptedException e ) {
			e.printStackTrace();
		}
		
	}

}
