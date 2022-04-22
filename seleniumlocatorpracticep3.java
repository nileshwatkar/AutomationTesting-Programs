package Nilesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumlocatorpracticep3
{

	private static final TimeUnit SECONDS = null;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
	
		WebDriver loc3=new ChromeDriver();
		
		loc3.get("https://profile.w3schools.com/");
		
		loc3.manage().timeouts().implicitlyWait(3000, SECONDS);
		
		
		loc3.findElement(By.name("name")).sendKeys("neelwatkar");
		
		loc3.findElement(By.name("current-password")).sendKeys("12345");
	
	}


}





















/*System.out.println(loc3.getCurrentUrl());
System.out.println(loc3.getCurrentUrl());
System.out.println(loc3.getTitle());*/
