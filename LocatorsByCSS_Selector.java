package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByCSS_Selector
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver cts=new ChromeDriver();
		
		cts.manage().window().maximize();
		
		cts.get("https://www.w3schools.com/");
		
		cts.findElement(By.cssSelector("a#w3loginbtn")).click();//taag#id
		cts.findElement(By.cssSelector("input.EmailInput_input_field__6t4Ux")).sendKeys("ndlmr");//tag.classValue
		cts.findElement(By.cssSelector("input[name=current-password]")).sendKeys("1223");//tag[attribute=attributeValue]
	
		cts.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();//xpath
	}

}
