package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver ct=new ChromeDriver();
		
		ct.get("https://www.facebook.com/login/");
		ct.close();
	
	}

}
