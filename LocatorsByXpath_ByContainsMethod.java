package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_ByContainsMethod
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver lbc=new ChromeDriver();
		
		lbc.manage().window().maximize();
		lbc.get("https://www.w3schools.com/");
		
		//login button
		lbc.findElement(By.xpath("//a[contains(@id,'w3loginbtn')]")).click();
	}

}
