package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class PicasaRC extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://picasaweb.google.com/");
		selenium.start();
	}

	@Test
	public void testPicasaRC() throws Exception {
		selenium.open("/108144970753716579444?gsessionid=yzmIR5Xl6aYauxkD31928g");
		selenium.click("css=img.gphoto-album-cover-img");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
