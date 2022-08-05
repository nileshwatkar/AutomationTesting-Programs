package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_ByMultipleAttributes 
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver ma=new ChromeDriver();

		ma.get("https://www.w3schools.com/");
		
		//Dark Mode Activating by clicking
		ma.findElement(By.xpath("//a[@class='w3-bar-item w3-button bar-icon-hover w3-right w3-hide-small'][@onclick='changepagetheme(2)']")).click();
	}

}
