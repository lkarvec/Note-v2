/**
 * 	@author Christopher Tyler (tbl512), Alexander Mains (rta149), Mark Dziuk (kvf069)
 * 	UTSA CS 3443 - Final Project
 * 	Spring 2019
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
	
	/**
	 * Handler for Piano selection, change the stage, open available saves and initialize Piano.fxml
	 * @param event
	 */
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
	
	/**
	 * Handler for Xylophone selection, change the stage, open available saves and initialize Piano.fxml
	 * @param event
	 */
	public void handleXylophone(ActionEvent event) { //Initialize Xylophone.fxml
			
			try {
				
				Parent root = FXMLLoader.load(getClass().getResource("../view/Xylophone.fxml"));
				Main.stage.setScene(new Scene(root, 600, 600));
				Main.stage.show();
				
			}catch( IOException e ) {
				System.out.println( "Error loading the file - please check its location." ); //output if file null
				e.printStackTrace();
			}
		
	}
	
	/**
	 * Handler for Kalimba selection, change the stage, open available saves and initialize Piano.fxml
	 * @param event
	 */
	public void handleKalimba(ActionEvent event) { //Initialize Kalimba.fxml
		
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("../view/Kalimba.fxml"));
			Main.stage.setScene(new Scene(root, 600, 600));
			Main.stage.show();
			
		}catch( IOException e ) {
			System.out.println( "Error loading the file - please check its location." ); //output if file null
			e.printStackTrace();
		}
	
	}
	public void handleSettings(ActionEvent event) { //Initialize Kalimba.fxml
		
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("../view/Settings.fxml"));
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