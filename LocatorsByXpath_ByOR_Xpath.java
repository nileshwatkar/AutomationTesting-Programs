package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_ByOR_Xpath 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver or=new ChromeDriver();

		
		or.manage().window().maximize();
		
		or.get("https://www.w3schools.com/");
		
		or.findElement(By.xpath("//a[@class='w3-bar-item w3-button w3-hide-small barex bar-item-hover w3-padding-24 ws-hide-800' or @title='Exercises']")).click();
		
		
	}

}
