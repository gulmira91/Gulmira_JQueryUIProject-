package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/Features"},
        glue = {"stepdefinitions"},
        plugin = {"pretty","html:target/cucumber/report.html","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = ("@SmokeTest")
)


public class TestRunner extends AbstractTestNGCucumberTests {
}
