package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_ByAncestorMethod 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver at=new ChromeDriver();
		
		at.manage().window().maximize();
		
		at.get("https://demoqa.com/text-box");
		
		at.findElement(By.xpath("//input[@id='userName']")).sendKeys("Nilesh");
		
		at.findElement(By.xpath("//input[@id='userName']//ancestor::div[1]//following::input")).sendKeys("neelwatkar7@gmail.com");
		
		at.findElement(By.xpath("//input[@id='userEmail']//ancestor::div[1]//following::textarea[1]")).sendKeys("Satara");
	
		at.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Satara");

		at.findElement(By.xpath("//button[@id='submit']")).click();
	}

}
