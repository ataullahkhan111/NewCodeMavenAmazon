package test;

import org.testng.annotations.Test;

import source.EditProfile;
import source.LoginPage;

public class Testcase4   extends launchQuit 
{
	@Test
	public void LoginPage()
	{
		LoginPage h2 = new LoginPage(driver);
		h2.aandlist(driver);
		h2.signInnew();
		h2.username();
		h2.continuebutton();
		h2.password();
		h2.signIn();
		
		EditProfile h3 = new EditProfile(driver);
		h3.accountandlist(driver);
		h3.newprofile();
		h3.newview();
		h3.neweditbutton();
		h3.newvariable();
		h3.continuenew();
		
	
}
}
