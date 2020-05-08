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
	
	public static float getVolume() throws Exception
	{
		String[] config = readConfig();
		float volume = Float.parseFloat(config[0]);
		if(config[1].contentEquals("True"))
		{
			return (float) -60.0;
		}
		else
		  return volume;
	}
	
	public static String getSaveFolder() throws Exception
	{
		String[] config = readConfig();
		return config[2];
	}
	
	public static String absolutePath() throws Exception
	{
            File f = new File("data"); 
            String absolute = f.getCanonicalPath(); 
            return absolute;
       
	}
	
	public static String changeSlashes(String path)
	{
		String replaceString = path.replace("\\","/");
		return replaceString;
	}
	
	public static void createNewHome(String path)
	{
		System.out.println("this should be making directories");
		new File(path + "/kalim_saves").mkdir();
		new File(path + "/piano_saves").mkdir();
		new File(path + "/xylo_saves").mkdir();
		
		
	}
	  
}
