package PageObjects.effects_section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

public class ColorAnimation_Page {
    public ColorAnimation_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    CommonLibrary library=new CommonLibrary();
    @FindBy(xpath = "//*[@id='button'")
    WebElement toggleEffectButton;
    @FindBy(xpath = "//*[@id='effect']")
     static WebElement effect;
    public String clickToggleEffect(){
        String animation=effect.getCssValue("background-color");
        System.out.println(animation);
        toggleEffectButton.click();
        String animationColor= Color.fromString(animation).asHex();
        System.out.println(animationColor);
        return animationColor;
    }
    public static String getEffectChanged(){
        String changeAnimation=effect.getCssValue("background-color");
        System.out.println(changeAnimation);
        String changeAnimationColor=Color.fromString(changeAnimation).asHex();
        System.out.println(changeAnimationColor);
        return changeAnimationColor;
    }
}
