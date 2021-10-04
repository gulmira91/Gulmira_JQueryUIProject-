package PageObjects.widgets_section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

public class ProgressBar_Page {
    public ProgressBar_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();

    @FindBy(xpath = "//*[@id='progressbar']/div")
    WebElement progressBar;

    public void determinesProgressBar() {
        System.out.println(progressBar.getAttribute("style"));
    }

    public boolean displayStatusProgressBar() {
        String status = progressBar.getAttribute("style");
        String splitFront = status.split(":")[0];
        String splitBack = status.split(":")[1];
        System.out.println(splitFront);
        System.out.println(splitBack);
        String trim = splitBack.trim();
        if (trim.equalsIgnoreCase("40%")) {
            return true;
        }
        return false;
    }
}

