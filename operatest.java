package Nilesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;


public class operatest 
{
	public static void main(String[] args) 
			{
			
	 System.setProperty("webdriver.opera.driver","F:\\Selenium browser setups\\operadriver_win64\\operadriver_win64\\operadriver.exe");
	
	 WebDriver operadriv=new OperaDriver();
	 
	 operadriv.get("https://www.selenium.dev/downloads/");
			}

}
