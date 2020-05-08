package application.model;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import application.controller.KalimbaController;
import application.controller.PianoController;
import application.controller.SettingsController;
import application.model.SettingsModel;
/**
 * Reading in from the KalimRecord files, KalimPlay uses hashmaps to split the strings in the file to recreate the rhythms and pitches used in the original playthrough
 * @author Alex Mains
 *
 */

public class KalimPlay implements Runnable {
	public static HashMap<Long, String > map = new HashMap<>();
	public void run() {
		long i = 0;
		long tt = 0;
		long maxTime = 0;
		
		
		
		try {
			String savefolder = SettingsModel.getSaveFolder();
			String fileName= savefolder + "/kalim_saves/";
			fileName+=KalimbaController.finame;
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
			
		}catch( IOException | NumberFormatException | InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
