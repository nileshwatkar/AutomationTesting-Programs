package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_BySingleAttribute 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver sa=new ChromeDriver();
		
		sa.manage().window().maximize();
		
		sa.get("https://www.w3schools.com/");
		
		Thread.sleep(3000);
		sa.findElement(By.xpath("//a[@class='w3-bar-item w3-button bar-item-hover w3-right w3-hide-small barex ws-pink']")).click();
	}

}
