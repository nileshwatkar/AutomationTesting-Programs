package Nilesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatetest
{
	public static void main(String[] args) throws InterruptedException
			{

			System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver navi=new ChromeDriver();
			navi.get("https://www.selenium.dev/downloads/");
			
			Thread.sleep(2000);
			
			navi.navigate().to("https://www.office.com/");
			navi.get("https://www.youtube.com/");
			
			Thread.sleep(2000);
			
			navi.navigate().back();
			
			
			System.out.println(navi.getCurrentUrl());
			System.out.println(navi.getTitle());
			System.out.println(navi.getPageSource());
			
			navi.close();
			}

}
