package org.testing.utilities;

import io.restassured.response.Response;

// input parameter - ResponseObject and JsonPath
// purpose of the method - it will parse from the response based upon the jsonpath 
// output - After extracting the value it will return it 

public class jsonParsingUsingJsonPath {
	
	public static String doParsing(String jsonPath,Response res)
	{
		String extractedValue=res.jsonPath().get(jsonPath);
		return extractedValue;
	}
	

}
