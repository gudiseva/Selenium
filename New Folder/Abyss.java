package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Abyss extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://inlth7308/");
		selenium.start();
	}

	@Test
	public void testAbyss() throws Exception {
		selenium.open("/Selenium/login.html");
		selenium.type("name=username", "haritha");
		selenium.type("name=pword", "nag");
		selenium.click("name=Submit");
		assertEquals("Login was successful", selenium.getAlert());
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
