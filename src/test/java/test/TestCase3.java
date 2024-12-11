package test;

import org.testng.annotations.Test;

import source.IncorrectloginPage;

public class TestCase3  extends launchQuit 
{
	@Test(retryAnalyzer=source.INewRetryAnalyzer.class)

	public void LoginPage()
	{
	IncorrectloginPage h2 = new IncorrectloginPage(driver);
	h2.aandlist(driver);
	h2.signInnew();
	h2.username();
	h2.continuebutton();
	h2.password();
	h2.signIn();
	
}
}