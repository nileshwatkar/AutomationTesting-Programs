package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest_SwitchFrames 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver fmt=new ChromeDriver();
		
		fmt.manage().window().maximize();
		
		fmt.get("https://demoqa.com/frames");
		
		WebElement sf=fmt.findElement(By.xpath("//h1[@id='sampleHeading'][1]"));
	
		fmt.switchTo().frame(sf);
		
		
		
	}

}
