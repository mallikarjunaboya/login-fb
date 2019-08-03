package fblogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
	
	WebDriver driver;
	@BeforeTest
	public void logs()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARJUN\\Downloads\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mtouch.facebook.com/login/");
	}
	@Test
	public void login()
	{
		
		
		driver.findElement(By.id("m_login_email")).sendKeys("mallikarjunaboya8@gmail.com");
		
		driver.findElement(By.id("m_login_password")).sendKeys("anumalli8");
		
		driver.findElement(By.id("u_0_5")).click();
		
		
	}

}
