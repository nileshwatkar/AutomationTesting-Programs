package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_ByIndexingMethod
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver im=new ChromeDriver();
		
		im.manage().window().maximize();
		
		im.get("https://www.facebook.com/");
		
		im.findElement(By.xpath("//input[@data-testid='royal_email'][1]")).sendKeys("abcd");
		
		im.findElement(By.xpath("//input[@data-testid='royal_pass'][1]")).sendKeys("3222");
		
		im.findElement(By.xpath("//button[@name='login']")).click();

	}

}
