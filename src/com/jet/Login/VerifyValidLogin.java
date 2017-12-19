package com.jet.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyValidLogin {

@Test
public void testvaliduser()
{
	WebDriver driver=MultipleBrowser.startBrowser("chrome","http://jet.com/register" );

	PageFactory.initElements(driver, LoginPageNew.class);
	LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
	
	
	login_page.login_JetSite("dummy@test.com", "dummy123!");




}

}
