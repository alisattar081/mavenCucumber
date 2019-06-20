package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepDefination {
	WebDriver driver;
	
	
	@Given("^Open google chrome browser and start applaction$")
	public void open_google_chrome_browser_and_start_applaction(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\meher a javed\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url = "http://pos.uhaul.net/";
		driver.get(url);
	}

	@Given("^I use vaild \"([^\"]*)\" and vaild \"([^\"]*)\"$")
	public void i_use_vaild_and_vaild(String uName, String pWord)  {
	driver.findElement(By.id("loginUser_UserName")).sendKeys(uName);
	driver.findElement(By.id("loginUser_Password")).sendKeys(pWord);
	}

	@Then("^I click the login button$")
	public void i_click_the_login_button() {
		driver.findElement(By.id("loginUser_Login")).click();
	}


}
