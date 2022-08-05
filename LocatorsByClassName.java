package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByClassName 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver lbc=new ChromeDriver();
	
		lbc.get("https://www.facebook.com/login/");
		
		lbc.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt")).sendKeys("wdwd");
		lbc.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi")).sendKeys("3343");
		lbc.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();
	}

}
