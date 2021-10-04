package base;

import helper.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.CommonLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import base.Hook;
import static helper.WebDriverFactory.createWebDriver;

public class Hook {

        public static WebDriver driver;
        public WebDriverFactory webDriverFactory;
        CommonLibrary library = new CommonLibrary();
        @Before
        public void beforeEachScenario()throws IOException {
            driver = createWebDriver();
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("src/test/java/utility/global.properties");
            prop.load(fis);
            library.getUrl(prop.getProperty("url"));
           // library.chromedriver();

            String currentUrl = driver.getCurrentUrl();
            String expectedUrl = "https://jqueryui.com/";
            String title = driver.getTitle();
            System.out.println("title=" + title);
           Assert.assertEquals(currentUrl, expectedUrl);
        }
        @After
public void afterEachScenario()throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
        }
        //public static WebDriver getDriver(){
           // return driver;
        }

