package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest 
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver nt=new ChromeDriver();
		
		nt.get("https://www.facebook.com/login/");
		nt.navigate().to("https://www.w3schools.com/");
		nt.navigate().back();
		
	}

}
