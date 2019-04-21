package application.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import application.controller.PianoController;


public class PianoRecord implements Runnable{
	public void run(){
		String fileName="pianoSaves/";
		 fileName+=PianoController.finame;
		
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
			System.out.println(count + " xylo: " +PianoController.notesRec + PianoController.rec );
			String e = "";
			while (PianoController.rec==true) {
				if (i==0) {
					start = System.currentTimeMillis();
					i++;
				}
				System.out.println(count + " xylo: " +PianoController.notesRec + PianoController.rec );
				if (PianoController.notesRec == count+1 ) {
					System.out.println(count + " piano: " +PianoController.notesRec );
				keep=System.currentTimeMillis()-start;
					count++;
			e+= PianoController.lastPressed + "," +keep +"\n";
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
