/**
 * Include updated @author tag.
 */
package application.controller;

import application.Main;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import application.model.MultithreadingInstance;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class PianoController {
	
	public ImageView imgPianoC1; // 1
	public ImageView imgPianoC2; // 2
	public ImageView imgPianoC3; // 3
	
	public ImageView imgPianoCD1;
	public ImageView imgPianoCD2;
	public ImageView imgPianoCD3;
	
	public ImageView imgPianoD1; // 4
	public ImageView imgPianoD2; // 5
	public ImageView imgPianoD3; // 6
	
	public ImageView imgPianoDE1;
	public ImageView imgPianoDE2;
	public ImageView imgPianoDE3;
	
	public ImageView imgPianoE1; // 7
	public ImageView imgPianoE2; // 8
	public ImageView imgPianoE3; // 9
	
	public ImageView imgPianoEF1;
	public ImageView imgPianoEF2;
	public ImageView imgPianoEF3;
	
	public ImageView imgPianoF1; // 10
	public ImageView imgPianoF2; // 11
	public ImageView imgPianoF3; // 12
	
	public ImageView imgPianoG1; // 13
	public ImageView imgPianoG2; // 14
	public ImageView imgPianoG3; // 15
	
	public ImageView imgPianoGA1;
	public ImageView imgPianoGA2;
	
	public ImageView imgPianoA1; // 16
	public ImageView imgPianoA2; // 17
	
	public ImageView imgPianoAB1;
	public ImageView imgPianoAB2;
	
	public ImageView imgPianoB1; // 18
	public ImageView imgPianoB2; // 19
	
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
	
	//Finally going to have to play with Multi-threading
	
	//If recording == true, then handle should add key to string to be saved to file later.
	
    @FXML
    public void initialize() throws FileNotFoundException{
    	Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.A) { System.out.println("You pressed A"); } });
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.S) { System.out.println("You pressed S"); } });
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.D) { System.out.println("You pressed D"); } });
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.F) { System.out.println("You pressed F"); } });
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.G) { System.out.println("You pressed G"); } });
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.H) { System.out.println("You pressed H"); } });
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.J) { System.out.println("You pressed J"); } });
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.K) { System.out.println("You pressed K"); } });
		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.L) { System.out.println("You pressed L"); } });
    }
	
	@FXML private void handleC3_entered() throws ClassNotFoundException { imgPianoC1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleC3_exited() throws ClassNotFoundException { imgPianoC1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleC3_clicked() throws ClassNotFoundException { lastPressed = "C3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleC4_entered() throws ClassNotFoundException { imgPianoC2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleC4_exited() throws ClassNotFoundException { imgPianoC2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleC4_clicked() throws ClassNotFoundException { lastPressed = "C4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleC5_entered() throws ClassNotFoundException { imgPianoC3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleC5_exited() throws ClassNotFoundException { imgPianoC3.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleC5_clicked() throws ClassNotFoundException { lastPressed = "C5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	
	@FXML private void handleD3_entered() throws ClassNotFoundException { imgPianoD1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD3_exited() throws ClassNotFoundException { imgPianoD1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleD3_clicked() throws ClassNotFoundException { lastPressed = "D3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleD4_entered() throws ClassNotFoundException { imgPianoD2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD4_exited() throws ClassNotFoundException { imgPianoD2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleD4_clicked() throws ClassNotFoundException { lastPressed = "D4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleD5_entered() throws ClassNotFoundException { imgPianoD3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD5_exited() throws ClassNotFoundException { imgPianoD3.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleD5_clicked() throws ClassNotFoundException { lastPressed = "D5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	
	@FXML private void handleE3_entered() throws ClassNotFoundException { imgPianoE1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE3_exited() throws ClassNotFoundException { imgPianoE1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleE3_clicked() throws ClassNotFoundException { lastPressed = "E3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleE4_entered() throws ClassNotFoundException { imgPianoE2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE4_exited() throws ClassNotFoundException { imgPianoE2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleE4_clicked() throws ClassNotFoundException { lastPressed = "E4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleE5_entered() throws ClassNotFoundException { imgPianoE3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE5_exited() throws ClassNotFoundException { imgPianoE3.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleE5_clicked() throws ClassNotFoundException { lastPressed = "E5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	
	@FXML private void handleF3_entered() throws ClassNotFoundException { imgPianoF1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleF3_exited() throws ClassNotFoundException { imgPianoF1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleF3_clicked() throws ClassNotFoundException { lastPressed = "F3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleF4_entered() throws ClassNotFoundException { imgPianoF2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleF4_exited() throws ClassNotFoundException { imgPianoF2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleF4_clicked() throws ClassNotFoundException { lastPressed = "F4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleF5_entered() throws ClassNotFoundException { imgPianoF3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleF5_exited() throws ClassNotFoundException { imgPianoF3.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleF5_clicked() throws ClassNotFoundException { lastPressed = "F5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	
	@FXML private void handleG3_entered() throws ClassNotFoundException { imgPianoG1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG3_exited() throws ClassNotFoundException { imgPianoG1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleG3_clicked() throws ClassNotFoundException { lastPressed = "G3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleG4_entered() throws ClassNotFoundException { imgPianoG2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG4_exited() throws ClassNotFoundException { imgPianoG2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleG4_clicked() throws ClassNotFoundException { lastPressed = "G4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleG5_entered() throws ClassNotFoundException { imgPianoG3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG5_exited() throws ClassNotFoundException { imgPianoG3.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleG5_clicked() throws ClassNotFoundException { lastPressed = "G5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	
	@FXML private void handleA3_entered() throws ClassNotFoundException { imgPianoA1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleA3_exited() throws ClassNotFoundException { imgPianoA1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleA3_clicked() throws ClassNotFoundException { lastPressed = "A3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleA4_entered() throws ClassNotFoundException { imgPianoA2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleA4_exited() throws ClassNotFoundException { imgPianoA2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleA4_clicked() throws ClassNotFoundException { lastPressed = "A4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	
	@FXML private void handleB3_entered() throws ClassNotFoundException { imgPianoB1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleB3_exited() throws ClassNotFoundException { imgPianoB1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleB3_clicked() throws ClassNotFoundException { lastPressed = "B3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleB4_entered() throws ClassNotFoundException { imgPianoB2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleB4_exited() throws ClassNotFoundException { imgPianoB2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleB4_clicked() throws ClassNotFoundException { lastPressed = "B4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
}