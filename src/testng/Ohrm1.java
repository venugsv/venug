package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Ohrm1 extends Ohrm
{
	
@Test
public void loginHomePage()
{
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user01");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
	try {
		String ele = driver.findElement(By.xpath("//a[@id='welcome']")).getText();
		if(ele.contains("Welcome"))
		{
			System.out.println("Login Successfull");
		}
	}
	
	catch(Exception e)
	{
		System.out.println("Login not Successfull");
	}
	
}

}
