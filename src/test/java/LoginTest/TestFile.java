package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFile {

	public static void main(String[] args) {
		
		
		WebDriver wd=new FirefoxDriver();
		wd.get("https://mvnrepository.com/artifact/com.aventstack/extentreports/3.0.5");
	}
}
