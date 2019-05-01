/**
 * Include updated @author tag.
 */
package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import application.Main;
import application.model.MultithreadingInstance;
import application.model.Multithreadkalimba;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.AudioClip;

public class KalimbaController {

	@FXML
	public ImageView imgKalimbaC4; // C
	@FXML
	public ImageView imgKalimbaD4; // D
	@FXML
	public ImageView imgKalimbaE4; // E
	@FXML
	public ImageView imgKalimbaFS4; // F
	@FXML
	public ImageView imgKalimbaG4; // G
	@FXML
	public ImageView imgKalimbaA4; // A
	@FXML
	public ImageView imgKalimbaB4; // B
	@FXML
	public ImageView imgKalimbaC5; // C
	@FXML
	public ImageView imgKalimbaD5; // D
	@FXML
	public ImageView imgKalimbaE5; // E
	@FXML
	public ImageView imgKalimbaFS5; // F
	@FXML
	public ImageView imgKalimbaG5; // G
	@FXML
	public ImageView imgKalimbaA5; // A
	@FXML
	public ImageView imgKalimbaB5; // B
	@FXML
	public ImageView imgKalimbaC6; // C
	@FXML
	public ImageView imgKalimbaD6; // D
	@FXML
	public ImageView imgKalimbaE6; // E
	@FXML
	public ImageView imgKeyboardA;
	@FXML
	public ImageView imgKeyboardS;
	@FXML
	public ImageView imgKeyboardD;
	@FXML
	public ImageView imgKeyboardF;
	@FXML
	public ImageView imgKeyboardG;
	@FXML
	public ImageView imgKeyboardH;
	@FXML
	public ImageView imgKeyboardJ;
	@FXML
	public ImageView imgKeyboardK;
	@FXML
	public ImageView imgKeyboardL;
	@FXML
	public ImageView imgKeyboardQ;
	@FXML
	public ImageView imgKeyboardW;
	@FXML
	public ImageView imgKeyboardE;
	@FXML
	public ImageView imgKeyboardR;
	@FXML
	public ImageView imgKeyboardT;
	@FXML
	public ImageView imgKeyboardY;
	@FXML
	public ImageView imgKeyboardU;
	@FXML
	public ImageView imgKeyboardI;
	@FXML 
	public ImageView imgKeyboardO;
	@FXML
	public ImageView imgKeyboardP;
	@FXML public  Button play;
	@FXML public Button record;
	@FXML public  TextField playName;
	@FXML public  TextField recordName;
	@FXML public  TextArea listOfSaves;
	
	public static String finame="";
	public static Boolean pla = false;
	public static Boolean rec = false;
	public static String lastPressed= "A0";
	public static int notesRec=0;
	public void initialize() {
		
		
		Main.currentStage= "Kalimba";
		File folder = new File("data/kalim_saves");
		File[] list = folder.listFiles();
        String listf="";
		for (int i = 0; i < list.length; i++) {
		  if (list[i].isFile()) {
		    listf+=list[i].getName()+"\n";
		  } 
		listOfSaves.setText(listf);
		  
		}
		
		
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.A && Main.currentStage.equals("Kalimba") ) { System.out.println("F2"); lastPressed = "F2"; notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.S && Main.currentStage.equals("Kalimba") ) { System.out.println("G2"); lastPressed = "G2"; notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.D && Main.currentStage.equals("Kalimba") ) { System.out.println("A2"); lastPressed = "A2"; notesRec++;Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.F && Main.currentStage.equals("Kalimba") ) { System.out.println("B2"); lastPressed = "B2";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.G && Main.currentStage.equals("Kalimba") ) { System.out.println("C3"); lastPressed = "C3";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.H && Main.currentStage.equals("Kalimba") ) { System.out.println("D3"); lastPressed = "D3";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.J && Main.currentStage.equals("Kalimba") ) { System.out.println("E3"); lastPressed = "E3"; notesRec++;Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.K && Main.currentStage.equals("Kalimba") ) { System.out.println("F3"); lastPressed = "F3";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.L && Main.currentStage.equals("Kalimba") ) { System.out.println("G3"); lastPressed = "G3";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Q && Main.currentStage.equals("Kalimba") ) { System.out.println("C1"); lastPressed = "C1"; notesRec++;Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.W && Main.currentStage.equals("Kalimba") ) { System.out.println("D1"); lastPressed = "D1";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.E && Main.currentStage.equals("Kalimba") ) { System.out.println("E1"); lastPressed = "E1";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.R && Main.currentStage.equals("Kalimba") ) { System.out.println("F1"); lastPressed = "F1";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.T && Main.currentStage.equals("Kalimba") ) { System.out.println("G1"); lastPressed = "G1"; notesRec++;Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Y && Main.currentStage.equals("Kalimba") ) { System.out.println("A1"); lastPressed = "A1";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.U && Main.currentStage.equals("Kalimba") ) { System.out.println("B1"); lastPressed = "B1"; notesRec++;Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.I && Main.currentStage.equals("Kalimba") ) { System.out.println("C2"); lastPressed = "C2";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.O && Main.currentStage.equals("Kalimba") ) { System.out.println("D2"); lastPressed = "D2";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.P && Main.currentStage.equals("Kalimba") ) { System.out.println("E2"); lastPressed = "E2";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Z && Main.currentStage.equals("Kalimba") ) { System.out.println("C#1"); lastPressed = "C#1";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.C && Main.currentStage.equals("Kalimba") ) { System.out.println("F#1"); lastPressed = "F#1";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.X && Main.currentStage.equals("Kalimba") ) { System.out.println("D#1"); lastPressed = "D#1";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.V && Main.currentStage.equals("Kalimba") ) { System.out.println("G#1"); lastPressed = "G#1";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.B && Main.currentStage.equals("Kalimba") ) { System.out.println("A#1"); lastPressed = "A#1";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.N && Main.currentStage.equals("Kalimba") ) { System.out.println("C#2"); lastPressed = "C#2";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.M && Main.currentStage.equals("Kalimba") ) { System.out.println("D#2"); lastPressed = "D#2";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.COMMA && Main.currentStage.equals("Kalimba") ) { System.out.println("F#2"); lastPressed = "F#2";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.PERIOD && Main.currentStage.equals("Kalimba") ) { System.out.println("G#2"); lastPressed = "G#2";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.SLASH && Main.currentStage.equals("Kalimba") ) { System.out.println("A#2"); lastPressed = "A#2";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.SEMICOLON && Main.currentStage.equals("Kalimba") ) { System.out.println("C#3"); lastPressed = "C#3";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.QUOTE && Main.currentStage.equals("Kalimba") ) { System.out.println("D#3"); lastPressed = "D#3";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.OPEN_BRACKET && Main.currentStage.equals("Kalimba") ) { System.out.println("F#3"); lastPressed = "F#3";notesRec++; Thread object = new Thread(new Multithreadkalimba()); object.start(); } }); 
		
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
		record.setText("Stop");
		System.out.println(rec);
		System.out.println(finame);
		if(rec == true) {
			finame = recordName.getText();
			Thread re = new Thread(new Record()); re.start();
			System.out.println("Rec start");
			
		}
		else if (rec == false) {
			record.setText("Record");
			File folder = new File("data/kalim_saves");
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
		pla ^= true;
		if(pla==true) {
		finame = playName.getText();
		System.out.println("play");
		play.setText("Stop");
		Thread play = new Thread(new PlayRecording()); play.start();
			System.out.println("Play start");
		}
		else if(pla==false) {
			play.setText("Play");
		}
	}
	
	@FXML private void handleD6_entered() throws ClassNotFoundException { imgKeyboardA.setImage(new Image("keys/color2.png")); imgKalimbaD6.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD6_exited() throws ClassNotFoundException { imgKeyboardA.setImage(new Image("keys/color.png")); imgKalimbaD6.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleD6_clicked() throws ClassNotFoundException { lastPressed = "D6"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleG5_entered() throws ClassNotFoundException { imgKeyboardS.setImage(new Image("keys/color2.png")); imgKalimbaG5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG5_exited() throws ClassNotFoundException { imgKeyboardS.setImage(new Image("keys/color.png")); imgKalimbaG5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleG5_clicked() throws ClassNotFoundException { lastPressed = "G5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleC5_entered() throws ClassNotFoundException { imgKeyboardD.setImage(new Image("keys/color2.png")); imgKalimbaC5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleC5_exited() throws ClassNotFoundException { imgKeyboardD.setImage(new Image("keys/color.png")); imgKalimbaC5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleC5_clicked() throws ClassNotFoundException { lastPressed = "C5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleFS4_entered() throws ClassNotFoundException { imgKeyboardF.setImage(new Image("keys/color2.png")); imgKalimbaFS4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleFS4_exited() throws ClassNotFoundException { imgKeyboardF.setImage(new Image("keys/color.png")); imgKalimbaFS4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleFS4_clicked() throws ClassNotFoundException { lastPressed = "FS4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleC4_entered() throws ClassNotFoundException { imgKeyboardG.setImage(new Image("keys/color2.png")); imgKalimbaC4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleC4_exited() throws ClassNotFoundException { imgKeyboardG.setImage(new Image("keys/color.png")); imgKalimbaC4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleC4_clicked() throws ClassNotFoundException { lastPressed = "C4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleG4_entered() throws ClassNotFoundException { imgKeyboardH.setImage(new Image("keys/color2.png")); imgKalimbaG4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG4_exited() throws ClassNotFoundException { imgKeyboardH.setImage(new Image("keys/color.png")); imgKalimbaG4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleG4_clicked() throws ClassNotFoundException { lastPressed = "G4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleD5_entered() throws ClassNotFoundException { imgKeyboardJ.setImage(new Image("keys/color2.png")); imgKalimbaD5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD5_exited() throws ClassNotFoundException { imgKeyboardJ.setImage(new Image("keys/color.png")); imgKalimbaD5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleD5_clicked() throws ClassNotFoundException { lastPressed = "D5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleA5_entered() throws ClassNotFoundException { imgKeyboardK.setImage(new Image("keys/color2.png")); imgKalimbaA5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleA5_exited() throws ClassNotFoundException { imgKeyboardK.setImage(new Image("keys/color.png")); imgKalimbaA5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleA5_clicked() throws ClassNotFoundException { lastPressed = "A5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleE6_entered() throws ClassNotFoundException { imgKeyboardL.setImage(new Image("keys/color2.png")); imgKalimbaE6.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE6_exited() throws ClassNotFoundException { imgKeyboardL.setImage(new Image("keys/color.png")); imgKalimbaE6.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleE6_clicked() throws ClassNotFoundException { lastPressed = "E6"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleB5_entered() throws ClassNotFoundException { imgKeyboardW.setImage(new Image("keys/color2.png")); imgKalimbaB5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleB5_exited() throws ClassNotFoundException { imgKeyboardW.setImage(new Image("keys/color.png")); imgKalimbaB5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleB5_clicked() throws ClassNotFoundException { lastPressed = "B5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleE5_entered() throws ClassNotFoundException { imgKeyboardE.setImage(new Image("keys/color2.png")); imgKalimbaE5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE5_exited() throws ClassNotFoundException { imgKeyboardE.setImage(new Image("keys/color.png")); imgKalimbaE5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleE5_clicked() throws ClassNotFoundException { lastPressed = "E5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleA4_entered() throws ClassNotFoundException { imgKeyboardR.setImage(new Image("keys/color2.png")); imgKalimbaA4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleA4_exited() throws ClassNotFoundException { imgKeyboardR.setImage(new Image("keys/color.png")); imgKalimbaA4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleA4_clicked() throws ClassNotFoundException { lastPressed = "A4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleD4_entered() throws ClassNotFoundException { imgKeyboardT.setImage(new Image("keys/color2.png")); imgKalimbaD4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD4_exited() throws ClassNotFoundException { imgKeyboardT.setImage(new Image("keys/color.png")); imgKalimbaD4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleD4_clicked() throws ClassNotFoundException { lastPressed = "D4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleE4_entered() throws ClassNotFoundException { imgKeyboardY.setImage(new Image("keys/color2.png")); imgKalimbaE4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE4_exited() throws ClassNotFoundException { imgKeyboardY.setImage(new Image("keys/color.png")); imgKalimbaE4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleE4_clicked() throws ClassNotFoundException { lastPressed = "E4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleB4_entered() throws ClassNotFoundException { imgKeyboardU.setImage(new Image("keys/color2.png")); imgKalimbaB4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleB4_exited() throws ClassNotFoundException { imgKeyboardU.setImage(new Image("keys/color.png")); imgKalimbaB4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleB4_clicked() throws ClassNotFoundException { lastPressed = "B4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleFS5_entered() throws ClassNotFoundException { imgKeyboardI.setImage(new Image("keys/color2.png")); imgKalimbaFS5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleFS5_exited() throws ClassNotFoundException { imgKeyboardI.setImage(new Image("keys/color.png")); imgKalimbaFS5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleFS5_clicked() throws ClassNotFoundException { lastPressed = "FS5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleC6_entered() throws ClassNotFoundException { imgKeyboardO.setImage(new Image("keys/color2.png")); imgKalimbaC6.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleC6_exited() throws ClassNotFoundException { imgKeyboardO.setImage(new Image("keys/color.png")); imgKalimbaC6.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleC6_clicked() throws ClassNotFoundException { lastPressed = "C6"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleA_entered() throws ClassNotFoundException { imgKeyboardA.setImage(new Image("keys/color2.png")); imgKalimbaD6.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleA_exited() throws ClassNotFoundException { imgKeyboardA.setImage(new Image("keys/color.png")); imgKalimbaD6.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleA_clicked() throws ClassNotFoundException { lastPressed = "D6"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleS_entered() throws ClassNotFoundException { imgKeyboardS.setImage(new Image("keys/color2.png")); imgKalimbaG5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleS_exited() throws ClassNotFoundException { imgKeyboardS.setImage(new Image("keys/color.png")); imgKalimbaG5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleS_clicked() throws ClassNotFoundException { lastPressed = "G5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleD_entered() throws ClassNotFoundException { imgKeyboardD.setImage(new Image("keys/color2.png")); imgKalimbaC5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD_exited() throws ClassNotFoundException { imgKeyboardD.setImage(new Image("keys/color.png")); imgKalimbaC5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleD_clicked() throws ClassNotFoundException { lastPressed = "C5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleF_entered() throws ClassNotFoundException { imgKeyboardF.setImage(new Image("keys/color2.png")); imgKalimbaFS4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleF_exited() throws ClassNotFoundException { imgKeyboardF.setImage(new Image("keys/color.png")); imgKalimbaFS4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleF_clicked() throws ClassNotFoundException { lastPressed = "FS4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleG_entered() throws ClassNotFoundException { imgKeyboardG.setImage(new Image("keys/color2.png")); imgKalimbaC4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG_exited() throws ClassNotFoundException { imgKeyboardG.setImage(new Image("keys/color.png")); imgKalimbaC4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleG_clicked() throws ClassNotFoundException { lastPressed = "C4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleH_entered() throws ClassNotFoundException { imgKeyboardH.setImage(new Image("keys/color2.png")); imgKalimbaG4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleH_exited() throws ClassNotFoundException { imgKeyboardH.setImage(new Image("keys/color.png")); imgKalimbaG4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleH_clicked() throws ClassNotFoundException { lastPressed = "G4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleJ_entered() throws ClassNotFoundException { imgKeyboardJ.setImage(new Image("keys/color2.png")); imgKalimbaD5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleJ_exited() throws ClassNotFoundException { imgKeyboardJ.setImage(new Image("keys/color.png")); imgKalimbaD5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleJ_clicked() throws ClassNotFoundException { lastPressed = "D5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleK_entered() throws ClassNotFoundException { imgKeyboardK.setImage(new Image("keys/color2.png")); imgKalimbaA5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleK_exited() throws ClassNotFoundException { imgKeyboardK.setImage(new Image("keys/color.png")); imgKalimbaA5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleK_clicked() throws ClassNotFoundException { lastPressed = "A5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleL_entered() throws ClassNotFoundException { imgKeyboardL.setImage(new Image("keys/color2.png")); imgKalimbaE6.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleL_exited() throws ClassNotFoundException { imgKeyboardL.setImage(new Image("keys/color.png")); imgKalimbaE6.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleL_clicked() throws ClassNotFoundException { lastPressed = "E6"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleQ_entered() throws ClassNotFoundException { imgKeyboardQ.setImage(new Image("keys/color2.png")); }
	@FXML private void handleQ_exited() throws ClassNotFoundException { imgKeyboardQ.setImage(new Image("keys/color.png"));  }
	
	@FXML private void handleW_entered() throws ClassNotFoundException { imgKeyboardW.setImage(new Image("keys/color2.png")); imgKalimbaB5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleW_exited() throws ClassNotFoundException { imgKeyboardW.setImage(new Image("keys/color.png")); imgKalimbaB5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleW_clicked() throws ClassNotFoundException { lastPressed = "B5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleE_entered() throws ClassNotFoundException { imgKeyboardE.setImage(new Image("keys/color2.png")); imgKalimbaE5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE_exited() throws ClassNotFoundException { imgKeyboardE.setImage(new Image("keys/color.png")); imgKalimbaE5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleE_clicked() throws ClassNotFoundException { lastPressed = "E5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleR_entered() throws ClassNotFoundException { imgKeyboardR.setImage(new Image("keys/color2.png")); imgKalimbaA4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleR_exited() throws ClassNotFoundException { imgKeyboardR.setImage(new Image("keys/color.png")); imgKalimbaA4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleR_clicked() throws ClassNotFoundException { lastPressed = "A4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleT_entered() throws ClassNotFoundException { imgKeyboardT.setImage(new Image("keys/color2.png")); imgKalimbaD4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleT_exited() throws ClassNotFoundException { imgKeyboardT.setImage(new Image("keys/color.png")); imgKalimbaD4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleT_clicked() throws ClassNotFoundException { lastPressed = "D4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleY_entered() throws ClassNotFoundException { imgKeyboardY.setImage(new Image("keys/color2.png")); imgKalimbaE4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleY_exited() throws ClassNotFoundException { imgKeyboardY.setImage(new Image("keys/color.png")); imgKalimbaE4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleY_clicked() throws ClassNotFoundException { lastPressed = "E4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleU_entered() throws ClassNotFoundException { imgKeyboardU.setImage(new Image("keys/color2.png")); imgKalimbaB4.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleU_exited() throws ClassNotFoundException { imgKeyboardU.setImage(new Image("keys/color.png")); imgKalimbaB4.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleU_clicked() throws ClassNotFoundException { lastPressed = "B4"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleI_entered() throws ClassNotFoundException { imgKeyboardI.setImage(new Image("keys/color2.png")); imgKalimbaFS5.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleI_exited() throws ClassNotFoundException { imgKeyboardI.setImage(new Image("keys/color.png")); imgKalimbaFS5.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleI_clicked() throws ClassNotFoundException { lastPressed = "FS5"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleO_entered() throws ClassNotFoundException { imgKeyboardO.setImage(new Image("keys/color2.png")); imgKalimbaC6.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleO_exited() throws ClassNotFoundException { imgKeyboardO.setImage(new Image("keys/color.png")); imgKalimbaC6.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleO_clicked() throws ClassNotFoundException { lastPressed = "C6"; notesRec++; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleP_entered() throws ClassNotFoundException { imgKeyboardP.setImage(new Image("keys/color2.png"));}
	@FXML private void handleP_exited() throws ClassNotFoundException { imgKeyboardP.setImage(new Image("keys/color.png"));}
}