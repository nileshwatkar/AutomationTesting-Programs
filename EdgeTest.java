package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","F:\\\\Selenium browser setups\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver et=new EdgeDriver();
		
		et.get("https://www.facebook.com/login/");

	}

}
