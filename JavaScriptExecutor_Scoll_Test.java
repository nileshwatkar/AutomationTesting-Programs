package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Scoll_Test
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver jsst=new ChromeDriver();
		
		jsst.manage().window().maximize();
		jsst.get("https://www.w3schools.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)jsst;
		
		Thread.sleep(3000);
	
		js.executeScript("window.scrollBy(0,4000)");
		
		
	}

}
