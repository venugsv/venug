package Testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToReadTextfromApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://server/bank/");
		driver.manage().window().maximize();
		
		List<WebElement> wb =  driver.findElements(By.xpath("//*[text()='PERSONAL BANKING']/following-sibling::ul/li"));
		
		
       File f = new File("C:\\Users\\tm\\Desktop\\venu", "varun.txt");
       FileWriter fw = new FileWriter(f);
       PrintWriter pw = new PrintWriter(fw);
		
		int n = wb.size();
		for(int i=0;i<n;i++)
		{
			String str = wb.get(i).getText();
			System.out.println(str);
			
			pw.println(str);
			pw.flush();
		
			
		}
		
	pw.close();	
fw.close();








		
		
		

	}

}
