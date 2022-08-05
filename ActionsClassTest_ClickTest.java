package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest_ClickTest
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver act=new ChromeDriver();
	
		act.manage().window().maximize();
		act.get("https://demoqa.com/buttons");
		
		Actions action=new Actions(act);
		
		WebElement doubleclick=act.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		WebElement rightclick=act.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		WebElement click=act.findElement(By.xpath("//button[text()='Click Me']"));
	
		action.doubleClick(doubleclick).build().perform();
		action.contextClick(rightclick).build().perform();
		action.click(click).build().perform();
	
	}

}
