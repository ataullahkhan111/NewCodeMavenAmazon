package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCategory 
{
	WebDriver driver;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[5]")
	WebElement searchcustomer;
	
	
	
	public void searchnewcustomer()
	{
		searchcustomer.click();
	}

	
	public NewCategory(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
}
