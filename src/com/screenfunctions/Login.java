package com.screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login
{

@FindBy(how=How.XPATH,using="//*[text()='Admin ']")
public static WebElement lnk_Login_Admin;


@FindBy(how=How.XPATH,using="//*[@name='uname']")
public static WebElement edi_Login_username;

@FindBy(how=How.XPATH,using="//*[@name='pwd']")
public static WebElement edi_Login_password;

@FindBy(how=How.XPATH,using="//*[@name='submitBtn']")
public static WebElement btn_Login_submit;




public static void admin()
{

	lnk_Login_Admin.click();
	edi_Login_username.sendKeys("admin");
	edi_Login_password.sendKeys("admin");
	btn_Login_submit.click();
}


	}

