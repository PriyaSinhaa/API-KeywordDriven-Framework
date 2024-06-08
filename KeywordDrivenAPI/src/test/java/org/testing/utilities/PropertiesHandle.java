package org.testing.utilities;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//input parameter , we have to give the filePath
//purpose , it can load any properties file
// returns the Object of Properties class

public class PropertiesHandle {
	
	public static Properties loadPropertiesFile(String filePath) throws IOException
	{  
		File f=new File(filePath);// create a connection with the file
		FileReader fr=new FileReader(f);
		
		Properties pr=new Properties(); //object of Properties class
		pr.load(fr); //loads the file
		
		return pr; //returns Properties object
		
		
	}

}
