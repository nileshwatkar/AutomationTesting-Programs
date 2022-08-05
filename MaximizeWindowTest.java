package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowTest
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
	
		WebDriver mw=new ChromeDriver();
		
		mw.manage().window().maximize();
		
		mw.get("https://www.facebook.com/login/");

	}

}
