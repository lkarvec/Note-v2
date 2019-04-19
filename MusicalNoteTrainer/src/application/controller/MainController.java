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

public class MainController {
	
	public void handlePiano(ActionEvent event) { //Initialize Piano.fxml
		
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("../view/Piano.fxml"));
			Main.stage.setScene(new Scene(root, 600, 600));
			Main.stage.show();
			
		}catch( IOException e ) {
			System.out.println( "Error loading the file - please check its location." ); //output if file null
			e.printStackTrace();
		}
	}
		
	public void handleXylophone(ActionEvent event) { //Initialize Piano.fxml
			
			try {
				
				Parent root = FXMLLoader.load(getClass().getResource("../view/xlophone.fxml"));
				Main.stage.setScene(new Scene(root, 600, 600));
				Main.stage.show();
				
			}catch( IOException e ) {
				System.out.println( "Error loading the file - please check its location." ); //output if file null
				e.printStackTrace();
			}
		
	}
	
    @FXML
    public void initialize() {
    	try { Main.currentStage = "Main"; } 
    	catch (Exception e) { System.out.println ("Exception is caught"); 
} 
    }
	
}