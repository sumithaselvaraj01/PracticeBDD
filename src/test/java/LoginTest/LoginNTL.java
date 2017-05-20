package LoginTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.LoginPage;
import Util.ScreenshotGenerator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginNTL {
	
	WebDriver wd;
	@Given("^open browser as (.*)$")
	public void OpenBrowser(String browser){
		if(browser.equals("firefox"))
		{
			wd=new FirefoxDriver();
		}
		else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\Sumithra Seleniun Eclipse\\PracticeBDD\\Resource\\chromedriver.exe");
			wd=new ChromeDriver();
		}
	}
	@Then("^Enter URL as (.*)$")
	public void EnterURL(String URL){
		wd.get(URL);
	}
	@Then("^click Loginlink$")
	public void ClickLoginLink(){
		LoginPage.ClickLoginlink(wd);
	}
	@Then("^Enter Mobilenumber as (.*)$")
	public void EnterMobilenumber(String Mobilenumber)
	{
		LoginPage.EnterMobileNumber(wd, Mobilenumber);
	}
	@Then("^Enter Password as (.*)$")
	public void EnterPassword(String Password){
		LoginPage.EnterPassword(wd, Password);
	}
	@Then("^Click LoginButton$")
	public void ClickLoginButton()
	{
		int i=1/0;
		LoginPage.ClickLoginButton(wd);
		
	}


@After
public void TearDown(Scenario s) throws IOException
{
	if(s.isFailed())
	ScreenshotGenerator.generateScreenshot(wd, s);
	
}
}