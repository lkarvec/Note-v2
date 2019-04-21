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
import application.model.MultithreadingInstance;
import application.model.Multithreadxylo;
import application.model.PlayRecording;
import application.model.Record;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
	@FXML public  TextField playName;
	@FXML public  TextField recordName;
	@FXML public  TextArea listOfSaves;
	
	public static String finame="";
	public static Boolean rec = false;
	public static String lastPressed= "A0";
	public static int notesRec=0;
	public void initialize() {
		
		
		Main.currentStage= "Xylophone";
		File folder = new File("saves");
		File[] list = folder.listFiles();
        String listf="";
		for (int i = 0; i < list.length; i++) {
		  if (list[i].isFile()) {
		    listf+=list[i].getName()+"\n";
		  } 
		listOfSaves.setText(listf);
		  
		}
		
		
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.A && Main.currentStage.equals("Xylophone") ) { System.out.println("F2"); lastPressed = "F2"; notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.S && Main.currentStage.equals("Xylophone") ) { System.out.println("G2"); lastPressed = "G2"; notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.D && Main.currentStage.equals("Xylophone") ) { System.out.println("A2"); lastPressed = "A2"; notesRec++;Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.F && Main.currentStage.equals("Xylophone") ) { System.out.println("B2"); lastPressed = "B2";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.G && Main.currentStage.equals("Xylophone") ) { System.out.println("C3"); lastPressed = "C3";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.H && Main.currentStage.equals("Xylophone") ) { System.out.println("D3"); lastPressed = "D3";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.J && Main.currentStage.equals("Xylophone") ) { System.out.println("E3"); lastPressed = "E3"; notesRec++;Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.K && Main.currentStage.equals("Xylophone") ) { System.out.println("F3"); lastPressed = "F3";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.L && Main.currentStage.equals("Xylophone") ) { System.out.println("G3"); lastPressed = "G3";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Q && Main.currentStage.equals("Xylophone") ) { System.out.println("C1"); lastPressed = "C1"; notesRec++;Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.W && Main.currentStage.equals("Xylophone") ) { System.out.println("D1"); lastPressed = "D1";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.E && Main.currentStage.equals("Xylophone") ) { System.out.println("E1"); lastPressed = "E1";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.R && Main.currentStage.equals("Xylophone") ) { System.out.println("F1"); lastPressed = "F1";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.T && Main.currentStage.equals("Xylophone") ) { System.out.println("G1"); lastPressed = "G1"; notesRec++;Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Y && Main.currentStage.equals("Xylophone") ) { System.out.println("A1"); lastPressed = "A1";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.U && Main.currentStage.equals("Xylophone") ) { System.out.println("B1"); lastPressed = "B1"; notesRec++;Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.I && Main.currentStage.equals("Xylophone") ) { System.out.println("C2"); lastPressed = "C2";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.O && Main.currentStage.equals("Xylophone") ) { System.out.println("D2"); lastPressed = "D2";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.P && Main.currentStage.equals("Xylophone") ) { System.out.println("E2"); lastPressed = "E2";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Z && Main.currentStage.equals("Xylophone") ) { System.out.println("C#1"); lastPressed = "C#1";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.C && Main.currentStage.equals("Xylophone") ) { System.out.println("F#1"); lastPressed = "F#1";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.X && Main.currentStage.equals("Xylophone") ) { System.out.println("D#1"); lastPressed = "D#1";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.V && Main.currentStage.equals("Xylophone") ) { System.out.println("G#1"); lastPressed = "G#1";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.B && Main.currentStage.equals("Xylophone") ) { System.out.println("A#1"); lastPressed = "A#1";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.N && Main.currentStage.equals("Xylophone") ) { System.out.println("C#2"); lastPressed = "C#2";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.M && Main.currentStage.equals("Xylophone") ) { System.out.println("D#2"); lastPressed = "D#2";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.COMMA && Main.currentStage.equals("Xylophone") ) { System.out.println("F#2"); lastPressed = "F#2";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.PERIOD && Main.currentStage.equals("Xylophone") ) { System.out.println("G#2"); lastPressed = "G#2";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.SLASH && Main.currentStage.equals("Xylophone") ) { System.out.println("A#2"); lastPressed = "A#2";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.SEMICOLON && Main.currentStage.equals("Xylophone") ) { System.out.println("C#3"); lastPressed = "C#3";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.QUOTE && Main.currentStage.equals("Xylophone") ) { System.out.println("D#3"); lastPressed = "D#3";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.OPEN_BRACKET && Main.currentStage.equals("Xylophone") ) { System.out.println("F#3"); lastPressed = "F#3";notesRec++; Thread object = new Thread(new Multithreadxylo()); object.start(); } }); 
		
	}
	
	public void handleReturn(ActionEvent event) { //Initialize Main.fxml
		
		
		
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
		System.out.println(finame);
		if(rec == true) {
			finame = recordName.getText();
			Thread re = new Thread(new Record()); re.start();
			System.out.println("Rec start");
			
		}
		else if (rec == false) {
			File folder = new File("saves");
			File[] list = folder.listFiles();
	        String listf="";
			for (int i = 0; i < list.length; i++) {
			  if (list[i].isFile()) {
			    listf+=list[i].getName()+"\n";
			  } 
			listOfSaves.setText(listf);
			  
			}
		}
		
	}
	
	@FXML private void handlePlay() throws ClassNotFoundException {
		finame = playName.getText();
		System.out.println("play");
		
		Thread play = new Thread(new PlayRecording()); play.start();
			System.out.println("Play start");
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