package application.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import application.controller.XylophoneController;

public class Record implements Runnable{
	
	public void run(){
		try {
			FileWriter writer = new FileWriter( new File("data/try.csv"),false );
			int count = 0;
			// open the file for writing
			System.out.println(count + " xylo: " +XylophoneController.notesRec + XylophoneController.rec );
			String e = "";
			while (XylophoneController.rec==true) {
				System.out.println(count + " xylo: " +XylophoneController.notesRec + XylophoneController.rec );
				if (XylophoneController.notesRec == count+1 ) {
					System.out.println(count + " xylo: " +XylophoneController.notesRec );
				
					count++;
			e+= XylophoneController.lastPressed + "," + System.currentTimeMillis()+"\n";
				}}
			

			writer.write( e.toString());
			// close the file
			writer.close();
				
				
				
			
			
		}catch( IOException e ) {
			e.printStackTrace();
		}
		System.out.println("successfully closed");
	}
				
	
}