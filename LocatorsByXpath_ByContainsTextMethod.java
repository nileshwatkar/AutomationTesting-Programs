package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_ByContainsTextMethod 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver ctn=new ChromeDriver();
		
		ctn.manage().window().maximize();
		ctn.get("https://www.w3schools.com/");
		
		ctn.findElement(By.xpath("//a[contains(text(),'Videos')]")).click();
		
	}

}
