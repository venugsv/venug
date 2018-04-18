package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Parent {

	
	@BeforeSuite
	
	public void add()
	{
		System.out.println("beforesuite");
	}
	
	@BeforeTest
	
	public void sun()
	{
		System.out.println("beforetest");
		
}

 @BeforeClass
  public void mult()
  {
	 System.out.println("beforeclass"); 
  }
 
 @BeforeMethod
 
 public void div()
 {
	 System.out.println("beforeMethod"); 


}
 @AfterMethod
 public void am()
 {
	 System.out.println("AfterMethod"); 


}
 @AfterClass
 
 public void ac()
 {
	 System.out.println("AfterClass"); 


}
 @AfterTest
 public void at()
 {
	 System.out.println("Aftertest"); 


}
 @AfterSuite
 public void as()
 {
	 System.out.println("Aftersuite");
 }
 
 
 
}