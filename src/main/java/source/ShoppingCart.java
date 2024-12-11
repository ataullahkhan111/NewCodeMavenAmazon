package source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart 
{
// (//button[@class='a-button-text'])[2]
	
	
	WebDriver driver;

	@FindBy(xpath="(//button[@class='a-button-text'])[2]")
	WebElement newshoppingcart;
	
	@FindBy(xpath="//button[@id='a-autoid-105-announce']")
	WebElement CartButton;
	
	public void shoppingcart()
	{
		newshoppingcart.click();
	}
	
	public void newcartbutton()
	{
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		
		Iterator<String> i1=			s1.iterator();
		String parentid=		i1.next();
		String childid=		i1.next();
		System.out.println( parentid);
		System.out.println(childid);
		
	    driver.switchTo().window(childid);
		
	}
	
	public void clickcrt()
	{
		CartButton.click();
	}
	
	public ShoppingCart(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
}