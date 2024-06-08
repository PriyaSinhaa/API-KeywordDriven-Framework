package org.testing.utilities;
//input parameter - Json file path
//purpose of this method - read the Json file data 
//output parameter - Json data in String format

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHandle {
	
	public static String readJsonData(String filePath) throws FileNotFoundException
	{
		File f=new File(filePath);
		FileInputStream fi=new FileInputStream(f);
		
		JSONTokener js=new JSONTokener(fi);
		JSONObject j=new JSONObject(js);
		
		return j.toString();
		
		
		
	}	

}
