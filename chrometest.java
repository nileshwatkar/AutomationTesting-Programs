package Nilesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrometest 
{
	public static void main(String[] args)
				{
			
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
			
		WebDriver chromedriv=new ChromeDriver();//typecasting 
			
		chromedriv.get("https://support.hp.com");
			
				}

}
		
		

