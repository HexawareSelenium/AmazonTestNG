package com.amazon.Test;

import org.testng.annotations.Test;

import com.Generic.DriverUtils;
import com.POM.BasePage;
import com.amazon.POM.AmazonHomePage;

public class AmazonHomeTest extends BasePage{

	@Test
	public void verifyTest() {
		DriverUtils.getDriver().get("https://www.amazon.in/");
		AmazonHomePage hp = new AmazonHomePage();
		hp.enterSearch("Mobile");
		hp.Suggestion();
	}
}
