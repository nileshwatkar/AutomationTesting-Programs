package Nilesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolutexpathtest {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver abs=new ChromeDriver();
		
		abs.get("https://github.com/");//website
		
		//used Absolute Xpath 
			
		
			abs.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/a")).click();//sign in option
		
			abs.findElement(By.xpath("/html/body/div[3]/main/div/div[4]/form/input[2]")).sendKeys("nileshwatkar");//username box
	
			abs.findElement(By.xpath("/html/body/div[3]/main/div/div[4]/form/div/input[1]")).sendKeys("1245226");//password box
		
			abs.findElement(By.xpath("/html/body/div[3]/main/div/div[4]/form/div/input[12]")).click();	//sign in button
			
			Thread.sleep(5000);
		
			abs.navigate().back();//back one time
			abs.navigate().back();//again back one time
		
			WebElement heading=abs.findElement(By.xpath("/html/body/div[4]/main/div[1]/div[1]/div[1]/div/div/div[1]/h1"));//get heading from website
			System.out.println(heading.getText());//website heading output

	}

}
