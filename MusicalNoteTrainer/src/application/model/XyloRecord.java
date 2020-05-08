package application.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import application.controller.KalimbaController;
import application.controller.XylophoneController;
/**
 * 
 * checks if there is a file with the name the user selected. if not create, if there is overwrite.
 *when a note is played it is written to the file along with the time in milliseconds
 *
 */
public class XyloRecord implements Runnable{
	
	public void run(){
		String savefolder = null;
		try {
			savefolder = SettingsModel.getSaveFolder();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} 
		String fileName= savefolder + "/Xylo_saves/";
		
		fileName+=XylophoneController.finame;
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
			System.out.println(count + " xylo: " +XylophoneController.notesRec + XylophoneController.rec );
			String e = "";
			while (XylophoneController.rec==true) {
				if (i==0) {
					start = System.currentTimeMillis();
					i++;
				}
				System.out.println(count + " xylo: " +XylophoneController.notesRec + XylophoneController.rec );
				if (XylophoneController.notesRec == count+1 ) {
					System.out.println(count + " xylo: " +XylophoneController.notesRec );
				keep=System.currentTimeMillis()-start;
					count++;
			e+= XylophoneController.lastPressed + "," +keep +"\n";
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
