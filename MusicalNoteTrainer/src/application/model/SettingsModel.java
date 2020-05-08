package application.model;

import java.io.*; 
import java.io.File;
public class SettingsModel 
{	
	/**
	 * Opens config.txt, reads the three settings into a String array, and return the array
	 * @throws Exception
	 * @return String[]
	 */
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
	
	/**
	 * calls readConfig(), converts the string volume to a float and then checks if the mute button is set to true
	 * if yes than return the lowest possible volume value, if no then return the config volume value 
	 * @throws Exception
	 * @return float - volume
	 */
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
	
	/**
	 * calls readConfig(), returns the savefolder config value
	 * @throws Exception
	 * @return String - saveFolder
	 */
	public static String getSaveFolder() throws Exception
	{
		String[] config = readConfig();
		return config[2];
	}
	
	/**
	 * creates a default path to the data file if a config file doesn't exist on launch
	 * @throws Exception
	 * @return String - absolute path
	 */
	public static String absolutePath() throws Exception
	{
            File f = new File("data"); 
            String absolute = f.getCanonicalPath(); 
            return absolute;
       
	}
	
	/**
	 * if the absolute path for the savefolder contains backslashes it will convert those to forward slashes
	 * @throws Exception
	 * @return String - replacementPath
	 */
	public static String changeSlashes(String path)
	{
		String replaceString = path.replace("\\","/");
		return replaceString;
	}
	/**
	 * if the save file is changed this method will be called to add the 3 save folders (kalim_saves, piano_saves, xylo_saves)
	 * to the new save folder
	 * @throws Exception
	 */
	public static void createNewHome(String path)
	{
		System.out.println("this should be making directories");
		new File(path + "/kalim_saves").mkdir();
		new File(path + "/piano_saves").mkdir();
		new File(path + "/xylo_saves").mkdir();
		
		
	}
	  
}
