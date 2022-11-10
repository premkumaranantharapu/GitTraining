package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleFeature {
	
	WebDriver driver;
	
@Given("The FaceBook website is launched")
public void the_Google_website_is_launched() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\0038QI744\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}

@When("Login screen is visible enter as {string} and {string}")
public void search_bar_is_visible(String uname, String pwd) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
}

@Then("click login")
public void enter_some_text() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
