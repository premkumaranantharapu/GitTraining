package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ELearningSignUp {
	
	WebDriver driver;
	
	@Given("The ELearning website is launched")
	public void the_ELearning_website_is_launched() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\0038QI744\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://elearningm1.upskills.in/");
}

@When("Manipal website is launched click on SignUp")
public void SignUP() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//a[text()=' Sign up! ']")).click();
	
}

@Then("Enter data for Required fields")
public void FormData() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Prem");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("PremAnantharapu");
	driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys("Prem");
	driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys("Prem");	
}
@Then("Click on Register")
public void click_on_Register() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
    System.out.println("final method");
    Thread.sleep(3000);
}
}