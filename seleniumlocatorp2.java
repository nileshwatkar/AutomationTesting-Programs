package Nilesh;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumlocatorp2
{

	public static void main(String[] args)
		{
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver loc=new ChromeDriver();
		
		loc.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
		
		loc.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		
		
		//find element by id
		loc.findElement(By.id("phoneNo")).sendKeys("1234567");//find element by id
		
		
		loc.findElement(By.className("Login to continue")).click();
		
		

		
		//loc.close();
		
		
		}

}
