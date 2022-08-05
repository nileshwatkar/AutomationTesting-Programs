package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshThePage_JavascriptExecutor
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver rp=new ChromeDriver();
		
		rp.manage().window().maximize();
		rp.get("https://www.w3schools.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)rp;
		
		js.executeScript("history.go(0)");
		
	}

}
