package CuCumber_StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LogIn_StepDefination_Class {
	WebDriver driver;
	@Given("^Lunch Application Url$")
	public void lunch_Application_Url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	    
	}

	@Then("^Click Login$")
	public void click_Login() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id("login2")).click();
	    
	}

	@Then("^Enter Username$")
	public void enter_Username() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id("loginusername")).sendKeys("FaceBook");
	
	}

	@Then("^Enter Password$")
	public void enter_Password() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id("loginpassword")).sendKeys("1234567");
		  
	}

	@Then("^Click Login(\\d+)$")
	public void click_Login(int arg1) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	}

	@Then("^Verify User Login Successfully$")
	public void verify_User_Login_Successfully() throws Throwable {
		Thread.sleep(2000);
		boolean log= driver.findElement(By.linkText("Welcome FaceBook")).isDisplayed();
		Assert.assertTrue(log);
		
	}


}
