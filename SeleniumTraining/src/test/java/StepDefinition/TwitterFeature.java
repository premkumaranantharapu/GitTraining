package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterFeature {
	
	WebDriver driver;
	
	@Given("Twitter page is launched")
	public void twitter_page_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\0038QI744\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.get("https://twitter.com/i/flow/login");
	}

	@When("Twitter Login page is displayed")
	public void twitter_Login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("enter User name {string} and Password {string}")
	public void enter_User_name_and_Password(String uname, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@autocapitalize='sentences']")).sendKeys(uname);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}

	@Then("click on Login Button")
	public void click_on_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("final method");
	}
}
