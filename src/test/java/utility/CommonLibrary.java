package utility;

import io.cucumber.java.cy_gb.A;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import base.Hook;

public class CommonLibrary {
    WebDriver driver;
    Actions action;
    public void windowMaximize(){

        driver.manage().window().maximize();
    }
    public void getUrl(String url){
        driver.get(url);
    }
    public int[]getLocation(WebElement element){
        int x=element.getRect().getX();
        int y=element.getRect().getY();
        return new int[]{x,y};
    }
    public void switchFrame(WebElement element){
        driver.switchTo().frame(element);
    }
    public void dragAndDrop(WebDriver driver,WebElement source, int xoffset,int yoffset){
        Actions action=new Actions(driver);
        action.dragAndDropBy(source,xoffset,yoffset).perform();
    }
    public void dragAndDrop(WebDriver driver,WebElement source,WebElement target){
        Actions action=new Actions(driver);
        action.dragAndDrop(source,target).perform();
    }
    public void scrollThePageDown(WebDriver driver,CharSequence keys){
        Actions actions=new Actions(driver);
        actions.sendKeys(keys).build().perform();
    }
    public void fluentWait(WebDriver driver){
        FluentWait wait=new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(4));
        wait.pollingEvery(Duration.ofSeconds(3));
    }
    public WebElement moveToElement(WebElement target){
        Actions actions=new Actions(driver);
        actions.moveToElement(target).build().perform();
        return target;
    }

    //public void dragAndDrop(WebElement droppableElement) {
    //}

}
