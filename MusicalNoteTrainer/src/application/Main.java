/**
 * 	@author Christopher Tyler (tbl512), Alexander Mains (rta149), Mark Dziuk (kvf069)
 * 	UTSA CS 3443 - Final Project
 * 	Spring 2019
 */
package application;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import application.model.SettingsModel;
import application.controller.SettingsController;
/**
 * Initialize application, call in current stage and launch main.fxml
 * @author Christopher
 *
 */
public class Main extends Application { //Main stage execution
	
	public static Stage stage; 
	public static String currentStage;
	
	/**
	 * [GUI Start, get frame information and read from Main.fxml, set scene.]
	 */
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Note 1.2");
		
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("view/Main.fxml"));
			primaryStage.setScene(new Scene(root, 600, 600));
			primaryStage.show();
			stage = primaryStage;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * [Main method, execute launch of GUI,  config file check.]
	 * @param args
	 */
	public static void main(String[] args) {
		File tmpFile = new File("data/config.txt");
		
		boolean exists = tmpFile.exists();
		if(!exists)
		{
			try {
				tmpFile.createNewFile();
				FileWriter fw = new FileWriter("data/config.txt");
				String defaultConfig = "0.0\nFalse\n" + SettingsModel.absolutePath();
				fw.write(defaultConfig);
				fw.close();
			}catch( Exception e ) {
				System.out.println( "Error returning to home screen." ); //output if file null
				e.printStackTrace();
			}
			
		}
		else
			System.out.println("file does exist");
		launch(args);
	}
	
}