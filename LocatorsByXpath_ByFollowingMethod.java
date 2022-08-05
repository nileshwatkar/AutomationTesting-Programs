package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_ByFollowingMethod
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver fom=new ChromeDriver();
		
		fom.manage().window().maximize();
		
		fom.get("https://demoqa.com/text-box");
		
		fom.findElement(By.xpath("//input[@id='userName']")).sendKeys("Nilesh Watkar");
		fom.findElement(By.xpath("//input[@id='userName']//following::input[@id='userEmail']")).sendKeys("neelvatkar@gmail.com");
		fom.findElement(By.xpath("//input[@id='userName']//following::textarea[@id='currentAddress']")).sendKeys("Satara");
		fom.findElement(By.xpath("//textarea[@id='currentAddress']//following::textarea[@id='permanentAddress']")).sendKeys("Satara");
		fom.findElement(By.xpath("//button[text()='Submit']")).click();
	
	
	}

}
