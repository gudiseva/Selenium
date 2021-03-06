package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Gmail extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.yahoo.com/");
		selenium.start();
	}

	@Test
	public void testYahoo() throws Exception {
		selenium.open("/");
		selenium.type("id=lst-ib", "gmail");
		selenium.click("id=pa1");
		selenium.waitForPageToLoad("80000");
		selenium.type("id=Email", "harith08");
		selenium.type("id=Passwd", "88888888");
		selenium.click("id=signIn");
		'selenium.waitForPageToLoad("80000");
		'selenium.selectFrame("c1xtkwzf67pa2g");
		'selenium.click("css=#gbi4 > span.gbma");
		'selenium.click("id=gb_71");
		'selenium.waitForPageToLoad("80000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
