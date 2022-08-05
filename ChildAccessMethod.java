package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildAccessMethod 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver ca=new ChromeDriver();
		
		ca.manage().window().maximize();
		
		ca.get("https://demoqa.com/text-box");
		
		ca.findElement(By.xpath("//form[@id='userForm']//child::input[@id='userName']")).sendKeys("adcd");
		
		ca.findElement(By.xpath("//form[@id='userForm']//child::input[@id='userEmail']")).sendKeys("neelwatkar3@gmail.com");
		ca.findElement(By.xpath("//form[@id='userForm']//child::textarea[@id='currentAddress']")).sendKeys("Satara");
		ca.findElement(By.xpath("//form[@id='userForm']//child::textarea[@id='permanentAddress']")).sendKeys("Satara");
		ca.findElement(By.xpath("//form[@id='userForm']//child::button[@id='submit']")).click();
		
		
	}

}
