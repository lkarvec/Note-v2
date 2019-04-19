/**
 * 	@author Christopher Tyler (tbl512), Ali Salehi (abc123), Alexander Mains (abc123), Mark Dziuk (abc123)
 * 	UTSA CS 3443 - Final Project
 * 	Spring 2019
 */

/**
 *  Toss some names under the author tag, I'll get to posting other stuff. 
 * - Christopher
 */
package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application { //Main stage execution
	
	public static Stage stage;
	
	public static String currentStage;
	
	/**
	 * [GUI Start, get frame information and read from Main.fxml, set scene.]
	 */
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Musical Note Trainer FX");
		
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
	 * [Main method, execute launch of GUI.]
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
}