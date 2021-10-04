package PageObjects.widgets_section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

import javax.security.auth.login.CredentialException;

public class Slider_Page {
    WebDriver driver;
    public Slider_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();
    @FindBy(xpath = "//*[@id='slider']/span")
    WebElement slider;
    public void clicksSingleHandle(){
        slider.click();
        library.dragAndDrop(driver,slider,200,1);
        System.out.println(slider.getAttribute("style"));
    }
    public boolean moveArrowKeys(){
        if (slider.getAttribute("style").equalsIgnoreCase("left:30%")){
            return true;
        }
        return false;
    }
}
