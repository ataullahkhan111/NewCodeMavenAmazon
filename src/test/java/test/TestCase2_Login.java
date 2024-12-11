package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import source.DDT_Class;
import source.LoginPage;

public class TestCase2_Login extends launchQuit {
	@Test
	public void LoginPage() throws EncryptedDocumentException, IOException
	{
		
		DDT_Class h18 = new DDT_Class();
		h18.newDDT();
		
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