package application.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import application.controller.KalimbaController;
import application.controller.PianoController;

/**
 * Modeled after the PianoRecord, This class allows a handle to create a file if it doesn't exist to write to while the boolean on the button is set to TRUE.
 * It records last note pressed and time in ms to a file.
 * @author Alex Mains
 *
 */
public class KalimRecord implements Runnable{
	
	public void run(){
		String savefolder = null;
		try {
			savefolder = SettingsModel.getSaveFolder();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} 
		String fileName= savefolder + "/kalim_saves/";
		
		 fileName+=KalimbaController.finame;
		
		 File file = new File(fileName);

	        try {
				if (file.createNewFile()) {
				    
				    System.out.println("File has been created.");
				} else {
				
				    System.out.println("File already exists.");
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    
	
		
		try {
			
			
			FileWriter writer = new FileWriter( new File(fileName),false );
			int count = 0;
			int i=0;
			long start= 0;
			long keep=0;
			// open the file for writing
			System.out.println(count + " kalim: " +KalimbaController.notesRec + KalimbaController.rec );
			String e = "";
			while (KalimbaController.rec==true) {
				if (i==0) {
					start = System.currentTimeMillis();
					i++;
				}
				System.out.println(count + " kalim: " +KalimbaController.notesRec + KalimbaController.rec );
				if (KalimbaController.notesRec == count+1 ) {
					System.out.println(count + " kalim: " +KalimbaController.notesRec );
				keep=System.currentTimeMillis()-start;
					count++;
			e+= KalimbaController.lastPressed + "," +keep +"\n";
				}}
			start=keep;

			writer.write( e.toString());
			// close the file
			writer.close();
				
				
				
			
			
		}catch( IOException e ) {
			e.printStackTrace();
		}
	
	}
}
