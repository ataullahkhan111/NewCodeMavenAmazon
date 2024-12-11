package test;

import org.testng.annotations.Test;

import source.LoginPage;
import source.Search;
import source.ShoppingCart;

public class TestCase9 extends  launchQuit
{
	@Test
	public void newLoginPage()
	{
		LoginPage h2 = new LoginPage(driver);
		h2.aandlist(driver);
		h2.signInnew();
		h2.username();
		h2.continuebutton();
		h2.password();
		h2.signIn();
		
		Search h5 = new Search(driver);
		h5.searchbox();
		
		ShoppingCart h8 = new ShoppingCart(driver);
		h8.shoppingcart();
		h8.newcartbutton();
		h8.clickcrt();
		
	}
}
		