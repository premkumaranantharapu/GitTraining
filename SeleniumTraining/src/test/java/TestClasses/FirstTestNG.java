package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class FirstTestNG {
	
	
	@Test
	public void FBLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0038QI744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
	}
	
	
}
