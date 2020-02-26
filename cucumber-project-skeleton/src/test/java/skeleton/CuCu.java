package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CuCu {
	WebDriver driver;
	@Given("OnlineTestMeApp is opened")
	public void onlinetestmeapp_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("I provide valid password")
	public void i_provide_valid_password() {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	}

	@Then("User should be able to login")
	public void user_should_be_able_to_login() {
		String msg=driver.findElement(By.cssSelector("ul.nav")).getText();
		String msg2="Hi, Lalitha";
		Assert.assertTrue(msg.contains(msg2));
		driver.findElement(By.linkText("SignOut")).click();
	}
}
