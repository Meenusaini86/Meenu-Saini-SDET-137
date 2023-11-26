package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class Stack_SD {
	
	public static WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";
	
	By getstartedBtn = By.xpath("//a[text()='Get Started']");;
	By opertaionInStack = By.xpath("//a[text()='Operations in Stack']");
	By implementation = By.xpath("//a[text()='Implementation']");
	By applications = By.xpath("//a[text()='Applications']");
	
	@Then("user is on the home page and click on Stack get started button")
	public void user_is_on_the_home_page_and_click_on_stack_get_started_button() {


		
		
		List<WebElement> listOfStartedBtn =	driver.findElements(getstartedBtn);
		
		listOfStartedBtn.get(3).click();
	}

	@Given("user scroll downs and click on the Operations in Stack link")
	public void user_scroll_downs_and_click_on_the_operations_in_stack_link() {


		driver.findElement(opertaionInStack).click();
	}

	@Given("user scroll downs and click on the Implementation link")
	public void user_scroll_downs_and_click_on_the_implementation_link() {


		driver.findElement(implementation).click();
	}

	@Given("user scroll downs and click on the applications link")
	public void user_scroll_downs_and_click_on_the_applications_link() {


		driver.findElement(applications ).click();
	}

}
