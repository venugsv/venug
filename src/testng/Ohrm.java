package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ohrm {

	WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
	
		
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
}
