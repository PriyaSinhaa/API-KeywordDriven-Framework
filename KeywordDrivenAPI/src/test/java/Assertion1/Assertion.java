package Assertion1;

import org.testing.reporting.logsCapture;

public class Assertion {
	
	public static boolean assertion(int expected, int actual,String classname)
	{
		if(expected==actual)
			{ 
			  //System.out.println("Status code is matching");
			 logsCapture.takeLog(classname,"Status code is matching");
		      return true;
		     }
		else
			{
			System.out.println("Status code is not matching");
			return false;
			}
	}
	
	public static boolean assertion2(String expected, String actual)
	{
		if(expected.equals(actual))
			{ 
			  System.out.println("Data is matching");
		      return true;
		     }
		else
			{
			System.out.println("Data is not matching");
			return false;
			}
	}
}
