package test;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.LoginPage;

@Listeners(source.NewTestListeneres.class)
public class TestCase2 extends launchQuit
{

	@Test
	public void LoginPage()
	{
	LoginPage h2 = new LoginPage(driver);
	h2.aandlist(driver);
	h2.signInnew();
	h2.username();
	h2.continuebutton();
	h2.newmethod();
	
	
	h2.password();
	h2.signIn();
	
	Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
}
}