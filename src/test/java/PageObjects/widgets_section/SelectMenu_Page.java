package PageObjects.widgets_section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

public class SelectMenu_Page {
    public SelectMenu_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();
    @FindBy(linkText = "Medium")
    WebElement Medium;

    public void selectMedium() {
        Medium.click();
    }

    public void optionDisplayed() {
        System.out.println("Medium");
    }
}


