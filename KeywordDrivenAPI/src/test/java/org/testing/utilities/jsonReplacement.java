package org.testing.utilities;

import java.util.regex.Pattern;

//input parameter - the complete body ,variable name , variable value
//purpose of this method -- to assign the id value 
//output - returns the body 

public class jsonReplacement {
	

	public static String assignValue(String body, String variableName , String variableValue)
	{
		body=body.replaceAll(Pattern.quote("{{"+variableName+"}}"),variableValue);
		return body;
		
	}

}
