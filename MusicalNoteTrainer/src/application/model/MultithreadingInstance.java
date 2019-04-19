package application.model;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import application.controller.PianoController;

public class MultithreadingInstance implements Runnable { 
	
    public void run() { 
        
    	try { 
    		// Displaying the thread that is running 
    		System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 
    		
    		//Extra testing for Audio
    		Clip clip = AudioSystem.getClip();
    		clip.open(AudioSystem.getAudioInputStream(new File("src/wav/" + PianoController.lastPressed + ".wav")));
    		clip.start();
        
    	} catch (Exception e) { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    
    } 
}