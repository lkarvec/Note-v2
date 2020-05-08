/**  @author Zach Ross (bvf676)
 *  UTSA CS 3443 - Final Project
 *  Spring 2020
*/
package application.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import application.Main;
import application.model.KalimPlay;
import application.model.KalimRecord;
import application.model.MultithreadingKalimba;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import application.model.SettingsModel;

public class SettingsController {
	
	@FXML 
	Slider volumeSlider;
	@FXML
	Label muteLabel;
	@FXML
	TextField saveFolder;
	private static float volume;
	private static String[] config;
	/**
	 * When initialized the current stage is changed and the view is updated with a current list of files in the folder
	 * @throws Exception
	 */
	public void initialize() throws Exception
	{
		Main.currentStage= "Settings";
		SettingsModel.absolutePath();
		config = SettingsModel.readConfig();
		for(int i = 0; i < 3; i++)
		{
			System.out.println(config[i]);
		}
		volumeSlider.setValue(Double.parseDouble(config[0]));
		if(config[1].contentEquals("False"))
		{
			muteLabel.setText("OFF");
		}
		else
		{
			muteLabel.setText("ON");
		}
	}
	/**
	 * Handler for applying volume, takes current value of volume slider and sets the config volume value to current
	 * @param event
	 */
	public void handleVolume(ActionEvent event)
	{
		volume = (float) volumeSlider.getValue();
		String vol = "" + volume;
		config[0] = vol;
	}
	
	
	/**
	 * Handler for Mute selection, sets config mute value to true or false
	 * @param event
	 */
	public void handleMute(ActionEvent event)
	{
		if(config[1].contentEquals("False"))
		{
			muteLabel.setText("ON");
			config[1] = "True";
		}
		else
		{
			muteLabel.setText("OFF");
			config[1] = "False";
		}
	}
	
	/**
	 * Handler for changing the save folder, makes sure that the input has forward slashes instead of back slashes,
	 * calls the create home function and sets the config save folder value to the users input
	 * @param event
	 */
	public void handleSaveFolder(ActionEvent event)
	{
		config[2] = SettingsModel.changeSlashes(saveFolder.getText());
		SettingsModel.createNewHome(config[2]);
		saveFolder.clear();
		
	}
	
	/**
	 * returns to the main controller when return button is pressed, also update the config
	 * with all of the changes made in the settings tab
	 * @param event
	 */
	
	public void handleReturn(ActionEvent event)  { //Initialize Main.fxml
		
		try {
			FileWriter fw = new FileWriter("data/config.txt");
			for(int i = 0; i<3; i++)
			{
				fw.write(config[i] + "\n");
			}
			fw.close();
			Parent root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
			Main.stage.setScene(new Scene(root, 600, 600));
			Main.stage.show();
			
		}catch( IOException e ) {
			System.out.println( "Error returning to home screen." ); //output if file null
			e.printStackTrace();
		}
		
	}
}

