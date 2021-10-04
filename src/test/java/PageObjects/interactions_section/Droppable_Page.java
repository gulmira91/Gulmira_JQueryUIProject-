package PageObjects.interactions_section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

public class Droppable_Page {
    WebDriver driver;
    public Droppable_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    CommonLibrary library = new CommonLibrary();
    @FindBy(id = "draggable")
    WebElement draggableElement;

    @FindBy(id = "droppable")
    WebElement droppableElement;

    public void setTargetForTheDroppableElements() {
        library.dragAndDrop(driver,draggableElement,droppableElement);
        library.fluentWait(driver);
    }


    public void successfullyDropTheElement() {
        String dropText=droppableElement.getText();
        if (dropText.equals("Dropped!")){
            System.out.println("PASS: File successfully drop to the targer");
        }else{
            System.out.println("FAIL:File failed to drop to target");
        }
    }
}
