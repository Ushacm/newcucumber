package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CuCuparameterization {
	WebDriver driver;
	String str;
	@Given("User open")
	public void user_open() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.name("Log in"));
	  
	}

	@When("Valid {string}and{string}")
	public void valid_and(String un, String pwd) throws InterruptedException {
		driver.findElement(By.id("Email")).sendKeys(un);

	    driver.findElement(By.name("Password")).sendKeys(pwd);

	    driver.findElement(By.cssSelector("input[value='Log in']")).click();

	       Thread.sleep(2000);

	   str=un;
	
	}

	@Then("Next Page")
	public void next_Page() {
		String msg =driver.findElement(By.cssSelector("a[class='account']")).getText();

	      

	       Assert.assertEquals(msg, str);

	       System.out.println("Test is passed");

	       driver.findElement(By.linkText("Log out")).click();

	       driver.close();
	
	}


}
