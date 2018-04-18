package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.screenfunctions.Login;

public class Tc_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		driver.get("http://server/bank/");
		driver.manage().window().maximize();
		
		Login lgn = PageFactory.initElements(driver, Login.class);
		lgn.admin();
		
	}

}
