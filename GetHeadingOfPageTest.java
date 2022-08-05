package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeadingOfPageTest 
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver hdt=new ChromeDriver();

		hdt.manage().window().maximize();
		
		hdt.get("https://www.w3schools.com/");
		
		WebElement hdop=hdt.findElement(By.xpath("//h1[@class='learntocodeh1']"));
		System.out.println(hdop.getText());
		
	}

}
