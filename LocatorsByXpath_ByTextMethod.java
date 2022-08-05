package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_ByTextMethod
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver btx=new ChromeDriver();
		
		btx.manage().window().maximize();
		
		btx.get("https://www.w3schools.com/");
		
		Thread.sleep(3000);
		
		btx.findElement(By.xpath("//a[text()='Not Sure Where To Begin?']")).click();
	}

}
