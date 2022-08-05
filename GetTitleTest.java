package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver gtt=new ChromeDriver();

		gtt.get("https://www.w3schools.com/");
		
		System.out.println("The Title is:  "+gtt.getTitle());
		
	}

}
