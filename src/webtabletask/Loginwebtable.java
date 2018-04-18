package webtabletask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginwebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		driver.manage().window().maximize();
		
		List <WebElement>  empids = driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[text()='Analyst']/preceding-sibling::td[3]"));
		int i;
		for(i=0; i<=empids.size();i++)
		
	}

}
