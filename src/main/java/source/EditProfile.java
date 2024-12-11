package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile {

		WebDriver driver;

		@FindBy(xpath="//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
		WebElement accountandlist;
		
		@FindBy(xpath="//button[@class='sc-fqkvVR sc-fTFjTM jZunJN eqmAHp']")
		WebElement manageprofile;
		
		@FindBy(xpath="//a[@class='sc-iGgWBj sc-fHjqPf fErbOa bdPZUm']")
		WebElement view;
		
		@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
		WebElement newedit;
		
		@FindBy(xpath="//input[@id='editProfileNameInputId']")
		WebElement newprofile;
	
		@FindBy(xpath="(//input[@class='a-button-input'])[2]")
		WebElement continuebutton;
		
		public void accountandlist(WebDriver driver)
		{
			Actions a1 = new Actions(driver);
			a1.moveToElement(accountandlist).perform();		
		}
	
		public void newprofile() {
			manageprofile.click();
		}

		public void newview()
		{
			view.click();		}
		
		public void neweditbutton() 
		{
			newedit.click();
		}
		
		
		public void newvariable()
		{
			newprofile.sendKeys("Bobby123");
		}
		
		public void continuenew()
		{
			continuebutton.click();
		}
		
		public EditProfile(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		
	
}
