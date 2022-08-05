package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath_ByRelativeXpath 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver lbxr=new ChromeDriver();
		
		lbxr.manage().window().maximize();
		lbxr.get("https://www.w3schools.com/");
		
		lbxr.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		lbxr.findElement(By.xpath("//input[@name='email']")).sendKeys("aabbbcc");
		lbxr.findElement(By.xpath("//input[@class='PasswordInput_input_field__EWMIU undefined']")).sendKeys("123");
		lbxr.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();
	}

}
