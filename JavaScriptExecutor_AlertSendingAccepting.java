package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_AlertSendingAccepting 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver asat=new ChromeDriver();
	
		asat.manage().window().maximize();
		
		asat.get("https://www.w3schools.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)asat;

		js.executeScript("alert('Hello')");
		
		Thread.sleep(3000);
		
		asat.switchTo().alert().accept();
	}
}
