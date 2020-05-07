package application.model;

import java.io.*; 

public class SettingsModel 
{	
	
	public static String[] readConfig()throws Exception 
	  { 
	  String[] config = new String[3];
	  int i = 0;
	  File file = new File("data/config.txt"); 
	  
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
	  String st; 
	  while ((st = br.readLine()) != null)
	  {
	    config[i] = st;
	  	i++;
	  }
	  
	  return config;
	  } 
	  
}
