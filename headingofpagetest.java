package Nilesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class headingofpagetest 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver hd=new ChromeDriver();
				
				
				hd.get("https://www.primevideo.com/");
				//by absolute xpath
				WebElement heading=hd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div[1]/h1"));//get heading from website
				System.out.println(heading.getText());//website heading output
				
				//by relative xpath
				WebElement heading1=hd.findElement(By.xpath("//h1[@class='dv-copy-title']"));//get heading from website
				System.out.println(heading1.getText());
		

	}

}
