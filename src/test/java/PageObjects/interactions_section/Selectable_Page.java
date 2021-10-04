package PageObjects.interactions_section;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

import java.util.List;

public class Selectable_Page {
    WebDriver driver;
    public Selectable_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    CommonLibrary library=new CommonLibrary();
    @FindBy(xpath = "//*[@id='selectable']/li[4]")
    WebElement itemFour;

    @FindBy(xpath = "//*[@id='selectable']/li")
    List<WebElement> selectItemsElements;
    public void selectTheItem(){
        itemFour.click();
    }
    public void verifyTheSelectItem(){
        for (WebElement selectItem : selectItemsElements){
            if (selectItem.getText().equalsIgnoreCase("item 4")){
                selectItem.click();
                System.out.println("Item is selected");
            }
        }
    }

}
