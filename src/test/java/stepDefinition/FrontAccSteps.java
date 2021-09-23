package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrontAccSteps {
	WebDriver driver;
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		   driver=new ChromeDriver();
	}
	
	@After
	public void after() throws Exception{
		Thread.sleep(2000);
		driver.quit();
	}
	

		@Given("User is on login page")
		public void user_is_on_login_page() {
		    driver.get("http://demo.frontaccounting.eu/");
		}


			@When("user enters username as {string} and password as {string} and clicks on login")
			public void user_enters_username_as_and_password_as_and_clicks_on_login(String un, String pwd) {
				 driver.findElement(By.name("user_name_entry_field")).clear();
				    driver.findElement(By.name("user_name_entry_field")).sendKeys(un);

				    driver.findElement(By.name("password")).clear();
				    driver.findElement(By.name("password")).sendKeys(pwd);
				    driver.findElement(By.name("SubmitUser")).click();
			}
			
			
			  @Then("login {string} be happen")
			  public void login_be_happen(String status)
			  {
			  
			  if(status.equals("should"))
			  {
				  if(driver.getTitle().equals("Main Menu")) {
			  System.out.println("Positive Test Pass");
			  } else {
			  System.out.println("Positive Test Failed");
			  Assert.fail("Positive Test Failed"); 
			  } 
				  } 
			  else {
			  if(driver.getTitle().equals("Main Menu")) {
			  System.out.println("Negative Test Failed"); 
			  } else {
			  System.out.println("Negative Test Pass"); 
			  }
			  }
			  }
			 


}
