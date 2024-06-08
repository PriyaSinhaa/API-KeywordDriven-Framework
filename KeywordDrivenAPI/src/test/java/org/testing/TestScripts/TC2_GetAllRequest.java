package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC2_GetAllRequest {

	   public  void testcase2() throws IOException
	   {
		//load the Properties file
		Properties pr = PropertiesHandle.loadPropertiesFile("../KeywordDrivenAPI/URI.properties");
		
		HTTPMethods http =new HTTPMethods(pr);
	    http.getAllMethod("QA_URI");
	   }

}
