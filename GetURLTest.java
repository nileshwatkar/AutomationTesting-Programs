package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURLTest 
{

	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver gut=new ChromeDriver();
			
			gut.get("https://www.facebook.com/login/");
			
			System.out.println("The Current Website is:  "+gut.getCurrentUrl());
	}

}
