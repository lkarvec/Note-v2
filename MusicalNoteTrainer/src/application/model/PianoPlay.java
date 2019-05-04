package application.model;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import application.controller.PianoController;

/**
 * Reading in from the PianoRecord files, PianoPlay uses hashmaps to split the strings in the file to recreate the rhythms and pitches used in the original playthrough
 * @author Alex Mains
 *
 */
public class PianoPlay implements Runnable {
	public static HashMap<Long, String > map = new HashMap<>();
	public void run() {
		long i = 0;
		long tt = 0;
		long maxTime = 0;
		String fileName="data/piano_saves/";
		fileName+=PianoController.finame;
		
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
				if(PianoController.pla==true) {
				 
				Thread.sleep(Long.parseLong(tokens[1])-start);
				PianoController.lastPressed = tokens[0]; Thread play = new Thread(new MultithreadingPiano()); play.start();
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
