package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class Graph_SD {

	

	By Tryhere = By.className("btn-info");
	By tryeditor = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By RunButton = By.xpath("//*[@id=\"answer_form\"]/button");
	By getStartedBtn1 = By.xpath("//a[text()='Get Started']");
	By graph = By.className("list-group-item");
	By graphRepresentationsgraph = By.xpath("//a[text()='Graph Representations']");

	

	@Then("user is on the home page and scroll down click on graph get started button")
	public void user_is_on_the_home_page_and_scroll_down_click_on_graph_get_started_button() {

		List<WebElement> listOfStartedBtn = Linked_listed_SD.driver.findElements(getStartedBtn1);

		listOfStartedBtn.get(6).click();

	}

	@Given("user scroll downs and click on the graph link")
	public void user_scroll_downs_and_click_on_the_graph_link() {

		Linked_listed_SD.driver.findElement(graph).click();

	}

	@And("now scrolls down and clicks on TRY HERE button")
	public void now_scrolls_down_and_clicks_on_try_here_button() {

		Linked_listed_SD.driver.findElement(Tryhere).click();
	}

	@When("redirected to page tryeditor and write text in it")
	public void redirected_to_page_tryeditor_and_write_text_in_it() {

		Linked_listed_SD.driver.findElement(tryeditor).sendKeys("print 'hello'");
	}

	@Then("user click on RUN button to check result")
	public void user_click_on_run_button_to_check_result() {

		Linked_listed_SD.driver.findElement(RunButton).click();
	}

	@Given("user scroll downs and click on the Graph Representations link")
	public void user_scroll_downs_and_click_on_the_graph_representations_link() {

		Linked_listed_SD.driver.findElement(graphRepresentationsgraph).click();

	}

}

