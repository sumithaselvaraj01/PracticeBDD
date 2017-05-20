package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(tags = "@LoginNTL", format = { "pretty",
		"html:reports" }, features = "D:\\Sumithra Seleniun Eclipse\\PracticeBDD\\src\\test\\java\\Feature", glue = "LoginTest",
				 plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" })
public class Runner {
	@AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}


