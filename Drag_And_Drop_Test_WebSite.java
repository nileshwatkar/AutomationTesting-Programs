package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Test_WebSite
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver ddw=new ChromeDriver();
		
		ddw.manage().window().maximize();
		
		ddw.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions ac=new Actions(ddw);
		
		WebElement drag=ddw.findElement(By.xpath("//li[@id='credit2']"));
		WebElement drop=ddw.findElement(By.xpath("//ol[@id='bank']"));
		ac.dragAndDrop(drag, drop).build().perform();
		
		
		WebElement drag1=ddw.findElement(By.xpath("//li[@id='fourth'][2]"));
		WebElement drop1=ddw.findElement(By.xpath("//ol[@id='amt7']"));
		ac.dragAndDrop(drag1, drop1).build().perform();
		
		WebElement drag2=ddw.findElement(By.xpath("//li[@id='credit1']"));
		WebElement drop2=ddw.findElement(By.xpath("//ol[@id='loan']"));
		ac.dragAndDrop(drag2, drop2).build().perform();
		
		WebElement drag3=ddw.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement drop3=ddw.findElement(By.xpath("//ol[@id='amt8']"));
		ac.dragAndDrop(drag3, drop3).build().perform();
	}
}
