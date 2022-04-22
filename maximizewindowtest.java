package Nilesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizewindowtest
{

	public static void main(String[] args) 
	{
		
				System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
				WebDriver maxwin=new ChromeDriver();
						
						
						maxwin.get("https://www.netflix.com/in/");
						maxwin.manage().window().maximize();
						
						WebElement heading=maxwin.findElement(By.xpath("//h1[@data-uia='hero-title']"));//get heading from website
						System.out.println(heading.getText());
					
				

	}

	

}
