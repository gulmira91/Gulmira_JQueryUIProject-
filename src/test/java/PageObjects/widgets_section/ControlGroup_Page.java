package PageObjects.widgets_section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

public class ControlGroup_Page {
    public ControlGroup_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    CommonLibrary library = new CommonLibrary();

    @FindBy(xpath = "//*[@id='car-type-button']/span[1]")
    WebElement carTypeButton;
    @FindBy(xpath = "/html/body/div[1]/fieldset[1]/div/label[2]/span[1]")
    WebElement automaticButton;
    @FindBy(xpath = "/html/body/div[1]/fieldset[1]/div/label[3]")
    WebElement insuranceButton;
    @FindBy(xpath = "/html/body/div[1]/fieldset[1]/div/button")
    WebElement bookNowButton;
    public void rentalCarSelect(){
        carTypeButton.click();
        automaticButton.click();
        insuranceButton.click();
    }
    public void bookNow(){
        bookNowButton.click();
    }


}
