package stepDefination.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.FacebookPage;

public class FacebookStepDef {

	public WebDriver driver;
	public FacebookPage fb;
	
	@Given("User launch Browser and the Facebook url")
	public void user_launch_Browser_and_the_Facebook_url() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  fb=new FacebookPage(driver); 
	  fb.launchUrl();
		
	}

	@When("User enters the creads")
	public void user_enters_the_creads() {
	   fb.enterCread();
	}

	@Then("User validate the Home page of Facebook Application")
	public void user_validate_the_Home_page_of_Facebook_Application() {
	   fb.validateHomePage();
	}

}
