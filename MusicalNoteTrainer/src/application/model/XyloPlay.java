package application.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import application.controller.XylophoneController;
/**
 * 
 * Reads in from the file selected by the user then plays the notes in time represented by the file 
 *
 */
public class XyloPlay implements Runnable {
	public static HashMap<Long, String > map = new HashMap<>();
	public void run() {
		long i = 0;
		long tt = 0;
		long maxTime = 0;
		String fileName="data/xylo_saves/";
		fileName+=XylophoneController.finame;
		
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
				if(XylophoneController.pla==true) {
				 
				Thread.sleep(Long.parseLong(tokens[1])-start);
				XylophoneController.lastPressed = tokens[0]; Thread play = new Thread(new MultithreadingXylo()); play.start();
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

