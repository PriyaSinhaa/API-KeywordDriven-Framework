package org.testing.TestScripts;

import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingObject {
	
	public static void main(String [] args)
	{
		Response r=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIBatchStudents");
		
		JSONArray array=new JSONArray(r.asString());
		JSONObject obj=array.getJSONObject(0);
		
		Set<String> allKeys=obj.keySet();
		
		for(String k:allKeys)
		{
			System.out.println("Keyname is "+k);
			System.out.println("Key value is "+obj.get(k));
		}
 	}

}
