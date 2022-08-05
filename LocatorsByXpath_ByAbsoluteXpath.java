package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_ByAbsoluteXpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver lbx=new ChromeDriver();

	lbx.get("https://www.w3schools.com/");
	
	lbx.findElement(By.xpath("/html/body/div[5]/div[1]/div/form/input")).sendKeys("Java");

	Thread.sleep(3000);
	
	lbx.findElement(By.xpath("/html/body/div[5]/div[1]/div/form/button")).click();
	
	
	}

}
