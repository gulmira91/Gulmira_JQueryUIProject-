package PageObjects.effects_section;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.plugin.dom.core.Node;
import sun.plugin.dom.html.HTMLInputElement;
import utility.CommonLibrary;

public class AddClass_Page {
    public AddClass_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();
    @FindBy(xpath = "//*[@id='effect']")
    WebElement effect;
    @FindBy(xpath = "//*[@id='button']")
    WebElement runEffectButton;

    public void clickRunEffectButton() throws InterruptedException {
        String animatingEffect = runEffectButton.getAttribute("style");
        System.out.println(animatingEffect);
        runEffectButton.click();
        Thread.sleep(2000);

    }



    public boolean getAnimationEffectRemoved() {
        System.out.println(getAnimationEffectRemoved());
        return true;
    }

    public boolean getAnimationEffect() {
        System.out.println(getAnimationEffect());
        return true;
    }
//
//
    public boolean clickEasingAction() {
        System.out.println(clickEasingAction());
        return false;
    }

   public boolean ShouldDisplayEffect() {
       System.out.println(ShouldDisplayEffect());
       return true;
    }

    public void getEffectChange() {
        String effectChanged = runEffectButton.getAttribute("style");
        System.out.println(effectChanged);
    }
}
