package source;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemQuantities 
{
	WebDriver driver;

	@FindBy(id ="twotabsearchtextbox")
	WebElement e1;

    @FindBy(xpath="(//button[@class='a-button-text'])[62]")
    WebElement e88;
	
	@FindBy(xpath="(//button[@class='a-button-text'])[1]")
	WebElement e2;
	
	@FindBy (xpath="//a[@class='nav-a nav-a-2 nav-progressive-attribute']")
	WebElement e3;
	
	
	@FindBy (xpath="(//button[@class='a-declarative'])[2]")
	WebElement e4;
	
	@FindBy (xpath="(//button[@class='a-declarative'])[1]")
	WebElement e5;
	
public void itemssearch()
{
	e1.sendKeys("Pen" +Keys.ENTER);
}


public void Addcart() throws InterruptedException
{
	Thread.sleep(3000);
	e2.click();
}

public void newaddcart() {
	
	e88.click();;
}

public void Clickcart()
{
	e3.click();
}

public void Increment()
{
	e4.click();
}

public void Decrement()
{
	e5.click();
}

public ItemQuantities(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


}
