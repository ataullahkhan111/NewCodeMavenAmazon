package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{

	WebDriver driver;

	@FindBy(xpath="//a[@class='nav-a nav-a-2   nav-progressive-attribute']")
	WebElement accountandlist;
		
	@FindBy(xpath ="(//a[@class='nav-a'])[1]")
	WebElement starthere;
	
	// id="ap_customer_name"
	
	@FindBy(id="ap_customer_name")
	WebElement customername;
	
	// id="ap_phone_number"
	
	@FindBy(id="ap_phone_number")
	WebElement contactno;
	
	// id="ap_password"
	
	@FindBy(id="ap_password")
	WebElement password;
	
	// id="continue"
	
	@FindBy(xpath="//span[@class='a-button a-button-span12 a-button-primary auth-requires-verify-modal']")
	WebElement verifymobile;
	
	// step 2
	
	public void aandlist(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();		
	}
	
	
	
		public void starthere()
		{
			starthere.click();
		}
	
         
		public void customername()
		{
			customername.sendKeys("Ataullah Khan");
		}
		
		public void contactno()
		{
			contactno.sendKeys("6307896085");
		}
		
		public void password()
		{
			password.sendKeys("Curran@123456");
		}
		
		
		public void verifymobile()
		{
			verifymobile.click();
		}
		
		public WebElement assermethod() 
		{
			
			return password;
		}
		
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
}