package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class Home_page extends Baseclass{
  
	public  Home_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
		public static WebElement Searchbar;
		
		@FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']")
		public static WebElement searchbutt;
		
//		@FindBy(xpath = "//div[@class='discover-tr-carousel-control discover-tr-carousel-control-right discover-tr-prevent-close']")
//		public static WebElement above5000;
//		
//		@FindBy(xpath = "//div[@aria-label='Over ₹5,000']")
//		public static WebElement select5000;
		
		@FindBy(xpath = "//span[text()='Results']/following::span[contains(text(),'Joyjam Toys ')]")
		public static WebElement selectthefirstprod;
	}
