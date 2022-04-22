package Nilesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlywaitstest 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver impliwaits=new ChromeDriver();
		
		impliwaits.get("https://www.selenium.dev/downloads/");
		
		impliwaits.navigate().to("https://www.flipkart.com/");
		
		impliwaits.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		System.out.println(impliwaits.getCurrentUrl());
		System.out.println(impliwaits.getTitle());
		System.out.println(impliwaits.getPageSource());
		
		impliwaits.close();
		
		}

}
