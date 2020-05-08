package application.model;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

import application.controller.SettingsController;
import application.controller.XylophoneController;
import application.model.SettingsModel;

/**
 * Allows the Xylophone to be multithreaded so multiple notes can be played simultaneously
 * @author Alex Mains
 *
 */
public class MultithreadingXylo implements Runnable { 
	
    public void run() { 
        
    	try { 
    		// Displaying the thread that is running .
    		// System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 
    		
    		Clip clip = AudioSystem.getClip();
    		clip.open(AudioSystem.getAudioInputStream(new File("src/xylo_wav/Mallet " + XylophoneController.lastPressed + ".wav")));
    		FloatControl gainControl = 
	    		    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	    		gainControl.setValue(SettingsModel.getVolume()); // Reduce volume by 10 decibels.
	    	clip.start();
    		
    		// Need to figure thread closing later.
        
    	} catch (Exception e) { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    
    } 
}