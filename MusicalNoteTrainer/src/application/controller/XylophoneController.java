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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
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
	
	@FXML private void handleC() {
		 playClip("C1");
	}
	
	

	
	@FXML private void handleD() {
		 playClip(" D1");
	}
	@FXML private void handleE() {
		 playClip(" E1");
	}
	
	@FXML private void handleF() {
		 playClip(" F1");
	}
	@FXML private void handleG() {
		 playClip(" G1");
	}
	@FXML private void handleA() {
		 playClip(" A1");
	}
	@FXML private void handleB() {
		 playClip(" B1");
	}
	
	
	
	@FXML private void handleC1() {
		 playClip(" C2");
	}
	

	
	@FXML private void handleD1() {
		 playClip(" D2");
	}
	@FXML private void handleE1() {
		 playClip(" E2");
	}
	
	@FXML private void handleF1() {
		 playClip(" F2");
	}
	@FXML private void handleG1() {
		 playClip(" G2");
	}
	@FXML private void handleA1() {
		 playClip(" A2");
	}
	@FXML private void handleB1() {
		 playClip(" B2");
	}
	
	
	
	
	@FXML private void handleC2() {
		 playClip(" C3");
	}
	

	
	@FXML private void handleD2() {
		 playClip(" D3");
	}
	@FXML private void handleE2() {
		 playClip(" E3");
	}
	
	@FXML private void handleF2() {
		 playClip(" F3");
	}
	@FXML private void handleG2() {
		 playClip(" G3");
	}

	
	@FXML private void handleCs1() {
		 playClip(" C#2");
	}
	

	
	@FXML private void handleDs1() {
		 playClip(" D#2");
	}
	
	@FXML private void handleFs1() {
		 playClip(" F#2");
	}
	@FXML private void handleGs1() {
		 playClip(" G#2");
	}
	@FXML private void handleAs1() {
		 playClip(" A#2");
	}
	
	@FXML private void handleCs() {
		 playClip(" C#1");
	}
	

	
	@FXML private void handleDs() {
		 playClip(" D#1");
	}
	
	@FXML private void handleFs() {
		 playClip(" F#1");
	}
	@FXML private void handleGs() {
		 playClip(" G#1");
	}
	@FXML private void handleAs() {
		 playClip(" A#1");
	}
	
	
	@FXML private void handleCs2() {
		 playClip(" C#3");
	}
	

	
	@FXML private void handleDs2() {
		 playClip(" D#3");
	}
	
	@FXML private void handleFs3() {
		 playClip(" F#3");
	}

	
}