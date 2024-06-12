package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.response.validation.validateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonParsingUsingJsonPath;
import org.testing.utilities.jsonReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest {
	
	
	public static String returnIdValue;
	
	@Test
	public void testCase1() throws IOException
	{
		
	//load the Properties file
	Properties pr = PropertiesHandle.loadPropertiesFile("../KeywordDrivenAPI/URI.properties");
	//Read the JSON request data
	String jsonRequestBody=JsonHandle.readJsonData("../KeywordDrivenAPI/src/test/java/org/testing/resources/inputRequest.json");
	
	//generating a random id value
	Random r=new Random();
	Integer idValue=r.nextInt();
	
	jsonRequestBody=jsonReplacement.assignValue(jsonRequestBody,"id",idValue.toString()); // calling jsonReplacement utility 
	
	//call the Post http method
	HTTPMethods http =new HTTPMethods(pr);
    Response resObj= http.postMethod(jsonRequestBody, "QA_URI"); //send the JSON body and URI 
    
    //validate the response 
    validateResponse.statusCodeValidation(201, resObj,"TC1_PostRequest");
    
    returnIdValue=jsonParsingUsingJsonPath.doParsing("id", resObj);
	
	
	}

}
