package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByName 
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver lbn=new ChromeDriver();
		
		lbn.get("https://www.facebook.com/login/");
		
		lbn.findElement(By.name("email")).sendKeys("qdff");
		lbn.findElement(By.name("pass")).sendKeys("123455");
		lbn.findElement(By.name("login")).click();
		
	}

}
