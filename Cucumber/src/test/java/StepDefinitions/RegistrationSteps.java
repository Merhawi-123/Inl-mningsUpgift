package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_onpen() {
		System.out.println("Inside step-browser is open");
		String projectPath=System.getProperty("user.dir");
		System.out.println("project path is"+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");
		driver =new ChromeDriver();
		

	}
	@When("user is on registration page")
	public void user_is_on_registration_page() {
		driver.navigate().to("https://login.mailchimp.com/signup/");
		
	}
	@Then("^user enters (.*) (.*) and (.*)$")
	public void user_enters_email_username_and_password(String email, String username, String password) {
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("new_username")).sendKeys(username);
		driver.findElement(By.id("new_password")).sendKeys(password);

	}

	@And("click on sign up button")
	public void click_on_sign_up_button() throws InterruptedException{
		Thread.sleep(2000);
		
		driver.findElement(By.id("create-account")).click();

		
	}

	@Then("user is navigated to the check email page")
	public void user_is_navigated_to_the_check_email_page() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	}


}
