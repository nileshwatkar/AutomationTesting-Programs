package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByLinkTest 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver lt=new ChromeDriver();
		
		lt.manage().window().maximize();
		
		lt.get("https://www.w3schools.com/");
		
		lt.findElement(By.linkText("Not Sure Where To Begin?")).click();
	}

}
