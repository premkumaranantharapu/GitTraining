package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClassinSeleniumTraining {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0038QI744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.calculator.net/calorie-calculator.html");
		//input[@id='vfb-7-1']
		driver.findElement(By.xpath("//input[@id='cage']")).sendKeys("26");
		driver.findElement(By.xpath("//input[@id='cage']")).clear();
		driver.findElement(By.xpath("//input[@id='cheightmeter']")).sendKeys("150");
		driver.findElement(By.xpath("//input[@name='ckg']")).sendKeys("72");*/
		
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.findElement(By.xpath("//input[@id='vfb-7-1']")).click();
		driver.findElement(By.xpath("//body/div[4]")).click();
		//driver.close();
	}
}
