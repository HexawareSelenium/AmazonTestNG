package com.amazon.Test;

import org.testng.annotations.Test;

import com.amazon.POM.MobilePage;

public class MobileTest extends MobilePage{

	@Test
	public void verifyTest() {
		AmazonHomeTest ht = new AmazonHomeTest();
		MobilePage mp = new MobilePage();
		ht.verifyTest();
		mp.mobile();
		mp.cart();
	}
}
