package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductDetail 
{

	// (//span[@class='rush-component s-latency-cf-section']/div/div)[3]
	
	@FindBy(xpath="(//span[@class='rush-component s-latency-cf-section']/div/div)[3]")
	WebElement newe1;
	
	@FindBy(xpath="(//span[@class='a-price'])[4]")
	WebElement new2;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-star-small a-star-small-3'])[1]")
	WebElement review;
	
	@FindBy(xpath="(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]")
	WebElement newdesc;
	
	public void productdetails()
	{

	Assert.assertEquals(new2.isDisplayed(), true);
    
	}
	
	public void newproductdetails()
	{
		Assert.assertEquals(review.isDisplayed(), true);

	}
	
	
	public void givendesc()
	{
		Assert.assertEquals(newdesc.isDisplayed(), true);

	}
	
	
	
	
	// PageFactory
		public ProductDetail(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
}
