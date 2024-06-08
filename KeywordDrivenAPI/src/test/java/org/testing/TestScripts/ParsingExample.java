package org.testing.TestScripts;

import static io.restassured.RestAssured.given;

//Parsing using org.json library 
import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingExample {
	
	public static void main(String [] args)
	{
		
		Response res=given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/APIBatchStudents");
		
		//Parsing using org.json library 
		JSONArray j=new JSONArray(res.asString());
		
		int L=j.length();
		for(int i=0;i<L;i++)
		{	
		JSONObject ob=j.getJSONObject(i); // extract Object from Json array
		System.out.println(ob.get("id")); // extract any key from the object , here being "id"
		}
	}

}
