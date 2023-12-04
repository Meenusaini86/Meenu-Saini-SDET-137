package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class Graph_SD {
	
	public static WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";
	
	By getStartedBtn1 = By.xpath("//a[text()='Get Started']");
	By graph = By.xpath("//a[text()='Graph']");
	By graphRepresentationsgraph = By.xpath("//a[text()='Graph Representations']");
	
	
	@Then("user is on the home page and scroll down click on graph get started button")
	public void user_is_on_the_home_page_and_scroll_down_click_on_graph_get_started_button() {

		List<WebElement> listOfStartedBtn =	driver.findElements(getStartedBtn1);
		
		listOfStartedBtn.get(6).click();

	}

	@Given("user scroll downs and click on the graph link")
	public void user_scroll_downs_and_click_on_the_graph_link() {
		
		driver.findElement(graph).click();

	}

	@Given("user scroll downs and click on the Graph Representations link")
	public void user_scroll_downs_and_click_on_the_graph_representations_link() {

		driver.findElement(graphRepresentationsgraph).click();
		
	}

      @After
	
	public void close() {
		driver.close();
		driver.quit();
	}
	}
	

