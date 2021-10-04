package PageObjects.widgets_section;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

public class Spinner_Page {
    public Spinner_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();
    @FindBy(xpath = "//*[@id='spinner']/span")
    WebElement spinner;
    @FindBy(xpath = "//*[@id='ui-id-5']")
    WebElement value2;

    @FindBy(xpath = "//*[@id='ui-id-6']")
    WebElement getValue;


    public void getData() throws InterruptedException {
       spinner.click();
       Thread.sleep(3000);
    }
    public void selectText() {
        value2.getAttribute("2");
    }

    public void valueDisplayed() {
        getValue.isDisplayed();
    }
}
