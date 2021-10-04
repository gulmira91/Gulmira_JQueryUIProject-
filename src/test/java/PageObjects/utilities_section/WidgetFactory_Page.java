package PageObjects.utilities_section;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

public class WidgetFactory_Page {
    public WidgetFactory_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();
    @FindBy(xpath = "//*[@id='green'")
    WebElement greenButton;
    @FindBy(xpath = "//*[@id='my-widget1']")
    WebElement firstColorMe;
    @FindBy(xpath = "//*[@id='my-widget1']/button")
    WebElement changeTheFirstColorMe;

    public String clickGreenButton() {
        greenButton.click();
        String firstColor = firstColorMe.getAttribute("style");
        return firstColor;
    }

    public String ChangeGreenColor() {
        changeTheFirstColorMe.click();
        String firstColorMeAttribute = firstColorMe.getAttribute("style");
        return firstColorMeAttribute;
    }
}
