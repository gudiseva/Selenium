package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Yahoo extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://login.yahoo.com/");
		selenium.start();
	}

	@Test
	public void testYahoo() throws Exception {
		selenium.open("/config/login_verify2?.intl=in&.src=ym");
		selenium.type("id=username", "harith08");
		selenium.type("id=passwd", "Coimbatore08");
		selenium.click("id=persistent");
		selenium.click("id=.save");
		selenium.click("id=yui_3_2_0_1_13228082566601749");
		selenium.click("link=Sign Out");
		selenium.waitForPageToLoad("80000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
