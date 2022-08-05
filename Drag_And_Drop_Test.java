package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Test
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver ddt=new ChromeDriver();
		
		ddt.manage().window().maximize();
		
		ddt.get("https://demoqa.com/droppable");
		
		Actions ac=new Actions(ddt);
		
		WebElement drag=ddt.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=ddt.findElement(By.xpath("//div[@id='droppable'][1]"));
		
		ac.dragAndDrop(drag, drop).build().perform();
		
	}

}
