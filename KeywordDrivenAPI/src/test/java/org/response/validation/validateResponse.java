package org.response.validation;

import org.testing.utilities.jsonParsingUsingJsonPath;

import Assertion1.Assertion;
import io.restassured.response.Response;

public class validateResponse 
{
	
	public static Boolean statusCodeValidation(int expectedStatuscode,Response res, String className)
	{
		int actualStatuscode=res.statusCode();
		Boolean result=Assertion.assertion(expectedStatuscode, actualStatuscode,className);
		return result;
	}
    
	public static Boolean dataValidate(String expectedData,Response res,String jsonPath)
	{
		String actualValue=jsonParsingUsingJsonPath.doParsing(jsonPath, res);
		Boolean result=Assertion.assertion2(expectedData, actualValue);
		return result;
	}
}
