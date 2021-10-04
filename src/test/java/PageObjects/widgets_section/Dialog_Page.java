package PageObjects.widgets_section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

public class Dialog_Page {
    public Dialog_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    CommonLibrary library = new CommonLibrary();
    @FindBy(xpath = "//*[@title='Close']")
    WebElement closeButton;
    @FindBy(xpath = "//*[@title='PageContent']")
    WebElement PageContent;
    public void closeIcon(){
        closeButton.click();
    }
    public void clickPageContent() {
        PageContent.click();
    }
    public void checkDialogClosed(){
        closeButton.isEnabled();
    }


}
