package org.testing.trigger;

import java.io.IOException;

import org.testing.TestScripts.TC1_PostRequest;
import org.testing.TestScripts.TC2_GetAllRequest;
import org.testing.TestScripts.TC3_GetParticular;
import org.testing.TestScripts.TC4_PutRequest;
import org.testing.TestScripts.TC5_DeleteParticular;
import org.testing.TestScripts.TC6_GetAllRequest2;

public class Runner {

	public static void main(String[] args) throws IOException
	{
        TC1_PostRequest tc1=new TC1_PostRequest();
        tc1.testCase1();
        
        TC2_GetAllRequest tc2=new TC2_GetAllRequest();
        tc2.testcase2();
        
        TC3_GetParticular tc3=new TC3_GetParticular();
        tc3.testCase3();
        
        TC4_PutRequest tc4=new TC4_PutRequest();
        tc4.testCase4();
        
        TC5_DeleteParticular tc5=new TC5_DeleteParticular();
        tc5.testCase5();

        TC6_GetAllRequest2 tc6=new TC6_GetAllRequest2();
        tc6.testCase6();
	}

}
