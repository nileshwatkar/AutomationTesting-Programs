package Nilesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpathtest {


	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium browser setups\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver rel=new ChromeDriver();
				
				
				rel.get("https://www.primevideo.com/");//Amazon Prime Video site
				
				//used Relative Xpath
						
								rel.manage().window().maximize();
			
					rel.findElement(By.xpath("//a[@class='_1NNx6V']")).click();   //sign in option
		
					rel.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("neelwatkar");   //my email OR username box
		
					rel.findElement(By.xpath("//input[@name='password']")).sendKeys("122454221");  //passowrd box
		
					rel.findElement(By.xpath("//input[@type='submit']")).click();  //click to submit button
		
						//rel.manage().timeouts().implicitlyWait(55, SECONDS); //page waits for 55 seconds
					
						rel.navigate().back();//i have to go back on create account page
						
						rel.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();//i want to create account so just clicked on create account
						
						Thread.sleep(5000);//page is waiting 5000ms on create account page
						
						rel.findElement(By.xpath("//a[@class='a-link-emphasis']")).click(); //click below to again sign in option
						
						Thread.sleep(5000);
						
						rel.navigate().to("https://www.primevideo.com/");//back on main page


						
	
	}

}
