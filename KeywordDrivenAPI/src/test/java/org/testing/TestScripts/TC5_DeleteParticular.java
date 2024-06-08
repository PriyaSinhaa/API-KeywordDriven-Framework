package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC5_DeleteParticular {
	
	@Test
	public void testCase5() throws IOException
	{
		//load the Properties file
		Properties pr=PropertiesHandle.loadPropertiesFile("../KeywordDrivenAPI/URI.properties");
		
		HTTPMethods http=new HTTPMethods(pr);
		http.deleteParticular("QA_URI",TC1_PostRequest.returnIdValue);
		
	}

}
