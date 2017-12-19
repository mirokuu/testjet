package com.jet.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @AUTHOR Prosmart
 * 
 * 
 */
	public class LoginPageNew {
	
		WebDriver driver;
	
		public LoginPageNew(WebDriver driver){
		this.driver=driver;
		}
		//Create the excel sheet with data
		//Make sure you know what column holding script your email, password and search item
		//Get the total number of cells, rows, column
		//lets say we are using this current script
		//Create an object to hold you excel sheet
		//create an object for you excel folder name and sheet you are working with 
		//Create a loop around action you would like you perform 20 times
		//ex: username and password and search items. Make sure to create loop (Array)/iterator dynamic
		//so it doesnt pass one data and stop. It cant be static.
		//
		@FindBy(id="login-email") WebElement username;
		@FindBy(id="login-password") WebElement password;
		@FindBy(xpath=".//*[@id='login']/ddiv[6]/div[1]/button") WebElement SignIn;  
	
		
	
	public void login_JetSite(String usid, String Passwr)
			{	username.sendKeys(usid);
				password.sendKeys(Passwr);
				SignIn.click();


}
}