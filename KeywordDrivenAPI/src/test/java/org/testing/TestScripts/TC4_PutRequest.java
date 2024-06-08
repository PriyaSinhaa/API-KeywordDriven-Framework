package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonReplacement;
import org.testng.annotations.Test;

public class TC4_PutRequest {
	
	@Test
	public void testCase4() throws IOException
	{   
		//load the properties file
		Properties pr=PropertiesHandle.loadPropertiesFile("../KeywordDrivenAPI/URI.properties");
		
		//Read the json data 
		String jsonrequestBody=JsonHandle.readJsonData("../KeywordDrivenAPI/src/test/java/org/testing/resources/inputRequestForUpdate.json");
		
		jsonrequestBody=jsonReplacement.assignValue(jsonrequestBody, "id",TC1_PostRequest.returnIdValue);
		HTTPMethods http=new HTTPMethods(pr);
		http.putMethod(jsonrequestBody,"QA_URI",TC1_PostRequest.returnIdValue);
	}

}
