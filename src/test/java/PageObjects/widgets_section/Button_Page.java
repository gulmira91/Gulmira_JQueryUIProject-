package PageObjects.widgets_section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

import java.security.PublicKey;

public class Button_Page {
    public Button_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    CommonLibrary library=new CommonLibrary();
    @FindBy(xpath = "(//button[text()='A button element'])[1]")
    WebElement buttonOne;
    public void clicksSubmitButtons()throws InterruptedException{
        if (buttonOne.getAttribute("value").equalsIgnoreCase("A button element")){
            Thread.sleep(3000);
            buttonOne.click();
            System.out.println(buttonOne.getAttribute("value"));
        }
    }
}
