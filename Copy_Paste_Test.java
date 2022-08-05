package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_Paste_Test
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver cpt=new ChromeDriver();
		
		cpt.manage().window().maximize();
		cpt.get("https://demoqa.com/text-box");
		
		Actions act=new Actions(cpt);
		
		WebElement name=cpt.findElement(By.xpath("//input[@id='userName']"));
		name.sendKeys("Nilesh Watkar");
		
		WebElement email=cpt.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("neelwatkar111@gmail.com");
		
		WebElement currentad=cpt.findElement(By.xpath("//textarea[@id='currentAddress']"));
		currentad.sendKeys("Satara,phaltan");
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
	
		
		act.sendKeys(Keys.TAB);
		act.build().perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		act.sendKeys(Keys.TAB);
		act.build().perform();
		
		cpt.findElement(By.xpath("//button[@id='submit']")).click();
		
	}

}
