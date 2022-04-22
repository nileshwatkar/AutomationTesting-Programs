package Nilesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class edgetest 
{
	public static void main(String[] args) 
			{
			
	 System.setProperty("webdriver.edge.driver","F:\\Selenium browser setups\\edgedriver_win64\\msedgedriver.exe");
	 
	 WebDriver msedgedriv=new EdgeDriver();
	 
	 msedgedriv.get("https://www.selenium.dev/downloads/");
			}
}
