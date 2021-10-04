package PageObjects.interactions_section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

import java.security.PublicKey;

public class Draggable_Page {
    WebDriver driver;
    public Draggable_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    CommonLibrary library=new CommonLibrary();
    int A=200;
    int B=10;
    @FindBy(id="draggable")
    WebElement dragElement;
    public void dragItToAandBLocation(){
        library.dragAndDrop(driver,dragElement,A,B);
    }
    public int getAfterDraggableLocation(){
        int xLocation=dragElement.getRect().getX();
        return xLocation;
    }

}
