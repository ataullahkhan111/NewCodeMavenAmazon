package test;

import org.testng.annotations.Test;

import source.CheckoutProcess;
import source.ItemQuantities;
import source.LoginPage;

public class TestCase11 extends launchQuit 
{	
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
	//	h9.Clickcart();
		
		CheckoutProcess h10 = new CheckoutProcess(driver);
		h10.proceed();
		h10.newproceed();
		h10.newaddress();
		h10.payement();
		h10.entercarddetails();
		h10.givenapxsecureIframe();
		h10.addCreditCardNumber();
		h10.newexpirationmonth();
		h10.newexpirationyear();
		h10.entercarddetailsnew();
		h10.newswitchto();
		h10.newalert();
		h10.addnewaddCreditCardVerificationNumber();
	}

}
