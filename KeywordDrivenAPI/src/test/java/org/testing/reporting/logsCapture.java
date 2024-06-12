package org.testing.reporting;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class logsCapture 
{
	public static void takeLog(String ClassName , String msg)
	{
		DOMConfigurator.configure("../KeywordDrivenAPI/layout.xml");
		Logger L = Logger.getLogger(ClassName);
		L.info(msg);
	}

}
