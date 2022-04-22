package Nilesh;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumlocatortest 
{

	public static void main(String[] args)
		{
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver loc=new ChromeDriver();
		
		loc.get("https://www.facebook.com/");
		
		loc.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		
		
		//find element by id
		loc.findElement(By.id("email")).sendKeys("1234567");//find element by id
		loc.findElement(By.id("pass")).sendKeys("123456A7");
		
		loc.findElement(By.name("login")).click();

		
		//loc.close();
		
		
		}

}
