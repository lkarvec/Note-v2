/**
 * 	@author Christopher Tyler (tbl512), Alexander Mains (rta149), Mark Dziuk (kvf069)
 * 	UTSA CS 3443 - Final Project
 * 	Spring 2019
 */
package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import application.Main;
import application.model.MultithreadingXylo;
import application.model.XyloPlay;
import application.model.XyloRecord;
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

public class XylophoneController {
	/**
	 * the image views for the keys of the xylophone
	 */
	public ImageView C; // C
	public ImageView D; // D
	public ImageView E; // E
	public ImageView F; // F
	public ImageView G; // G
	public ImageView A; // A
	public ImageView B; // B
	public ImageView C1; // C1
	public ImageView D1; // D1
	public ImageView E1; // E1
	public ImageView F1; // F1
	public ImageView G1; // G1
	public ImageView A1; // A1
	public ImageView B1; // B1
	public ImageView C2; // C2
	public ImageView D2; // D2
	public ImageView E2; // E2
	public ImageView F2; // F2
	public ImageView G2; // G2
	public ImageView A2; // A2
	public ImageView B2; // B2
	public ImageView Cs; // Cs
	public ImageView Ds; // Ds
	public ImageView Fs; // Fs
	public ImageView Gs; // Gs
	public ImageView As; // As
	public ImageView Cs1; // Cs1
	public ImageView Ds1; // Ds1
	public ImageView Fs1; // Fs1
	public ImageView Gs1; // Gs1
	public ImageView As1; // As1
	public ImageView Cs2; // Cs2
	public ImageView Ds2; // Df2
	public ImageView Fs3; // Fs2
	public Button play;
	public Button record;
	public TextField playName;
	public TextField recordName;
	public TextArea listOfSaves;
	
	public static String finame="";
	public static Boolean pla = false;
	public static Boolean rec = false;
	public static String lastPressed= "A0";
	public static int notesRec=0;
	/**
	 * When initialized the current stage is changed and the view is updated with a current list of files in the folder
	 */
	public void initialize() {
		
		
		Main.currentStage= "Xylophone";
		File folder = new File("data/xylo_saves");
		File[] list = folder.listFiles();
        String listf="";
		for (int i = 0; i < list.length; i++) {
		  if (list[i].isFile()) {
		    listf+=list[i].getName()+"\n";
		  } 
		listOfSaves.setText(listf);
		  
		}
		
		/**
		 * these handlers checks for key presses and if the correct button is pressed the note plays.
		 */
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.A && Main.currentStage.equals("Xylophone") ) { System.out.println("F2"); lastPressed = "F2"; notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.S && Main.currentStage.equals("Xylophone") ) { System.out.println("G2"); lastPressed = "G2"; notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.D && Main.currentStage.equals("Xylophone") ) { System.out.println("A2"); lastPressed = "A2"; notesRec++;Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.F && Main.currentStage.equals("Xylophone") ) { System.out.println("B2"); lastPressed = "B2";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.G && Main.currentStage.equals("Xylophone") ) { System.out.println("C3"); lastPressed = "C3";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.H && Main.currentStage.equals("Xylophone") ) { System.out.println("D3"); lastPressed = "D3";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.J && Main.currentStage.equals("Xylophone") ) { System.out.println("E3"); lastPressed = "E3"; notesRec++;Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.K && Main.currentStage.equals("Xylophone") ) { System.out.println("F3"); lastPressed = "F3";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.L && Main.currentStage.equals("Xylophone") ) { System.out.println("G3"); lastPressed = "G3";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Q && Main.currentStage.equals("Xylophone") ) { System.out.println("C1"); lastPressed = "C1"; notesRec++;Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.W && Main.currentStage.equals("Xylophone") ) { System.out.println("D1"); lastPressed = "D1";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.E && Main.currentStage.equals("Xylophone") ) { System.out.println("E1"); lastPressed = "E1";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.R && Main.currentStage.equals("Xylophone") ) { System.out.println("F1"); lastPressed = "F1";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.T && Main.currentStage.equals("Xylophone") ) { System.out.println("G1"); lastPressed = "G1"; notesRec++;Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Y && Main.currentStage.equals("Xylophone") ) { System.out.println("A1"); lastPressed = "A1";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.U && Main.currentStage.equals("Xylophone") ) { System.out.println("B1"); lastPressed = "B1"; notesRec++;Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.I && Main.currentStage.equals("Xylophone") ) { System.out.println("C2"); lastPressed = "C2";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.O && Main.currentStage.equals("Xylophone") ) { System.out.println("D2"); lastPressed = "D2";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.P && Main.currentStage.equals("Xylophone") ) { System.out.println("E2"); lastPressed = "E2";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Z && Main.currentStage.equals("Xylophone") ) { System.out.println("C#1"); lastPressed = "C#1";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.C && Main.currentStage.equals("Xylophone") ) { System.out.println("F#1"); lastPressed = "F#1";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.X && Main.currentStage.equals("Xylophone") ) { System.out.println("D#1"); lastPressed = "D#1";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.V && Main.currentStage.equals("Xylophone") ) { System.out.println("G#1"); lastPressed = "G#1";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.B && Main.currentStage.equals("Xylophone") ) { System.out.println("A#1"); lastPressed = "A#1";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.N && Main.currentStage.equals("Xylophone") ) { System.out.println("C#2"); lastPressed = "C#2";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.M && Main.currentStage.equals("Xylophone") ) { System.out.println("D#2"); lastPressed = "D#2";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.COMMA && Main.currentStage.equals("Xylophone") ) { System.out.println("F#2"); lastPressed = "F#2";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.PERIOD && Main.currentStage.equals("Xylophone") ) { System.out.println("G#2"); lastPressed = "G#2";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.SLASH && Main.currentStage.equals("Xylophone") ) { System.out.println("A#2"); lastPressed = "A#2";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.SEMICOLON && Main.currentStage.equals("Xylophone") ) { System.out.println("C#3"); lastPressed = "C#3";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.QUOTE && Main.currentStage.equals("Xylophone") ) { System.out.println("D#3"); lastPressed = "D#3";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.OPEN_BRACKET && Main.currentStage.equals("Xylophone") ) { System.out.println("F#3"); lastPressed = "F#3";notesRec++; Thread object = new Thread(new MultithreadingXylo()); object.start(); } }); 
		
	}
	/**
	 * returns to the main controller when return button is pressed
	 * @param event
	 */
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
	/**
	 * handles the record functionality of the Xylophone
	 * @throws ClassNotFoundException
	 */
	@FXML private void handleRec() throws ClassNotFoundException {
		notesRec=0;
		rec ^= true;
		record.setText("Stop");
		System.out.println(rec);
		System.out.println(finame);
		if(rec == true) {
			finame = recordName.getText();
			Thread re = new Thread(new XyloRecord()); re.start();
			System.out.println("Rec start");
			
		}
		else if (rec == false) {
			record.setText("Record");
			File folder = new File("data/xylo_saves");
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
	/**
	 * handles the play function of the Xylophone
	 * callsMultilthreadingXylo
	 * @throws ClassNotFoundException
	 */
	@FXML private void handlePlay() throws ClassNotFoundException {
		pla ^= true;
		if(pla==true) {
		finame = playName.getText();
		System.out.println("play");
		play.setText("Stop");
		Thread play = new Thread(new XyloPlay()); play.start();
			System.out.println("Play start");
		}
		else if(pla==false) {
			play.setText("Play");
		}
	}
	
	/**
	 * These are the handlers for mouse hover and click
	 * when the mouse is on the key it changes the color to respond to the user. when clicked it plays the note.
	 * 
	 * @throws ClassNotFoundException
	 */
	@FXML private void handleC() throws ClassNotFoundException { notesRec++;  lastPressed = "C1"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleC1_entered() throws ClassNotFoundException { C.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleC1_exited() throws ClassNotFoundException { C.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleD() throws ClassNotFoundException { notesRec++; lastPressed = "D1"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleD1_entered() throws ClassNotFoundException { D.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleD1_exited() throws ClassNotFoundException { D.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleE() throws ClassNotFoundException { notesRec++; lastPressed = "E1"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleE1_entered() throws ClassNotFoundException { E.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleE1_exited() throws ClassNotFoundException { E.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleF() throws ClassNotFoundException { notesRec++; lastPressed = "F1"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleF1_entered() throws ClassNotFoundException { F.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleF1_exited() throws ClassNotFoundException { F.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleG() throws ClassNotFoundException { notesRec++; lastPressed = "G1"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleG1_entered() throws ClassNotFoundException { G.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleG1_exited() throws ClassNotFoundException { G.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleA() throws ClassNotFoundException { notesRec++; lastPressed = "A1"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleA1_entered() throws ClassNotFoundException { A.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleA1_exited() throws ClassNotFoundException { A.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleB() throws ClassNotFoundException { notesRec++; lastPressed = "B1"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleB1_entered() throws ClassNotFoundException { B.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleB1_exited() throws ClassNotFoundException { B.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleC1() throws ClassNotFoundException { notesRec++; lastPressed = "C2"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleC2_entered() throws ClassNotFoundException { C1.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleC2_exited() throws ClassNotFoundException { C1.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleD1() throws ClassNotFoundException { notesRec++; lastPressed = "D2"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleD2_entered() throws ClassNotFoundException { D1.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleD2_exited() throws ClassNotFoundException { D1.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleE1() throws ClassNotFoundException { notesRec++; lastPressed = "E2"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }	
	@FXML private void handleE2_entered() throws ClassNotFoundException { E1.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleE2_exited() throws ClassNotFoundException { E1.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleF1() throws ClassNotFoundException { notesRec++; lastPressed = "F2"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleF2_entered() throws ClassNotFoundException { F1.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleF2_exited() throws ClassNotFoundException { F1.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleG1() throws ClassNotFoundException { notesRec++; lastPressed = "G2"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleG2_entered() throws ClassNotFoundException { G1.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleG2_exited() throws ClassNotFoundException { G1.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleA1() throws ClassNotFoundException { notesRec++; lastPressed = "A2"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleA2_entered() throws ClassNotFoundException { A1.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleA2_exited() throws ClassNotFoundException { A1.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleB1() throws ClassNotFoundException { notesRec++; lastPressed = "B2"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleB2_entered() throws ClassNotFoundException { B1.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleB2_exited() throws ClassNotFoundException { B1.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleC2() throws ClassNotFoundException { notesRec++; lastPressed = "C3"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleC3_entered() throws ClassNotFoundException { C2.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleC3_exited() throws ClassNotFoundException { C2.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleD2()throws ClassNotFoundException { notesRec++; lastPressed = "D3"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleD3_entered() throws ClassNotFoundException { D2.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleD3_exited() throws ClassNotFoundException { D2.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleE2() throws ClassNotFoundException { notesRec++; lastPressed = "E3"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }	
	@FXML private void handleE3_entered() throws ClassNotFoundException { E2.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleE3_exited() throws ClassNotFoundException { E2.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleF2() throws ClassNotFoundException { notesRec++; lastPressed = "F3"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleF3_entered() throws ClassNotFoundException { F2.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleF3_exited() throws ClassNotFoundException { F2.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleG2() throws ClassNotFoundException { notesRec++; lastPressed = "G3"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }	
	@FXML private void handleG3_entered() throws ClassNotFoundException { G2.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleG3_exited() throws ClassNotFoundException { G2.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleCs1() throws ClassNotFoundException { notesRec++; lastPressed = "C#2"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }	
	@FXML private void handleCs2_entered() throws ClassNotFoundException { Cs1.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleCs2_exited() throws ClassNotFoundException { Cs1.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleDs1() throws ClassNotFoundException { notesRec++; lastPressed = "D#2"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }	
	@FXML private void handleDs2_entered() throws ClassNotFoundException { Ds1.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleDs2_exited() throws ClassNotFoundException { Ds1.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleFs1() throws ClassNotFoundException { notesRec++; lastPressed = "F#2"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleFs2_entered() throws ClassNotFoundException { Fs1.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleFs2_exited() throws ClassNotFoundException { Fs1.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleGs1() throws ClassNotFoundException { notesRec++;  lastPressed = "G#2"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleGs2_entered() throws ClassNotFoundException { Gs1.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleGs2_exited() throws ClassNotFoundException { Gs1.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleAs1() throws ClassNotFoundException { notesRec++; lastPressed = "A#2"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleAs2_entered() throws ClassNotFoundException { As1.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleAs2_exited() throws ClassNotFoundException { As1.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleCs()throws ClassNotFoundException { notesRec++; lastPressed = "C#1"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }	
	@FXML private void handleCs1_entered() throws ClassNotFoundException { Cs.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleCs1_exited() throws ClassNotFoundException { Cs.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleDs()throws ClassNotFoundException { notesRec++; lastPressed = "D#1"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }	
	@FXML private void handleDs1_entered() throws ClassNotFoundException { Ds.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleDs1_exited() throws ClassNotFoundException { Ds.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleFs() throws ClassNotFoundException { notesRec++; lastPressed = "F#1"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleFs1_entered() throws ClassNotFoundException { Fs.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleFs1_exited() throws ClassNotFoundException { Fs.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleGs() throws ClassNotFoundException { notesRec++; lastPressed = "G#1"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleGs1_entered() throws ClassNotFoundException { Gs.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleGs1_exited() throws ClassNotFoundException { Gs.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleAs() throws ClassNotFoundException { notesRec++; lastPressed = "A#1"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleAs1_entered() throws ClassNotFoundException { As.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleAs1_exited() throws ClassNotFoundException { As.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleCs2() throws ClassNotFoundException { notesRec++; lastPressed = "C#3"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleCs3_entered() throws ClassNotFoundException { Cs2.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleCs3_exited() throws ClassNotFoundException { Cs2.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleDs2() throws ClassNotFoundException { notesRec++; lastPressed = "D#3"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }	
	@FXML private void handleDs3_entered() throws ClassNotFoundException { Ds2.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleDs3_exited() throws ClassNotFoundException { Ds2.setImage(new Image("xylo_keys/xylokeys.png"));  }
	@FXML private void handleFs3() throws ClassNotFoundException { notesRec++; lastPressed = "F#3"; Thread object = new Thread(new MultithreadingXylo()); object.start(); }
	@FXML private void handleFs3_entered() throws ClassNotFoundException { Fs3.setImage(new Image("xylo_keys/piano_left2.png")); }
	@FXML private void handleFs3_exited() throws ClassNotFoundException { Fs3.setImage(new Image("xylo_keys/xylokeys.png"));  }
	
}