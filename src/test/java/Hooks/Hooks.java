package Hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Baseclass.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass {
@Before
	public static void beforehooks() {
		System.out.println("before hooks");
	}
@After
	public static void afterhooks(Scenario scenario) throws IOException {

	TakesScreenshot(scenario);
//	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//	scenario.attach(screenshot, "image/png", "screenshot");
//	driver.quit();
	}
}
