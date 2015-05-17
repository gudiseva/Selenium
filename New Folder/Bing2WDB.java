package com.example.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Bing2WDB extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.bing.com/";
		Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);
		selenium.start();
	}

	@Test
	public void testBing2WDB() throws Exception {
		selenium.open("/");
		selenium.type("id=sb_form_q", "haritha murari");
		selenium.click("id=sb_form_go");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Matheran Rope Gliding (Arvind & Haritha) - 26-Oct-2010 ...");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
