package Nilesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxtest 
{
	public static void main(String[] args) 
			{
			
	 System.setProperty("webdriver.gecko.driver","F:\\Selenium browser setups\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	 
	 WebDriver fifoxdriv=new FirefoxDriver();
	 
	 fifoxdriv.get("https://www.selenium.dev/downloads/");
		
			}

}
