package test;

import org.testng.annotations.Test;

import source.ItemQuantities;
import source.LoginPage;

public class TestCase10 extends launchQuit {

	@Test
	public void logincase() throws InterruptedException
	{
		LoginPage h2 = new LoginPage(driver);
		h2.aandlist(driver);
		h2.signInnew();
		h2.username();
		h2.continuebutton();
		h2.password();
		h2.signIn();

		ItemQuantities h9= new ItemQuantities(driver);
		h9.itemssearch();
		h9.Addcart();
		h9.Clickcart();
		h9.Increment();
		h9.Decrement();
	}
}
