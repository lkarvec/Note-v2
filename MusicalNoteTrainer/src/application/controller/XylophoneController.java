/**
 * Include updated @author tag.
 */
package application.controller;

import java.applet.Applet;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import application.Main;
import application.model.Multithreadxylo;
import application.model.PlayRecording;
import application.model.Record;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.AudioClip;

public class XylophoneController {
	@FXML
	public ImageView C; // C
	@FXML
	public ImageView D; // D
	@FXML
	public ImageView E; // E
	@FXML
	public ImageView F; // F
	@FXML
	public ImageView G; // G
	@FXML
	public ImageView A; // A
	@FXML
	public ImageView B; // B
	@FXML
	public ImageView C1; // C1
	@FXML
	public ImageView D1; // D1
	@FXML
	public ImageView E1; // E1
	@FXML
	public ImageView F1; // F1
	@FXML
	public ImageView G1; // G1
	@FXML
	public ImageView A1; // A1
	@FXML
	public ImageView B1; // B1
	@FXML
	public ImageView C2; // C2
	@FXML
	public ImageView D2; // D2
	@FXML
	public ImageView E2; // E2
	@FXML
	public ImageView F2; // F2
	@FXML
	public ImageView G2; // G2
	@FXML
	public ImageView A2; // A2
	@FXML
	public ImageView B2; // B2
	@FXML
	public ImageView Cs; // Cs
	@FXML
	public ImageView Ds; // Ds
	@FXML
	public ImageView Fs; // Fs
	@FXML
	public ImageView Gs; // Gs
	@FXML
	public ImageView As; // As
	@FXML
	public ImageView Cs1; // Cs1
	@FXML
	public ImageView Ds1; // Ds1
	@FXML
	public ImageView Fs1; // Fs1
	@FXML
	public ImageView Gs1; // Gs1
	@FXML
	public ImageView As1; // As1
	@FXML
	public ImageView Cs2; // Cs2
	@FXML
	public ImageView Ds2; // Df2
	@FXML
	public ImageView Fs2; // Fs2
	@FXML public Button record;
	
	public static Boolean rec = false;
	public static String lastPressed= "A0";
	public static int notesRec=0;
	public void initialize() {
		Main.currentStage= "Xylophone";
		
		
	}
	
	public void handleReturn(ActionEvent event) { //Initialize Main.fxml
		
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.A && Main.currentStage.equals("Xylophone") ) { System.out.println("C1"); lastPressed = "C1"; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); //C1
		
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
			Main.stage.setScene(new Scene(root, 600, 600));
			Main.stage.show();
			
		}catch( IOException e ) {
			System.out.println( "Error returning to home screen." ); //output if file null
			e.printStackTrace();
		}
		
	}
	
	
	
	private void playClip(String note) {
		String name="/xyloNote/Mallet"+note+".wav";
		 URL resource = getClass().getResource(name);
		  AudioClip n = new AudioClip( resource.toString() );
		n.play(3.0);
		
	}
	
	@FXML private void handleRec() throws ClassNotFoundException {
		notesRec=0;
		rec ^= true;
		System.out.println(rec);
		
		if(rec == true) {
			Thread re = new Thread(new Record()); re.start();
			System.out.println("Rec start");
		}
		
	}
	
	@FXML private void handlePlay() throws ClassNotFoundException {
		
		System.out.println("play");
		
		Thread play = new Thread(new PlayRecording()); play.start();
			System.out.println("Rec start");
		}
		
	
	
	@FXML private void handleC() throws ClassNotFoundException { notesRec++;  lastPressed = "C1"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
		
	
	
	

	
	@FXML private void handleD() throws ClassNotFoundException { notesRec++; lastPressed = "D1"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleE() throws ClassNotFoundException { notesRec++; lastPressed = "E1"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	
	@FXML private void handleF() throws ClassNotFoundException { notesRec++; lastPressed = "F1"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleG() throws ClassNotFoundException { notesRec++; lastPressed = "G1"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleA() throws ClassNotFoundException { notesRec++; lastPressed = "A1"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleB() throws ClassNotFoundException { notesRec++; lastPressed = "B1"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	
	
	
	@FXML private void handleC1() throws ClassNotFoundException { notesRec++; lastPressed = "C2"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	

	
	@FXML private void handleD1() throws ClassNotFoundException { notesRec++; lastPressed = "D2"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleE1() throws ClassNotFoundException { notesRec++; lastPressed = "E2"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	
	@FXML private void handleF1() throws ClassNotFoundException { notesRec++; lastPressed = "F2"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleG1() throws ClassNotFoundException { notesRec++; lastPressed = "G2"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleA1() throws ClassNotFoundException { notesRec++; lastPressed = "A2"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleB1() throws ClassNotFoundException { notesRec++; lastPressed = "B2"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	
	
	
	
	@FXML private void handleC2() throws ClassNotFoundException { notesRec++; lastPressed = "C3"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	

	
	@FXML private void handleD2()throws ClassNotFoundException { notesRec++; lastPressed = "D3"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleE2() throws ClassNotFoundException { notesRec++; lastPressed = "E3"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	
	@FXML private void handleF2() throws ClassNotFoundException { notesRec++; lastPressed = "F3"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleG2() throws ClassNotFoundException { notesRec++; lastPressed = "G3"; Thread object = new Thread(new Multithreadxylo()); object.start(); }

	
	@FXML private void handleCs1() throws ClassNotFoundException { notesRec++; lastPressed = "C#2"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	

	
	@FXML private void handleDs1() throws ClassNotFoundException { notesRec++; lastPressed = "D#2"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	
	@FXML private void handleFs1() throws ClassNotFoundException { notesRec++; lastPressed = "F#2"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleGs1() throws ClassNotFoundException { notesRec++;  lastPressed = "G#2"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleAs1() throws ClassNotFoundException { notesRec++; lastPressed = "A#2"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	
	@FXML private void handleCs()throws ClassNotFoundException { notesRec++; lastPressed = "C#1"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	

	
	@FXML private void handleDs()throws ClassNotFoundException { notesRec++; lastPressed = "D#1"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	
	@FXML private void handleFs() throws ClassNotFoundException { notesRec++; lastPressed = "F#1"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleGs() throws ClassNotFoundException { notesRec++; lastPressed = "G#1"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	@FXML private void handleAs() throws ClassNotFoundException { notesRec++; lastPressed = "A#1"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	
	
	@FXML private void handleCs2() throws ClassNotFoundException { notesRec++; lastPressed = "C#3"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	

	
	@FXML private void handleDs2() throws ClassNotFoundException { notesRec++; lastPressed = "D#3"; Thread object = new Thread(new Multithreadxylo()); object.start(); }
	
	@FXML private void handleFs3() throws ClassNotFoundException { notesRec++; lastPressed = "F#3"; Thread object = new Thread(new Multithreadxylo()); object.start(); }

	
}