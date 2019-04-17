/**
 * Include updated @author tag.
 */
package application.controller;

import java.io.IOException;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

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

	Media sound = new Media(new File("src/keys_mp3/keyc3.mp3").toURI().toString());
	MediaPlayer mediaPlayer = new MediaPlayer(sound);
	
	//Finally going to have to play with Multi-threading
	
	//If recording == true, then handle should add key to string to be saved to file later.
	
	@FXML private void handleC1_entered() throws ClassNotFoundException { imgPianoC1.setImage(new Image("keys/piano_left2.png")); mediaPlayer.play();}
	@FXML private void handleC1_exited() throws ClassNotFoundException { imgPianoC1.setImage(new Image("keys/piano_left.png")); mediaPlayer.stop();}
	@FXML private void handleC1_clicked() throws ClassNotFoundException { }
	
	@FXML private void handleC2_entered() throws ClassNotFoundException { imgPianoC2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleC2_exited() throws ClassNotFoundException { imgPianoC2.setImage(new Image("keys/piano_left.png")); }
	
	@FXML private void handleC3_entered() throws ClassNotFoundException { imgPianoC3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleC3_exited() throws ClassNotFoundException { imgPianoC3.setImage(new Image("keys/piano_left.png")); }
	
	
	@FXML private void handleD1_entered() throws ClassNotFoundException { imgPianoD1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD1_exited() throws ClassNotFoundException { imgPianoD1.setImage(new Image("keys/piano_left.png")); }
	
	@FXML private void handleD2_entered() throws ClassNotFoundException { imgPianoD2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD2_exited() throws ClassNotFoundException { imgPianoD2.setImage(new Image("keys/piano_left.png")); }
	
	@FXML private void handleD3_entered() throws ClassNotFoundException { imgPianoD3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD3_exited() throws ClassNotFoundException { imgPianoD3.setImage(new Image("keys/piano_left.png")); }
	
	
	@FXML private void handleE1_entered() throws ClassNotFoundException { imgPianoE1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE1_exited() throws ClassNotFoundException { imgPianoE1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleE2_entered() throws ClassNotFoundException { imgPianoE2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE2_exited() throws ClassNotFoundException { imgPianoE2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleE3_entered() throws ClassNotFoundException { imgPianoE3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE3_exited() throws ClassNotFoundException { imgPianoE3.setImage(new Image("keys/piano_left.png")); }
	
	
	@FXML private void handleF1_entered() throws ClassNotFoundException { imgPianoF1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleF1_exited() throws ClassNotFoundException { imgPianoF1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleF2_entered() throws ClassNotFoundException { imgPianoF2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleF2_exited() throws ClassNotFoundException { imgPianoF2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleF3_entered() throws ClassNotFoundException { imgPianoF3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleF3_exited() throws ClassNotFoundException { imgPianoF3.setImage(new Image("keys/piano_left.png")); }
	
	
	@FXML private void handleG1_entered() throws ClassNotFoundException { imgPianoG1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG1_exited() throws ClassNotFoundException { imgPianoG1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleG2_entered() throws ClassNotFoundException { imgPianoG2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG2_exited() throws ClassNotFoundException { imgPianoG2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleG3_entered() throws ClassNotFoundException { imgPianoG3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG3_exited() throws ClassNotFoundException { imgPianoG3.setImage(new Image("keys/piano_left.png")); }
	
	
	@FXML private void handleA1_entered() throws ClassNotFoundException { imgPianoA1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleA1_exited() throws ClassNotFoundException { imgPianoA1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleA2_entered() throws ClassNotFoundException { imgPianoA2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleA2_exited() throws ClassNotFoundException { imgPianoA2.setImage(new Image("keys/piano_left.png")); }
	
	
	@FXML private void handleB1_entered() throws ClassNotFoundException { imgPianoB1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleB1_exited() throws ClassNotFoundException { imgPianoB1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleB2_entered() throws ClassNotFoundException { imgPianoB2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleB2_exited() throws ClassNotFoundException { imgPianoB2.setImage(new Image("keys/piano_left.png")); }
	
	
}