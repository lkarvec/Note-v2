package application.model;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import application.controller.PianoController;
import application.controller.XylophoneController;

public class Multithreadxylo implements Runnable {

	  public void run() { 
	        
	    	try { 
	    		// Displaying the thread that is running .
	    		// System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 
	    		
	    		Clip clip = AudioSystem.getClip();
	    		System.out.println(XylophoneController.lastPressed);
	    		clip.open(AudioSystem.getAudioInputStream(new File("src/xyloNote/Mallet " + XylophoneController.lastPressed + ".wav")));
	    		
	    		clip.start();
	    		
	    		// Need to figure thread closing later.
	        
	    	} catch (Exception e) { 
	            // Throwing an exception 
	            System.out.println ("Exception is caught"); 
	        } 
	    
	    } 
	
}
