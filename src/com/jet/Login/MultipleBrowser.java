
package com.jet.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowser {
	 static WebDriver driver;

	public static WebDriver startBrowser(String BrowserName, String url)
	{
		if(BrowserName.equals("firefox"))
		{
			
			  driver = new FirefoxDriver();
		
			}
		else if (BrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\matthew\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if (BrowserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.InternetExplorer.driver", "filepath");
			driver=new InternetExplorerDriver();	
			
			
		}
	
	driver.manage().window().maximize();
	driver.get(url);

	return driver;
	
	
	}
	
	}
