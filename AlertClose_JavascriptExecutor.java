package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClose_JavascriptExecutor 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver ac=new ChromeDriver();
		
		ac.manage().window().maximize();
		
		ac.get("https://licindia.in/");
		
		
		
		WebElement alc=ac.findElement(By.xpath("//div[@class='avm-bot-welcome-notification animated fadeInUp']//following::a[@title='Close welcome popup']"));
		alc.click();
		ac.switchTo().alert().dismiss();
	}

}
