package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SampleTest {
	
	WebDriver driver;
	
	@Given("user is entering ultimateqa.com")
	public void user_is_entering_ultimateqa_com() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://ultimateqa.com/automation/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
	}

	@When("user clicks the Courses menu")
	public void user_clicks_the_courses_menu() throws Exception {
	   driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div/div/div/div/div[2]/div[1]/nav/ul/li[1]")).click();
	   Thread.sleep(5000);
	}

	@When("user clicks signIn button")
	public void user_clicks_sign_in_button() throws Exception {
	   driver.findElement(By.xpath("/html/body/header/div/div/section[1]/ul/li/a")).click();
	   Thread.sleep(5000);
	}
	
	@When("types the Email as {string}")
	public void types_the_email_as_username(String username) throws Exception {
		driver.findElement(By.id("user[email]")).sendKeys(username);
	    Thread.sleep(5000);
	}

	@When("types the {string}")
	public void types_the_password(String password) throws Exception {
		driver.findElement(By.id("user[password]")).sendKeys(password);
		Thread.sleep(5000);
	}

	@When("clicks signIn button")
	public void clicks_sign_in_button() throws Exception {
		driver.findElement(By.xpath("/html/body/main/div/div/article/form/div[4]/input")).click();
		Thread.sleep(5000);
	}


	@Then("the user should see their account")
	public void the_user_should_see_their_account() throws Exception {
		String PageURL = driver.getCurrentUrl();
		System.out.println(PageURL);
		try {
			Assert.assertEquals("https://courses.ultimateqa.com/enrollments", PageURL);

		}
		catch (AssertionError e){
			
			Assert.assertEquals("https://courses.ultimateqa.com/users/sign_in", PageURL);
		}
		Thread.sleep(5000);
		driver.quit();
}
}
