package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC3_GetParticular
{
	
	public void testCase3() throws IOException
	{
		//load the properties file 
		Properties pr=PropertiesHandle.loadPropertiesFile("../KeywordDrivenAPI/URI.properties");
		
		HTTPMethods http=new HTTPMethods(pr);
		http.getParticularMethod("QA_URI",TC1_PostRequest.returnIdValue);
	}
	

}
