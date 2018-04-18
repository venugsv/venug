package com.screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Alogin {

	@FindBy(how=How.XPATH,using="//a[text()='Home']")
	
	public static WebElement lnk_Home;

	public static void clickHome()
	{
		lnk_Home.click();
	}

}
