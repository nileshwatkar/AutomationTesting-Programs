package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByPartialLinkTest
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver plt=new ChromeDriver();

		
		plt.manage().window().maximize();
		plt.get("https://www.w3schools.com/");
		
		plt.findElement(By.partialLinkText("Tutorials")).click();
		plt.findElement(By.partialLinkText("Website")).click();
		
	}

}
