package application.model;

import java.io.*; 
import java.io.File;
public class SettingsModel 
{	
	
	public static String[] readConfig()throws Exception //comment
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
	  br.close();
	  return config;
	  } 
	
	public static String absolutePath() throws Exception
	{
            File f = new File("data"); 
            String absolute = f.getAbsolutePath(); 
            return absolute;
       
	}
	  
}
