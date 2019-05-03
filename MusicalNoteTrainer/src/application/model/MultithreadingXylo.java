package application.model;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import application.controller.XylophoneController;

public class MultithreadingXylo implements Runnable { 
	
    public void run() { 
        
    	try { 
    		// Displaying the thread that is running .
    		// System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 
    		
    		Clip clip = AudioSystem.getClip();
    		clip.open(AudioSystem.getAudioInputStream(new File("src/xylo_wav/Mallet " + XylophoneController.lastPressed + ".wav")));
    		clip.start();
    		
    		// Need to figure thread closing later.
        
    	} catch (Exception e) { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    
    } 
}