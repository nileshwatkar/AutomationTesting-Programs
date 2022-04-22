package Nilesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumlocatorpracticep1 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver loc1=new ChromeDriver();
		
		loc1.get("https://demo.guru99.com/test/newtours/register.php");
		
		loc1.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		loc1.findElement(By.name("email")).sendKeys("neeeel");
		loc1.findElement(By.name("password")).sendKeys("1234567");
		loc1.findElement(By.name("confirmPassword")).sendKeys("1234567");
		loc1.findElement(By.name("submit")).click();
		
		
		
	
		
		
	}
	
	
	
	
	
}
