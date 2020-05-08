package application.model;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.*;
import application.controller.KalimbaController;
import application.model.SettingsModel;
/**
 * Allows the Kalimba to be multithreaded so multiple notes can be played simultaneously
 * @author Alex Mains
 *
 */
public class MultithreadingKalimba implements Runnable {
	
	public void run() { 
	        
		try { 
			// Displaying the thread that is running .
			// System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 
	    		
	    	Clip clip = AudioSystem.getClip();
	    	clip.open(AudioSystem.getAudioInputStream(new File("src/kalim_wav/" + KalimbaController.lastPressed + ".wav")));
	    	FloatControl gainControl = 
	    		    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	    		gainControl.setValue(SettingsModel.getVolume()); // Reduce volume by 10 
	    	clip.start();
	    		
	    	// Need to figure thread closing later.
	        
	    } catch (Exception e) { 
	        // Throwing an exception 
	    	System.out.println ("Exception is caught"); 
	    } 
	    
	} 
}