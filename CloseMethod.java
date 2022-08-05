package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver cmt=new ChromeDriver();
	
		cmt.get("https://www.w3schools.com/");
	
		cmt.close(); 
	}

}
