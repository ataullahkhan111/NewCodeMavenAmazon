package test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import source.HomePage;

public class TestCase1 extends launchQuit

{

	@Test
	public void newregisteruser() throws InterruptedException
	{
		
		HomePage h1 = new HomePage(driver);
		h1.aandlist(driver);
		h1.starthere();
		h1.customername();
		h1.contactno();
		h1.password();
		h1.verifymobile();
		h1.assermethod();
		
		Assert.assertEquals(driver.getTitle(), "Amazon Phone Verification");
			
	}
	
}
