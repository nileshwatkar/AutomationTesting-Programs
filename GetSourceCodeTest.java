package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSourceCodeTest
{

	public static void main(String[] args)
	
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver gsct=new ChromeDriver();
	
		gsct.get("https://www.facebook.com/login/");
		
		System.out.println("************The Source Code is: *****************\n"+gsct.getPageSource());
	
	
	}

}
