package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_ByStarts_WithMethod
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver sw=new ChromeDriver();
	
		sw.manage().window().maximize();
	
		sw.get("https://www.w3schools.com/");
		sw.findElement(By.xpath("//a[starts-with(@class,'w3-bar-item w3-button bar-item-hover w3-right ws-hide-1080 w3-hide-small barex topnavmain_pro')]")).click();
	
	}

}
