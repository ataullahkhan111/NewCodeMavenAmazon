package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class IncorrectloginPage extends INewRetryAnalyzer
{

	WebDriver driver;

	// Step1
	@FindBy(xpath="//a[@class='nav-a nav-a-2   nav-progressive-attribute']")
	WebElement accountandlist;
	
	@FindBy (xpath="(//span[@class='nav-action-inner'])[1]")
	WebElement signin;
	
	@FindBy(id="ap_email")
	WebElement username_tf;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement password_tf;
	
	@FindBy(id="signInSubmit")
	WebElement signIn;
	
	

	public void aandlist(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();		
	}
	

	public void signInnew()
	{
		signin.click();
	
	}
	
	public void username()
	{
		username_tf.sendKeys("ataullahkhan12wert@gmail.com12345");
	}
	
	public void continuebutton()
	{
		continue_button.click();
	}
	
	public void password()
	{
		password_tf.sendKeys("Curran@12345"); // Incorrect password
	}
	
	public void signIn()
	{
		signIn.click();
		
	}
	
	// PageFactory
	public IncorrectloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}

