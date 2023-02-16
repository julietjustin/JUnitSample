package com.obsqura.JunitSample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PageSourceMain extends PageSourceNew {
	String actualSource,expSource = "";
	@Test
	public void pageSourceEqual() {
		actualSource = driver.getPageSource();
		assertTrue(actualSource.contains(expSource));
	}
	String actualTitle,expTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	@Test
	public void titleEqual() {
		actualTitle=driver.getTitle();
		assertEquals(expTitle,actualTitle);		
	}
	@Test
	public void nextPage() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
	}
	

}
