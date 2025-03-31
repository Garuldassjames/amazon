package PageObjectManager;

import org.openqa.selenium.WebDriver;

import Baseclass.Baseclass;
import Locators.Home_page;

public class PageObjectManager extends Baseclass {

	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	private  Home_page home_page ;
	
	public Home_page getHome_page() {
	
		if (home_page == null) {
		
			home_page = new Home_page(driver);
		
		}
		
		return home_page;
	}
	
}
