package test;

import org.testng.annotations.Test;

import source.LoginPage;
import source.NewCategory;
import source.ProductDetail;
import source.Search;

public class TestCase7   extends  launchQuit
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
		
		
		NewCategory h6 = new NewCategory(driver);
		h6.searchnewcustomer();
		
		ProductDetail h7 = new ProductDetail(driver);
		h7.productdetails();
		h7.newproductdetails();
		h7.givendesc();
	
} 

}
