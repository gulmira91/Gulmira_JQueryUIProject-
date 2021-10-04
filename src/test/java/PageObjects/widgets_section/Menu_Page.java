package PageObjects.widgets_section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

public class Menu_Page {
    public Menu_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    CommonLibrary library = new CommonLibrary();
    @FindBy(xpath = "//*[@id='ui-i-id-9']")
    WebElement electronicElement;
    @FindBy(xpath = "//*[@id='ui-id-10']")
    WebElement utilities;
    @FindBy(xpath = "//*[@id='ui-id-11']")
    WebElement gas;
    public void selectUtilitiesFromElectronics()throws InterruptedException{
        electronicElement.click();
        Thread.sleep(2000);
        library.moveToElement(utilities);
        Thread.sleep(3000);
        library.moveToElement(gas);
    }
    public void getSelectedOption(){
        System.out.println("utilities");
    }
}
