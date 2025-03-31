package stepdefinition;

import Baseclass.Baseclass;
import Locators.Home_page;
import PageObjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Baseclass {

	PageObjectManager pom = new PageObjectManager(driver);
	@Given("the user launches the {string} browser")
	public void the_user_launches_the_browser(String string) {
	   BrowserLaunch(string);

	}
	@When("the user navigates to {string}")
	public void the_user_navigates_to(String string) throws Exception {
	   geturl(string);

	}
//	@When("the user searches for {string} in the search bar")
//	public void the_user_searches_for_in_the_search_bar(String string) throws InterruptedException {
//		Home_page.Searchbar.click();
//		Thread.sleep(5000);
//		Home_page.Searchbar.sendKeys(string);
//		Thread.sleep(1000);
//	   Home_page.searchbutt.click();
//		Thread.sleep(1000);
////	   Home_page.above5000.click();
////		Thread.sleep(1000);
////	   Home_page.above5000.click();
////		Thread.sleep(1000);
////	   Home_page.select5000.click();
////		Thread.sleep(1000);
//	   Home_page.selectthefirstprod.click();
//
//	}
//	
}
