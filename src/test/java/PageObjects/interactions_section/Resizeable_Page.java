package PageObjects.interactions_section;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

public class Resizeable_Page {
    WebDriver driver;
    public Resizeable_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    CommonLibrary library=new CommonLibrary();
    int X=200;
    int Y=10;
    @FindBy(xpath="//*[id='resizable']/div[3]")
    WebElement resizeElement;
    public void clickstheButtomBorder() {
    }
    public int reSizeTheElement(){
        library.dragAndDrop(driver,resizeElement,X,Y);
        int xLocation=resizeElement.getRect().getX();
        return xLocation;
    }
}
