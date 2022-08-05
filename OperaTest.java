package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaTest 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.opera.driver","F:\\Selenium browser setups\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		WebDriver ot=new OperaDriver();
		
		ot.get("https://www.facebook.com/login/");
		
		ot.navigate().to("www.w3school.com");
		
	}

}
