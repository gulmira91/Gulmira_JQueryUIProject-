package PageObjects.widgets_section;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

public class Accordion_Page {
    public Accordion_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    CommonLibrary library=new CommonLibrary();
    @FindBy(xpath="//*[@id='accordion']/h3[3]")
    WebElement accordion;
    @FindBy(xpath="//*[@id='ui-id-6']/p")
    WebElement accordionDisplayedText;
    public void clicksHeaderSection(){
        accordion.click();
    }
    public void brokenIntoSeparateSections() {
        accordion.getText();
    }
    public void accordionDisplayContentPanel(){
        System.out.println(accordionDisplayedText.getText());
    }



}

