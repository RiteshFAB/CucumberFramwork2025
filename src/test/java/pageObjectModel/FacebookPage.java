package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

	WebDriver rDriver;
	
	public FacebookPage(WebDriver lDriver) {
		
		rDriver=lDriver;
		
		PageFactory.initElements(lDriver, this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement user;
	@FindBy(xpath="//input[@name='pass']")
	WebElement pass;
	@FindBy(xpath="//button[@name='login']")
	WebElement login;
	
	public void launchUrl(){
		
		rDriver.get("https://www.facebook.com/");
		rDriver.manage().window().maximize();
	}
	
	public void enterCread() {
		user.sendKeys("Ritesh");
		pass.sendKeys("12345678");
		login.click();
	}
	
	public void validateHomePage() {
		String title=rDriver.getTitle();
		System.out.println("Current Page titile "+title);
	}
	
	
}
