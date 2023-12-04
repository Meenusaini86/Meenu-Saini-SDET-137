package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class Signin_valid_invalid_SD {

	public static WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";

	By getStartedBtn = By.className("btn");
	By NumpyNinja = By.className("navbar-brand");
	By signinBtn = By.xpath("//div[2]//ul//a[3]");
	By username = By.id("id_username");
	By password = By.id("id_password");
	By LoginBtn = By.xpath("//div[2]//div//div[2]//form//input[4]");
	By signoutBtn = By.xpath("//div[2]//ul//a[3]");
	By inValidMsg = By.className("alert-primary");

	@BeforeStep
	public void delay() {
		try {

			Thread.sleep(60);
		} catch (InterruptedException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}

	@Given("user is on the website home page and user click on get started button")
	public void user_is_on_the_website_home_page_and_user_click_on_get_started_button() {

		driver = new ChromeDriver();
		driver.get(URL);
		
		driver.findElement(getStartedBtn).click();

	}


	@When("user is navigated to the login home page")
	public void user_is_navigated_to_the_login_home_page() {

		driver.findElement(NumpyNinja).isDisplayed();
	}

	@Then("user clicks on the sign in button")
	public void user_clicks_on_the_sign_in_button() {

		driver.findElement(signinBtn).click();
	}

	@Given("user enters valid username and password")
	public void user_enters_valid_username_and_password() {

		driver.findElement(username).isDisplayed();
		driver.findElement(password).isDisplayed();

		driver.findElement(username).sendKeys("mvs.com");
		driver.findElement(password).sendKeys("autum@23");

	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {

		driver.findElement(LoginBtn).click();

	}

	@Then("user is navigated to the portal home page")
	public void user_is_navigated_to_the_portal_home_page() {

		driver.findElement(signoutBtn).isDisplayed();

	}

	@And("after reaching to portal home page user clicks on the logout button")
	public void after_reaching_to_portal_home_page_user_clicks_on_the_logout_button() {

		driver.findElement(signoutBtn).click();

		 driver.close();
		 driver.quit();
	}

	@Given("user enters invalid username and valid password")
	public void user_enters_invalid_username_and_valid_password() {

		driver.findElement(username).isDisplayed();
		driver.findElement(password).isDisplayed();

		driver.findElement(username).sendKeys("m1vs.com");
		driver.findElement(password).sendKeys("autum@23");

	}

	@When("click on login button")
	public void click_on_login_button() {

		driver.findElement(LoginBtn).click();
	}

	@Then("System should alert user")
	public void system_should_alert_user() {

		driver.findElement(inValidMsg).isDisplayed();

		driver.close();
	    driver.quit();
	}

	@Given("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {

		driver.findElement(username).isDisplayed();
		driver.findElement(password).isDisplayed();

		driver.findElement(username).sendKeys("mvs.com");
		driver.findElement(password).sendKeys("auatum@23");
	}

	@Given("user enters invalid username and invalid password")
	public void user_enters_invalid_username_and_invalid_password() {

		driver.findElement(username).isDisplayed();
		driver.findElement(password).isDisplayed();

		driver.findElement(username).sendKeys("m2vs.com");
		driver.findElement(password).sendKeys("auatum@23");

	}

}
