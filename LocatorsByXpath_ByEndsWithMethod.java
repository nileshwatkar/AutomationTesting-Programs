package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_ByEndsWithMethod
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver ew=new ChromeDriver();
		
		ew.manage().window().maximize();
		
		ew.get("https://www.facebook.com/");
		
		ew.findElement(By.xpath("//input[contains(@class,'6luy')]")).sendKeys("11123");
		
		ew.findElement(By.xpath("//input[contains(@data-testid,'pass')]")).sendKeys("3322");
		
		ew.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
	}

}
