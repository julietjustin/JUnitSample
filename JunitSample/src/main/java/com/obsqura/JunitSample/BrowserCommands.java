package com.obsqura.JunitSample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BrowserCommands extends Base {
	@Test
	public void basicCommands() {
		String actualTitle,actualURL,actualSource,expectedTitle="Obsqura Testing";
		actualTitle=driver.getTitle();
		actualURL=driver.getCurrentUrl();
		actualSource=driver.getPageSource();
		assertEquals(expectedTitle,actualTitle);

	}
	@Test
	public void navigateCommands() throws InterruptedException {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
