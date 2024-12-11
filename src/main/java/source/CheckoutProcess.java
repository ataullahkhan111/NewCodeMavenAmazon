package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutProcess {

	
	WebDriver driver;
//	(//button[@class='a-button-text'])[62]
	
	@FindBy(xpath="//a[@id='nav-cart']")
	WebElement checkout;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedbuy;
	
	@FindBy(id="shipToThisAddressButton")
	WebElement address;
	
	@FindBy(name="ppw-instrumentRowSelection")
	WebElement payement;
	
	@FindBy(xpath="(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
	WebElement entercarddetails;
	
	@FindBy(name = "ApxSecureIframe")
	WebElement newApxSecureIframe;
	
	@FindBy(name="addCreditCardNumber")
	WebElement newaddCreditCardNumber;

	@FindBy(name="ppw-expirationDate_month")
	WebElement newppwexpirationDatemonth;
	
	@FindBy(name="ppw-expirationDate_year")
	WebElement newppwexpirationDate_year;
	
	@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
	WebElement newppwwidgetEventAddCreditCardEvent;
	
	@FindBy(xpath="//input[@id='field']")
	WebElement newaddCreditCardVerificationNumber;
	
	public void proceed() throws InterruptedException
	{
		Thread.sleep(3000);
		checkout.click();
	}
	
	public void newproceed()
	{
		proceedbuy.click();
	}
	
	public void newaddress()
	{
		address.click();
	}
	
	public void payement()
	{
		payement.click();
	}
	
	public void entercarddetails()
	{
		entercarddetails.click();
	}
	
	public void givenapxsecureIframe()
	{
		
		driver.switchTo().frame(newApxSecureIframe);
	}
	
	public void addCreditCardNumber()
	{
		
		newaddCreditCardNumber.sendKeys("6083329746093533");
	}
	
	public void newexpirationmonth()
	{
		Select s1 = new Select(newppwexpirationDatemonth);
		s1.selectByIndex(7);
	}
	
	
	public void newexpirationyear()
	{
		Select s2 = new Select(newppwexpirationDate_year);
		s2.selectByIndex(5);
	}
	
	public void entercarddetailsnew()
	{
		newppwwidgetEventAddCreditCardEvent.click();
	}
	
	public void newswitchto()
	{
		driver.switchTo().defaultContent();
	}
	
	public void addnewaddCreditCardVerificationNumber() throws InterruptedException
	{
		Thread.sleep(4000);
		newaddCreditCardVerificationNumber.sendKeys("000");
	}
	
	public void newalert()
	{
		driver.switchTo().alert().accept();
	}
	
	public CheckoutProcess(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
