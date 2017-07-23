package stepDefination;

import java.util.ArrayList;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;


public class LoginSteps{
	
	@Managed(driver="chrome")                              
    WebDriver driver;


	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {
	//	System.setProperty("webdriver.chrome.driver", "tools/chromedriver");	
		driver = new ChromeDriver();
		driver.get("http://www.executeautomation.com/demosite/Login.html");
		 
	}

	@And("^I enter the username and password$")
	public void i_enter_the_following_for_Login() throws Throwable {	
		driver.findElement(By.name("UserName")).sendKeys("admin");;
		driver.findElement(By.name("Password")).sendKeys("adminpassword");;

	}
	

	@Given("^I click login button$")
	public void i_click_login_button() throws Throwable {


	}

	@Then("^I should see the userform page$")
	public void i_should_see_the_userform_page() throws Throwable {
	
	}

}
