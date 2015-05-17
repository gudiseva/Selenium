package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Bing3RC extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.bing.com/");
		selenium.start();
	}

	@Test
	public void testBing3RC() throws Exception {
		selenium.open("/");
		selenium.type("id=sb_form_q", "nag arvind gudiseva");
		selenium.click("id=sb_form_go");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Picasa Web Albums - Nag Arvind Gudiseva");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
