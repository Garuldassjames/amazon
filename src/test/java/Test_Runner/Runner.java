package Test_Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\test\\java\\Features",glue = {"stepdefinition"},plugin = {"pretty","html:target\\report\\aruldassjames.html"})
	 
	public class Runner {	
	
	
}
