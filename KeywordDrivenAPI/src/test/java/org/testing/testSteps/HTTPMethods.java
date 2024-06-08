package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {
	
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	
	
	public Response postMethod(String requestBody, String uriKeyName)
	{
		String uriValue=pr.getProperty(uriKeyName);
		Response res=given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post(uriValue);
		
		System.out.println("Status code is"+res.statusCode());
		
		return res;
		
	}
	
	public void getAllMethod(String uriKeyName)
	{
		String uriValue=pr.getProperty(uriKeyName);
		Response res=given()
		.contentType(ContentType.JSON)	
		.when()
		.get(uriValue);
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println("response data is");
		System.out.println(res.asString());		
	}
	
	public void getParticularMethod(String uriKeyName,String endpoint)
	{
		String uriValue=pr.getProperty(uriKeyName)+"/"+endpoint;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uriValue);
		
		System.out.println("Status code is"+res.getStatusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());		
				
	}
	
    public void putMethod(String requestBody,String uriKeyName,String endPoint)
    {
    	String uriValue=pr.getProperty(uriKeyName)+"/"+endPoint;
    	Response res=
    			given()
    			.contentType(ContentType.JSON)
    			.when()
    			.put(uriValue);
    	
    	System.out.println("Status code is  "+res.getStatusCode());
    	System.out.println("Response data is ");
    	System.out.println(res.asString());
    }
    
    public void deleteParticular(String uriKeyName,String endPoint)
    {
    	String uriValue=pr.getProperty(uriKeyName)+"/"+endPoint;
    	Response res=
    			given()
    			.contentType(ContentType.JSON)
    			.when()
    			.delete(uriValue);
    	
    	System.out.println("Status code is "+res.getStatusCode());
    	System.out.println("Response data is  ");
    	System.out.println(res.asString());
    	
    }
}
