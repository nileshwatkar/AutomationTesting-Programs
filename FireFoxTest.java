package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest 
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.gecko.driver","F:\\Selenium browser setups\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		WebDriver ft=new FirefoxDriver();
		
		ft.get("https://www.facebook.com/login/");
	}

}
