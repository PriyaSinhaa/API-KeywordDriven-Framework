package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC6_GetAllRequest2
{
	
	public void testCase6() throws IOException
	{
		Properties pr = PropertiesHandle.loadPropertiesFile("../KeywordDrivenAPI/URI.properties"); //loads the properties file
		
		//call the getallmethod 
		HTTPMethods http=new HTTPMethods(pr);		
		http.getAllMethod("dummy_api");
		
	}

}
