package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Login {
	WebDriver driver = new ChromeDriver();
	String expectedText = "Deepak";
	
	@Given("^User navigates to EAG portal$")
	public void user_navigates_to_EAG_portal() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak.bhatia\\DeepakSynechron\\deepakpackage\\chromedriver.exe");
		driver.get("https://eag.synechron.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@Given("^enters the username$")
	public void enters_the_username() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("UserName")).sendKeys("deepak.bhatia");
		
		
	    
	}

	@Given("^enters the password$")
	public void enters_the_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Password")).sendKeys("ab16AB!^");
	    
	}

	@Given("^click on Login Button$")
	public void click_on_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("html/body/div[2]/form/div/div[2]/div[4]/input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	   
	}

	@Then("^User is able to login successfully$")
	public void user_is_able_to_login_successfully()  {
	    // Write code here that turns the phrase above into concrete actions
	 String actualtext = driver.findElement(By.xpath(".//*[@id='headerDashboardModel']/div[1]/div[1]/div/div[2]/ul/li[4]/div[1]/p/span")).getText();
	 Assert.assertEquals(expectedText, actualtext);
	 driver.close();
	 
	}

}
