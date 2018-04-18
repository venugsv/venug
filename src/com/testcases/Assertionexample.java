package com.testcases;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(testnglisterners.Testng.class)

public class Assertionexample {
	
	public static SoftAssert assrt=new SoftAssert();
	
	@Test
	
	public static void testAssertion()
	{
		assrt.assertEquals("A", "A");
		
		//assrt.assertEquals("B", "A");
		System.out.println("Execution Completed");
		
		
		assrt.assertAll();
	}
	
	

}
