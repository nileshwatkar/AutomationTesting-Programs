package Nilesh;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {
  
	public static void main(String[] args) {
		
 System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.selenium.dev/downloads/");
	}

}