package StepDefinition;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
public class Linked_listed_SD {
 

	public static WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";

	By getStartedBtn = By.xpath("//div[1]//div//div//a//button");
	By signinBtn = By.xpath("//a[text()='Sign in']");
	By username = By.id("id_username");
	By password = By.id("id_password");
	By LoginBtn = By.xpath("//div[2]//div//div[2]//form//input[4]");
	By signoutBtn = By.xpath("//div[2]//ul//a[3]");
	By NumpyNinja = By.className("navbar-brand");
	By getstartedBtn1 = By.xpath("//a[text()='Get Started']");
	By TopicsCovered = By.className("bg-secondarytext-white");
	By Introduction = By.xpath("//a[text()='Introduction']");
	By Tryhere = By.className("btn-info");
	By tryeditor = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By RunButton = By.xpath("//*[@id=\"answer_form\"]/button");
	By createLinkedList = By.xpath("//div[2]//ul[2]//a");
	By Typesoflinkedlist = By.xpath("//div[2]//ul[3]//a");
	By Implementation = By.xpath("//div[2]//ul[4]//a");
	By Traversal = By.xpath("//div[2]//ul[5]//a");
	By Insertion = By.xpath("//div[2]//ul[6]//a");
	By Deletion = By.xpath("//div[2]//ul[7]//a");

	@BeforeStep
	public void delay() {
		try {

			Thread.sleep(80);
		} catch (InterruptedException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}

	@Given("user is on the website page and click on get started button")
	public void user_is_on_the_website_page_and_click_on_get_started_button() {

		driver = new ChromeDriver();
		driver.get(URL);


		driver.findElement(getStartedBtn).click();
	}

	@When("user is navigated to the login page now user clicks on sign in button")
	public void user_is_navigated_to_the_login_page_now_user_clicks_on_sign_in_button() {

		driver.findElement(signinBtn).click();

	}

	@Then("user enters username and password and click login button")
	public void user_enters_username_and_password_and_click_login_button() {

		driver.findElement(username).isDisplayed();
		driver.findElement(password).isDisplayed();

		driver.findElement(username).sendKeys("mvs.com");
		driver.findElement(password).sendKeys("autum@23");

		driver.findElement(LoginBtn).click();
	}

	@And("user is on the home page and click on Linked list get started button")
	public void user_is_on_the_home_page_and_click_on_linked_list_get_started_button() {

	List<WebElement> listOfStartedBtn =	driver.findElements(getstartedBtn1);
	
	listOfStartedBtn.get(2).click();
	
	}

	@Given("user scroll downs and click on the introduction link")
	public void user_scroll_downs_and_click_on_the_introduction_link() {

	
		driver.findElement(Introduction).click();
	}

	@And("user scrolls down and clicks on TRY HERE button")
	public void user_scrolls_down_and_clicks_on_try_here_button() {

		driver.findElement(Tryhere).click();
	}

	@When("user redirected to page tryeditor with  Run button to test")
	public void user_redirected_to_page_tryeditor_with_run_button_to_test() {
		
		
		driver.findElement(tryeditor).sendKeys("print 'hello'");
		
	}

	@Then("after writing code in tryeditor, user click on RUN button to check result")
	public void after_writing_code_in_tryeditor_user_click_on_run_button_to_check_result() {
 
		
	     driver.findElement(RunButton).click();
	}

	
	@Given("user scrolls down and click on the Create a Linked List link")
	public void user_scrolls_down_and_click_on_the_create_a_linked_list_link() {
 
		driver.findElement(createLinkedList).click();
	}

	

	@Given("user scrolls down and click on the Types of Linked list link")
	public void user_scrolls_down_and_click_on_the_types_of_linked_list_link() {
 
		driver.findElement(Typesoflinkedlist).click();
	}

	
	@Given("user scrolls down and click on the Implementation of linked list in python link")
	public void user_scrolls_down_and_click_on_the_implementation_of_linked_list_in_python_link() {
 
		driver.findElement(Implementation).click();
	}

	
	@Given("user scrolls down and click on the Traversal link")
	public void user_scrolls_down_and_click_on_the_traversal_link() {
 
		driver.findElement(Traversal).click();
	}

	

	@Given("user scrolls down and click on the Insertion link")
	public void user_scrolls_down_and_click_on_the_insertion_link() {

		
		driver.findElement(Insertion).click();
	}

	
	@Given("user scroll sdown and click on the Deletion link")
	public void user_scroll_sdown_and_click_on_the_deletion_link() {

		
		driver.findElement(Deletion).click();
	}


	}
	
