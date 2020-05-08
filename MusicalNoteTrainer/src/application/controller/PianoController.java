/**
 * 	@author Christopher Tyler (tbl512), Alexander Mains (rta149), Mark Dziuk (kvf069)
 * 	UTSA CS 3443 - Final Project
 * 	Spring 2019
 * 
 * @author Alexander Mains (rta149)
 * Spring 2020
 * 
 * Updates, added hard coding for music staff images, Adjusted the play functions to accommodate for more intricate chords
 */
package application.controller;

import application.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import application.model.MultithreadingPiano;
import application.model.PianoRecord;
import application.model.SettingsModel;
import application.model.PianoPlay;

public class PianoController {
	
	public static boolean pla = false;
	
	public TextArea listOfSaves;
	
	public ImageView imgPianoC1; // C1
	public ImageView imgPianoC2; // C2
	public ImageView imgPianoC3; // C3
	public ImageView imgPianoCD1; // CD1
	public ImageView imgPianoCD2; // CD2
	public ImageView imgPianoCD3; // CD3
	public ImageView imgPianoD1; // D1
	public ImageView imgPianoD2; // D2
	public ImageView imgPianoD3; // D3
	public ImageView imgPianoDE1; // DE1
	public ImageView imgPianoDE2; // DE2
	public ImageView imgPianoDE3; // DE3
	public ImageView imgPianoE1; // E1
	public ImageView imgPianoE2; // E2
	public ImageView imgPianoE3; // E3
	public ImageView imgPianoFG1; // FG1
	public ImageView imgPianoFG2; // FG2
	public ImageView imgPianoFG3; // FG3
	public ImageView imgPianoF1; // F1
	public ImageView imgPianoF2; // F2
	public ImageView imgPianoF3; // F3
	public ImageView imgPianoG1; // G1
	public ImageView imgPianoG2; // G2
	public ImageView imgPianoG3; // G3
	public ImageView imgPianoGA1; // GA1
	public ImageView imgPianoGA2; // GA2
	public ImageView imgPianoA1; // A1
	public ImageView imgPianoA2; // A2
	public ImageView imgPianoAB1; //AB1
	public ImageView imgPianoAB2; //AB2
	public ImageView imgPianoB1; // B1
	public ImageView imgPianoB2; // B2
	
	public ImageView imgKeyboardA;
	public ImageView imgKeyboardS;
	public ImageView imgKeyboardD;
	public ImageView imgKeyboardF;
	public ImageView imgKeyboardG;
	public ImageView imgKeyboardH;
	public ImageView imgKeyboardJ;
	public ImageView imgKeyboardK;
	public ImageView imgKeyboardL;
	public ImageView imgKeyboardQ;
	public ImageView imgKeyboardW;
	public ImageView imgKeyboardE;
	public ImageView imgKeyboardR;
	public ImageView imgKeyboardT;
	public ImageView imgKeyboardY;
	public ImageView imgKeyboardU;
	public ImageView imgKeyboardI;
	public ImageView imgKeyboardO;
	public ImageView imgKeyboardP;
	
	public ImageView staffPiano;
	// key hit/ hover staffPiano.setImage(new Image("Notes/A3Note.png"));
	// key release staffPiano.setImage(new Image("Notes/base.png"));
	
	public static boolean rec;
	public Button record;
	public Button play;
	public static int notesRec;
	public TextField recordName;
	public static String finame;
	public TextField playName;
	
	/**
	 * Handler for return button, change current stage and initiate main.fxml
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
	
	public static String lastPressed = "A0";
	
	//If recording == true, then handle should add key to string to be saved to file later.
	
	/**
	 * Initialize controller, set stage and load list of saves.
	 */
    public void initialize() throws FileNotFoundException{
    	
    	try {
    		
    		Main.currentStage = "Piano";
    		String savefolder = SettingsModel.getSaveFolder(); 
			String fileName= savefolder + "/piano_saves/";
    		File folder = new File(fileName);   //Change this to reflect the settings model changes
    		File[] list = folder.listFiles();
            String listf="";
    		for (int i = 0; i < list.length; i++) {
    		  if (list[i].isFile()) {
    		    listf+=list[i].getName()+"\n";
    		  } 
    		listOfSaves.setText(listf);
    		  
    		}

            /**
             * Event handler dump for keyboard input. Loads in new images for the staff and instruments interaction keys, while sending the Multithreaded sound player the key pressed.
             */
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.A && Main.currentStage.equals("Piano") ) { System.out.println("C3"); notesRec++; lastPressed = "C3"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardA.setImage(new Image("piano_keys/color2.png")); imgPianoC1.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("notes/C3Note.png")); } }); //C3
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.A && Main.currentStage.equals("Piano") ) { imgPianoC1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardA.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.S && Main.currentStage.equals("Piano") ) { System.out.println("D3"); notesRec++; lastPressed = "D3"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardS.setImage(new Image("piano_keys/color2.png")); imgPianoD1.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("notes/D3Note.png"));} }); //D3
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.S && Main.currentStage.equals("Piano") ) { imgPianoD1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardS.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.D && Main.currentStage.equals("Piano") ) { System.out.println("E3"); notesRec++; lastPressed = "E3"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardD.setImage(new Image("piano_keys/color2.png")); imgPianoE1.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/E3Note.png"));} }); //E3
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.D && Main.currentStage.equals("Piano") ) { imgPianoE1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardD.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.F && Main.currentStage.equals("Piano") ) { System.out.println("F3"); notesRec++; lastPressed = "F3"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardF.setImage(new Image("piano_keys/color2.png")); imgPianoF1.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/F3Note.png"));} }); //F3
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.F && Main.currentStage.equals("Piano") ) { imgPianoF1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardF.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.G && Main.currentStage.equals("Piano") ) { System.out.println("G3"); notesRec++; lastPressed = "G3"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardG.setImage(new Image("piano_keys/color2.png")); imgPianoG1.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/G3Note.png"));} }); //G3
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.G && Main.currentStage.equals("Piano") ) { imgPianoG1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardG.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.H && Main.currentStage.equals("Piano") ) { System.out.println("A3"); notesRec++; lastPressed = "A3"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardH.setImage(new Image("piano_keys/color2.png")); imgPianoA1.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/A3Note.png"));} }); //A3
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.H && Main.currentStage.equals("Piano") ) { imgPianoA1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardH.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.J && Main.currentStage.equals("Piano") ) { System.out.println("B3"); notesRec++; lastPressed = "B3"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardJ.setImage(new Image("piano_keys/color2.png")); imgPianoB1.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/B3Note.png"));} }); //B3
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.J && Main.currentStage.equals("Piano") ) { imgPianoB1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardJ.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.K && Main.currentStage.equals("Piano") ) { System.out.println("C4"); notesRec++; lastPressed = "C4"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardK.setImage(new Image("piano_keys/color2.png")); imgPianoC2.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/C4Note.png"));} }); //C4
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.K && Main.currentStage.equals("Piano") ) { imgPianoC2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardK.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.L && Main.currentStage.equals("Piano") ) { System.out.println("D4"); notesRec++; lastPressed = "D4"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardL.setImage(new Image("piano_keys/color2.png")); imgPianoD2.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/D4Note.png"));} }); //D4
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.L && Main.currentStage.equals("Piano") ) { imgPianoD2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardL.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Q && Main.currentStage.equals("Piano") ) { System.out.println("E4"); notesRec++; lastPressed = "E4"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardQ.setImage(new Image("piano_keys/color2.png")); imgPianoE2.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/E4Note.png"));} }); //E4
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.Q && Main.currentStage.equals("Piano") ) { imgPianoE2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardQ.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.W && Main.currentStage.equals("Piano") ) { System.out.println("F4"); notesRec++; lastPressed = "F4"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardW.setImage(new Image("piano_keys/color2.png")); imgPianoF2.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/F4Note.png"));} }); //F4
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.W && Main.currentStage.equals("Piano") ) { imgPianoF2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardW.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.E && Main.currentStage.equals("Piano") ) { System.out.println("G4"); notesRec++; lastPressed = "G4"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardE.setImage(new Image("piano_keys/color2.png")); imgPianoG2.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/G4Note.png"));} }); //G4
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.E && Main.currentStage.equals("Piano") ) { imgPianoG2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardE.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.R && Main.currentStage.equals("Piano") ) { System.out.println("A4"); notesRec++; lastPressed = "A4"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardR.setImage(new Image("piano_keys/color2.png")); imgPianoA2.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/A4Note.png"));} }); //A4
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.R && Main.currentStage.equals("Piano") ) { imgPianoA2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardR.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.T && Main.currentStage.equals("Piano") ) { System.out.println("B4"); notesRec++; lastPressed = "B4"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardT.setImage(new Image("piano_keys/color2.png")); imgPianoB2.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/B4Note.png"));} }); //B4
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.T && Main.currentStage.equals("Piano") ) { imgPianoB2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardT.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Y && Main.currentStage.equals("Piano") ) { System.out.println("C5"); notesRec++; lastPressed = "C5"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardY.setImage(new Image("piano_keys/color2.png")); imgPianoC3.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/C5Note.png"));} }); //C5
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.Y && Main.currentStage.equals("Piano") ) { imgPianoC3.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardY.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.U && Main.currentStage.equals("Piano") ) { System.out.println("D5"); notesRec++; lastPressed = "D5"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardU.setImage(new Image("piano_keys/color2.png")); imgPianoD3.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/D5Note.png"));} }); //D5
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.U && Main.currentStage.equals("Piano") ) { imgPianoD3.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardU.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.I && Main.currentStage.equals("Piano") ) { System.out.println("E5"); notesRec++; lastPressed = "E5"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardI.setImage(new Image("piano_keys/color2.png")); imgPianoE3.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/E5Note.png"));} }); //E5
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.I && Main.currentStage.equals("Piano") ) { imgPianoE3.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardI.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.O && Main.currentStage.equals("Piano") ) { System.out.println("F5"); notesRec++; lastPressed = "F5"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardO.setImage(new Image("piano_keys/color2.png")); imgPianoF3.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/F5Note.png"));} }); //F5
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.O && Main.currentStage.equals("Piano") ) { imgPianoF3.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardO.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.P && Main.currentStage.equals("Piano") ) { System.out.println("G5"); notesRec++; lastPressed = "G5"; Thread object = new Thread(new MultithreadingPiano()); object.start(); imgKeyboardP.setImage(new Image("piano_keys/color2.png")); imgPianoG3.setImage(new Image("piano_keys/piano_left2.png")); staffPiano.setImage(new Image("Notes/G5Note.png"));} }); //G5
    		Main.stage.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> { if(key.getCode()==KeyCode.P && Main.currentStage.equals("Piano") ) { imgPianoG3.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardP.setImage(new Image("piano_keys/color.png")); staffPiano.setImage(new Image("Notes/base.png"));} }); //C3
    		
    		
    	} catch (Exception e) { 
            System.out.println ("Exception is caught"); 
        } 
    }
    
	/**
	 * Handler for record button, initiate text file based on user input.
	 * @throws Exception 
	 */
    @FXML private void handleRecord() throws Exception {
		notesRec=0;
		 rec ^= true;
		record.setText("Stop");
		System.out.println(rec);
		System.out.println(finame);
		if(rec == true) {
			finame = recordName.getText();
			Thread re = new Thread(new PianoRecord()); re.start();
			System.out.println("Rec start");
			
		}
		else if (rec == false) {
			record.setText("Record");
			String savefolder = SettingsModel.getSaveFolder(); 
			String fileName= savefolder + "/piano_saves/";
			File folder = new File(fileName);
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
	 * Handler for play button, initiate text file based on user input, find given file.
	 * @throws ClassNotFoundException
	 */
    @FXML private void handlePlay() throws ClassNotFoundException {
		pla ^= true;
		if(pla==true) {
		finame = playName.getText();
		System.out.println("play");
		play.setText("Stop");
		Thread play = new Thread(new PianoPlay()); play.start();
			System.out.println("Play start");
		}
		else if(pla==false) {
			play.setText("Play");
		}
	}
    
    /**
     * Event handler dump for piano.  Loads in new images for the staff and instruments interaction keys, while sending the Multithreaded sound player the key pressed. 
     */
	@FXML private void handleC3_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/C3Note.png"));  imgPianoC1.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardA.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleC3_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoC1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardA.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleC3_clicked() throws ClassNotFoundException { lastPressed = "C3";notesRec++;  Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleC4_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/C4Note.png")); imgPianoC2.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardK.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleC4_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoC2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardK.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleC4_clicked() throws ClassNotFoundException { lastPressed = "C4"; notesRec++;  Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleC5_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/C5Note.png"));  imgPianoC3.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardY.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleC5_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoC3.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardY.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleC5_clicked() throws ClassNotFoundException { lastPressed = "C5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleD3_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/D3Note.png"));  imgPianoD1.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardS.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleD3_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoD1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardS.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleD3_clicked() throws ClassNotFoundException { lastPressed = "D3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleD4_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/D4Note.png"));  imgPianoD2.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardL.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleD4_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoD2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardL.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleD4_clicked() throws ClassNotFoundException { lastPressed = "D4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleD5_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/D5Note.png"));  imgPianoD3.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardU.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleD5_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoD3.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardU.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleD5_clicked() throws ClassNotFoundException { lastPressed = "D5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleE3_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/E3Note.png"));  imgPianoE1.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardD.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleE3_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoE1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardD.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleE3_clicked() throws ClassNotFoundException { lastPressed = "E3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleE4_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/E4Note.png"));  imgPianoE2.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardQ.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleE4_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoE2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardQ.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleE4_clicked() throws ClassNotFoundException { lastPressed = "E4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleE5_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/E5Note.png"));  imgPianoE3.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardI.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleE5_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoE3.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardI.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleE5_clicked() throws ClassNotFoundException { lastPressed = "E5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleF3_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/F3Note.png"));imgPianoF1.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardF.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleF3_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoF1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardF.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleF3_clicked() throws ClassNotFoundException { lastPressed = "F3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleF4_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/F4Note.png"));  imgPianoF2.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardW.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleF4_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoF2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardW.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleF4_clicked() throws ClassNotFoundException { lastPressed = "F4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleF5_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/F5Note.png"));  imgPianoF3.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardO.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleF5_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoF3.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardO.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleF5_clicked() throws ClassNotFoundException { lastPressed = "F5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleG3_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/G3Note.png"));  imgPianoG1.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardG.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleG3_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoG1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardG.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleG3_clicked() throws ClassNotFoundException { lastPressed = "G3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleG4_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/G4Note.png"));imgPianoG2.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardE.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleG4_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoG2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardE.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleG4_clicked() throws ClassNotFoundException { lastPressed = "G4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleG5_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/G5Note.png"));imgPianoG3.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardP.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleG5_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoG3.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardP.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleG5_clicked() throws ClassNotFoundException { lastPressed = "G5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleA3_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/A3Note.png"));  imgPianoA1.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardH.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleA3_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoA1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardH.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleA3_clicked() throws ClassNotFoundException { lastPressed = "A3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleA4_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/A4Note.png"));  imgPianoA2.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardR.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleA4_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoA2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardR.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleA4_clicked() throws ClassNotFoundException { lastPressed = "A4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleB3_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/B3Note.png"));  imgPianoB1.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardJ.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleB3_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoB1.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardJ.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleB3_clicked() throws ClassNotFoundException { lastPressed = "B3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleB4_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/B4Note.png"));  imgPianoB2.setImage(new Image("piano_keys/piano_left2.png")); imgKeyboardT.setImage(new Image("kalim_keys/color2.png"));}
	@FXML private void handleB4_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgPianoB2.setImage(new Image("piano_keys/piano_left.png")); imgKeyboardT.setImage(new Image("kalim_keys/color.png"));}
	@FXML private void handleB4_clicked() throws ClassNotFoundException { lastPressed = "B4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	
	@FXML private void handleBb1_clicked() throws ClassNotFoundException { lastPressed = "Bb3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleBb2_clicked() throws ClassNotFoundException { lastPressed = "Bb4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleBb3_clicked() throws ClassNotFoundException { lastPressed = "Bb5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleBb1_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleBb2_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleBb3_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleBb1_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/B3FNote.png"));}
	@FXML private void handleBb2_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/B4FNote.png"));}
	@FXML private void handleBb3_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/B5FNote.png"));}
	
	@FXML private void handleAb1_clicked() throws ClassNotFoundException { lastPressed = "Ab3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleAb2_clicked() throws ClassNotFoundException { lastPressed = "Ab4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleAb3_clicked() throws ClassNotFoundException { lastPressed = "Ab5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleAb1_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleAb2_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleAb3_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleAb1_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/A3FNote.png"));}
	@FXML private void handleAb2_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/A4FNote.png"));}
	@FXML private void handleAb3_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/A5FNote.png"));}
	
	@FXML private void handleGb1_clicked() throws ClassNotFoundException { lastPressed = "Gb3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleGb2_clicked() throws ClassNotFoundException { lastPressed = "Gb4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleGb3_clicked() throws ClassNotFoundException { lastPressed = "Gb5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleGb1_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleGb2_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleGb3_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleGb1_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/G3FNote.png"));}
	@FXML private void handleGb2_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/G4FNote.png"));}
	@FXML private void handleGb3_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/G5FNote.png"));}
	
	@FXML private void handleEb1_clicked() throws ClassNotFoundException { lastPressed = "Eb3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleEb2_clicked() throws ClassNotFoundException { lastPressed = "Eb4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleEb3_clicked() throws ClassNotFoundException { lastPressed = "Eb5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleEb1_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleEb2_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleEb3_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleEb1_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/E3FNote.png"));}
	@FXML private void handleEb2_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/E4FNote.png"));}
	@FXML private void handleEb3_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/E5FNote.png"));}
	
	@FXML private void handleDb1_clicked() throws ClassNotFoundException { lastPressed = "Db3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleDb2_clicked() throws ClassNotFoundException { lastPressed = "Db4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleDb3_clicked() throws ClassNotFoundException { lastPressed = "Db5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	@FXML private void handleDb1_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleDb2_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleDb3_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));}
	@FXML private void handleDb1_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/D3FNote.png"));}
	@FXML private void handleDb2_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/D4FNote.png"));}
	@FXML private void handleDb3_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/D5FNote.png"));}
	
	/**
	 * Block for keyboard handlers.  Loads in new images for the staff and instruments interaction keys, while sending the Multithreaded sound player the key pressed.
	 * @throws ClassNotFoundException
	 */
	@FXML private void handleA_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/C3Note.png"));  imgKeyboardA.setImage(new Image("piano_keys/color2.png")); imgPianoC1.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleA_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardA.setImage(new Image("piano_keys/color.png")); imgPianoC1.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleA_clicked() throws ClassNotFoundException { lastPressed = "C3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleS_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/D3Note.png"));  imgKeyboardS.setImage(new Image("piano_keys/color2.png")); imgPianoD1.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleS_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardS.setImage(new Image("piano_keys/color.png")); imgPianoD1.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleS_clicked() throws ClassNotFoundException { lastPressed = "D3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleD_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/E3Note.png"));  imgKeyboardD.setImage(new Image("piano_keys/color2.png")); imgPianoE1.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleD_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardD.setImage(new Image("piano_keys/color.png")); imgPianoE1.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleD_clicked() throws ClassNotFoundException { lastPressed = "E3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleF_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/F3Note.png"));  imgKeyboardF.setImage(new Image("piano_keys/color2.png")); imgPianoF1.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleF_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardF.setImage(new Image("piano_keys/color.png")); imgPianoF1.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleF_clicked() throws ClassNotFoundException { lastPressed = "F3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleG_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/G3Note.png"));  imgKeyboardG.setImage(new Image("piano_keys/color2.png")); imgPianoG1.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleG_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardG.setImage(new Image("piano_keys/color.png")); imgPianoG1.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleG_clicked() throws ClassNotFoundException { lastPressed = "G3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleH_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/A3Note.png"));  imgKeyboardH.setImage(new Image("piano_keys/color2.png")); imgPianoA1.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleH_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardH.setImage(new Image("piano_keys/color.png")); imgPianoA1.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleH_clicked() throws ClassNotFoundException { lastPressed = "A3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleJ_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/B3Note.png"));  imgKeyboardJ.setImage(new Image("piano_keys/color2.png")); imgPianoB1.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleJ_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardJ.setImage(new Image("piano_keys/color.png")); imgPianoB1.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleJ_clicked() throws ClassNotFoundException { lastPressed = "B3"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleK_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/C4Note.png"));  imgKeyboardK.setImage(new Image("piano_keys/color2.png")); imgPianoC2.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleK_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardK.setImage(new Image("piano_keys/color.png")); imgPianoC2.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleK_clicked() throws ClassNotFoundException { lastPressed = "C4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleL_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/D4Note.png"));  imgKeyboardL.setImage(new Image("piano_keys/color2.png")); imgPianoD2.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleL_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardL.setImage(new Image("piano_keys/color.png")); imgPianoD2.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleL_clicked() throws ClassNotFoundException { lastPressed = "D4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleQ_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/E4Note.png"));  imgKeyboardQ.setImage(new Image("piano_keys/color2.png")); imgPianoE2.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleQ_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardQ.setImage(new Image("piano_keys/color.png")); imgPianoE2.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleQ_clicked() throws ClassNotFoundException { lastPressed = "E4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleW_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/F4Note.png"));  imgKeyboardW.setImage(new Image("piano_keys/color2.png")); imgPianoF2.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleW_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardW.setImage(new Image("piano_keys/color.png")); imgPianoF2.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleW_clicked() throws ClassNotFoundException { lastPressed = "F4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleE_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/G4Note.png"));  imgKeyboardE.setImage(new Image("piano_keys/color2.png")); imgPianoG2.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleE_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardE.setImage(new Image("piano_keys/color.png")); imgPianoG2.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleE_clicked() throws ClassNotFoundException { lastPressed = "G4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleR_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/A4Note.png"));  imgKeyboardR.setImage(new Image("piano_keys/color2.png")); imgPianoA2.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleR_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardR.setImage(new Image("piano_keys/color.png")); imgPianoA2.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleR_clicked() throws ClassNotFoundException { lastPressed = "A4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleT_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/B4Note.png"));  imgKeyboardT.setImage(new Image("piano_keys/color2.png")); imgPianoB2.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleT_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardT.setImage(new Image("piano_keys/color.png")); imgPianoB2.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleT_clicked() throws ClassNotFoundException { lastPressed = "B4"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleY_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/C5Note.png"));  imgKeyboardY.setImage(new Image("piano_keys/color2.png")); imgPianoC3.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleY_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardY.setImage(new Image("piano_keys/color.png")); imgPianoC3.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleY_clicked() throws ClassNotFoundException { lastPressed = "C5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleU_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/D5Note.png"));  imgKeyboardU.setImage(new Image("piano_keys/color2.png")); imgPianoD3.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleU_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardU.setImage(new Image("piano_keys/color.png")); imgPianoD3.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleU_clicked() throws ClassNotFoundException { lastPressed = "D5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleI_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/E5Note.png"));  imgKeyboardI.setImage(new Image("piano_keys/color2.png")); imgPianoE3.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleI_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardI.setImage(new Image("piano_keys/color.png")); imgPianoE3.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleI_clicked() throws ClassNotFoundException { lastPressed = "E5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleO_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/F5Note.png"));  imgKeyboardO.setImage(new Image("piano_keys/color2.png")); imgPianoF3.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleO_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardO.setImage(new Image("piano_keys/color.png")); imgPianoF3.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleO_clicked() throws ClassNotFoundException { lastPressed = "F5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
	@FXML private void handleP_entered() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/G5Note.png"));  imgKeyboardP.setImage(new Image("piano_keys/color2.png")); imgPianoG3.setImage(new Image("piano_keys/piano_left2.png")); }
	@FXML private void handleP_exited() throws ClassNotFoundException { staffPiano.setImage(new Image("Notes/base.png"));  imgKeyboardP.setImage(new Image("piano_keys/color.png")); imgPianoG3.setImage(new Image("piano_keys/piano_left.png"));  }
	@FXML private void handleP_clicked() throws ClassNotFoundException { lastPressed = "G5"; notesRec++; Thread object = new Thread(new MultithreadingPiano()); object.start(); }
	
}