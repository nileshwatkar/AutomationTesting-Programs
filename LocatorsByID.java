package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByID 
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver lbi=new ChromeDriver();
	
		lbi.get("https://www.facebook.com/login/");
		
		lbi.findElement(By.id("email")).sendKeys("sdcee");
		lbi.findElement(By.id("pass")).sendKeys("233");
		lbi.findElement(By.id("loginbutton")).click();
	}

}
