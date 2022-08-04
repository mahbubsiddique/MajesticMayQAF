package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.careerhack.common.MajesticMayGoogleBase;
import com.careerhack.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MajesticMayGoogleSearch extends MajesticMayGoogleBase{
	
	HomePage hp;
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchBrowser();

	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		hp = new HomePage(driver);
		hp.enterSearch(string);
		
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		hp.clickSearch();

		
	}

	@Then("I receive relevant results")
	public void i_receive_relevant_results() {
		
		WebElement searchResult = driver.findElement(By.id("result-stats"));
		
		String results = searchResult.getText();
		
		System.out.println("===============================================");
		System.out.println(results);
		System.out.println("===============================================");
		
		closeBrowser();
	}


}
