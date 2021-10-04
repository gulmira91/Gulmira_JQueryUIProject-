package PageObjects.interactions_section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

import java.util.List;

public class Sortable_Page {
    WebDriver driver;
    public Sortable_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    CommonLibrary library=new CommonLibrary();
    @FindBy(xpath = "//*[@id='sortable']/li[2]")
    WebElement sortableItemOne;
    @FindBy(xpath = "//*[@id='sortable']/li[6]")
    WebElement sortableItemFour;
    @FindBy(xpath = "//*[@id='sortable']/li")
    List<WebElement> sortableItemsList;
    public void dragItToNewSpot() {
        library.dragAndDrop(driver,sortableItemOne,sortableItemFour);
    }

    public void ItemsAdjustToFit() {
        String sortArray[]=new String[sortableItemsList.size()];
        for (int i=0;i<sortableItemsList.size();i++){
            sortArray[i]=sortableItemsList.get(i).getText();
            System.out.println(sortArray[i]);
        }
    }
}

