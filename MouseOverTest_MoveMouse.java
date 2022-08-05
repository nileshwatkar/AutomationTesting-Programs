package Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverTest_MoveMouse
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver mot=new ChromeDriver();
		
		mot.manage().window().maximize();
		
		mot.get("https://demoqa.com/tool-tips");
		
		WebElement Contrary=mot.findElement(By.xpath("//input[@id='toolTipTextField']"));
		
		Actions a=new Actions(mot);
		
		a.moveToElement(Contrary).build().perform();
		
		
		WebElement Con=mot.findElement(By.partialLinkText("Contrary"));
		a.moveToElement(Con);
		
		System.out.println(Con.getText());
		
		
	}

}
