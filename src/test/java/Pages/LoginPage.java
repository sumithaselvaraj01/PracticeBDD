package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
		// TODO Auto-generated method stub
public static void ClickLoginlink(WebDriver wd)
{
	WebElement test=wd.findElement(By.xpath("html/body/div[1]/header/span[1]/a"));
	test.click();
}
public static void EnterMobileNumber(WebDriver wd,String Mobilenumber)
{
	wd.findElement(By.xpath("html/body/div[2]/div[1]/form/input[2]")).sendKeys(Mobilenumber);
}
	public static void EnterPassword(WebDriver wd,String Password)
	{
		wd.findElement(By.xpath("html/body/div[2]/div[1]/form/input[3]")).sendKeys(Password);
	}
	public static void ClickLoginButton(WebDriver wd)
	{
		wd.findElement(By.xpath("html/body/div[2]/div[1]/form/input[4]")).click();
	}
	}
	


