package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleepMethod
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver tsm=new ChromeDriver();
	
		tsm.get("https://www.w3schools.com/");
		
		Thread.sleep(3000);
		
		tsm.navigate().to("https://www.facebook.com/login/");
	
		Thread.sleep(4000);
		
			tsm.navigate().back();
	
	}

	
}
