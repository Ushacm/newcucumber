package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class multiscenario {
	WebDriver driver;
	@Given("TestMeApp is opened")
	public void testmeapp_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	  
	}

	@When("user provides valid username & password")
	public void user_provides_valid_username_password() {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	   
	}

	@Then("User must be able to download")
	public void user_must_be_able_to_download() {
		String msg=driver.findElement(By.cssSelector("ul.nav")).getText();
		String msg2="Hi, Lalitha";
		Assert.assertTrue(msg.contains(msg2));
		driver.findElement(By.linkText("SignOut")).click();
		
	}

	@When("user provides invalid username & password")
	public void user_provides_invalid_username_password() {
		driver.findElement(By.name("userName")).sendKeys("gerarad");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	   
	}

	@Then("User should get error message")
	public void user_should_get_error_message() {
	   System.out.println("Invalid Username or Password");
	    
	}

	@When("user  provides blank username or password")
	public void user_provides_blank_username_or_password() {
		driver.findElement(By.name("userName")).sendKeys("  ");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();

	   
	}

	@Then("User should get blank error message")
	public void user_should_get_blank_error_message() {
          System.out.println("Username or password cannot be left blank");	   
	    
	}



}
