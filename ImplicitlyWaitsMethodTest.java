package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitsMethodTest
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver iwmt=new ChromeDriver();
	
		iwmt.get("https://www.w3schools.com/");
		
		iwmt.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		iwmt.navigate().to("https://www.facebook.com/login/");
	}

}
