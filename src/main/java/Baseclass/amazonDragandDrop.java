package Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonDragandDrop {
	
	// TODO Auto-generated constructor stub
public static void draganddrop() throws Exception{
	WebDriverManager.chromedriver().clearDriverCache().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01wnc9bcgf1xge1dvr2epkxsf5n72050.node0");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Actions act = new Actions();
	
	WebElement deals = driver.findElement(By.xpath("//div[@class=\"ui-panel ui-widget ui-widget-content ui-corner-all\"]"));
	
//	WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]"));
	
	WebElement searchButt = driver.findElement(By.xpath("//p[contains(.,\"Drop here\")]"));
	System.out.println("before");
	act.dragAndDrop(deals, searchButt);
	System.out.println("after");
	Thread.sleep(2000);
	
//	searchButt.click();


}
	public static void main(String[] args) throws Exception{
		draganddrop();
		
	}
}
