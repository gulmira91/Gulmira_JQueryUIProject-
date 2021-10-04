package PageObjects;

import com.sun.scenario.effect.Effect;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.CommonLibrary;

public class Home_Page {
    public Home_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CommonLibrary library = new CommonLibrary();
    public int xOriginalLocation;
    @FindBy(linkText = "Droppable")
    WebElement droppableButton;
    @FindBy(css = "iframe.demo-frame")
    WebElement iframe;
    @FindBy(id = "droppable")
    WebElement dropElement;
    @FindBy(linkText = "Resizeable")
    WebElement resizableButton;
    @FindBy(xpath = "//*[@id='resizable']/div[3]")
    WebElement resizeElement;
    @FindBy(linkText = "Draggable")
    WebElement draggableButton;
    @FindBy(xpath = "//*[@id='draggable']/div[3]")
    WebElement draggableElement;
    @FindBy(linkText = "Selectable")
    WebElement selectableButton;
    @FindBy(linkText = "Accordion")
    WebElement accordionButton;
    @FindBy(linkText = "Sortable")
    WebElement sortableButton;
    @FindBy(linkText = "Autocomplete")
    WebElement autoCompleteButton;
    @FindBy(linkText = "Button")
    WebElement buttonButton;
    @FindBy(linkText = "Checkboxradio")
    WebElement checkboxradioButton;
    @FindBy(linkText = "ControlGroup")
    WebElement controlGroupButton;
    @FindBy(linkText = "DatePicker")
    WebElement datePickerButton;
    @FindBy(linkText = "Dialog")
    WebElement dialogButton;
    @FindBy(linkText = "Diagram")
    WebElement diagramButton;
    @FindBy(linkText = "Menu")
    WebElement menuButton;
    @FindBy(linkText = "Progressbar")
    WebElement progressBarButton;
    @FindBy(linkText = "Slider")
    WebElement sliderButton;
    @FindBy(linkText = "Tooltip")
    WebElement toolTipButton;
    @FindBy(linkText = "Position")
    WebElement positionButton;
    @FindBy(linkText = "Widget Factory")
    WebElement widgetFactoryButton;
    @FindBy(linkText = "AddClass")
    WebElement addClassButton;
    @FindBy(linkText = "ColorAnimation")
    WebElement colorAnimationButton;
    @FindBy(linkText = "ParentElement")
    WebElement parentElementButton;
    @FindBy(linkText = "Effect")
    WebElement effectButton;
    @FindBy(linkText = "ToggleClass")
    WebElement toggleClassButton;
    @FindBy(linkText = "ClassRemoved")
    WebElement classRemovedButton;
    @FindBy(linkText = "SwitchClass")
    WebElement switchClassButton;
    @FindBy(linkText = "Show")
    WebElement showButton;
    @FindBy(linkText = "RemoveClass")
    WebElement removeClassButton;
    @FindBy(linkText = "Hide")
    WebElement hideButton;
    @FindBy(linkText = "Easing")
    WebElement easingButton;
    @FindBy(linkText = "Spinner")
    WebElement spinnerButton;
    @FindBy(linkText = "Tabs")
    WebElement tabsButton;


    public  int clickDroppableButton() {
        clickDroppableButton();
        library.switchFrame(iframe);
        int[] x_y_location = library.getLocation(dropElement);
        xOriginalLocation = x_y_location[0];
        return xOriginalLocation;
    }

    public void clickDraggableButton() {
        draggableButton.click();
        library.switchFrame(iframe);

    }

    public int clickResizableButton() {
        resizableButton.click();
        library.switchFrame(iframe);
        int[] x_y_location = library.getLocation(resizeElement);
        xOriginalLocation = x_y_location[0];
        return xOriginalLocation;
    }

    public void clickSelectableButton() {
        selectableButton.click();
        library.switchFrame(iframe);
    }

    public void clickSortableButton() {
        sortableButton.click();
        library.switchFrame(iframe);

    }

    public void clickAccordionButton() {
        accordionButton.click();
        library.switchFrame(iframe);
    }

    public void clickAutoCompleteButton() {
        autoCompleteButton.click();
        library.switchFrame(iframe);
    }

    public void clickButtonButton() {
        buttonButton.click();
        library.switchFrame(iframe);
    }

    public void clickCheckBoxRadioButton() {
        checkboxradioButton.click();
        library.switchFrame(iframe);
    }

    public void clickControlGroupButton() {
        controlGroupButton.click();
        library.switchFrame(iframe);
    }

    public void clickDatePicker() {
        datePickerButton.click();
        library.switchFrame(iframe);
    }

    public void clickDialogButton() {
        dialogButton.click();
        library.switchFrame(iframe);
    }

    public void clicksOnDiagramButton() {
        diagramButton.click();
        library.switchFrame(iframe);
    }
    public void clickMenuButton() {
       menuButton.click();
       library.switchFrame(iframe);
    }
   public void clickProgressBar () {
       progressBarButton.click();
       library.switchFrame(iframe);
    }
   public void clickSliderButton () {
       sliderButton.click();
       library.switchFrame(iframe);
    }
    public void clickToolTipButton () {
        toolTipButton.click();
        library.switchFrame(iframe);
    }
    public void clickPositionButton () {
        positionButton.click();
        library.switchFrame(iframe);
    }
    public void clickWidgetFactoryButton () {
        widgetFactoryButton.click();
        library.switchFrame(iframe);
    }
    public void clickAddClassButton () {
        addClassButton.click();
        library.switchFrame(iframe);
    }
    public void clickColorAnimationButton () {
        colorAnimationButton.click();
        library.switchFrame(iframe);
    }
    public void clickParentElementButton () {
        parentElementButton.click();
        library.switchFrame(iframe);
    }
    public void clickEffectButton () {
        effectButton.click();
        library.switchFrame(iframe);
    }
    public void clicksOnToggleClassButton () {
        toggleClassButton.click();
        library.switchFrame(iframe);
    }
    public void ClassRemovedButton () {
        classRemovedButton.click();
        library.switchFrame(iframe);
    }
    public void clicksOnSwitchClassButton () {
        switchClassButton.click();
        library.switchFrame(iframe);
    }
    public void clicksOnShowButton () {
        showButton.click();
        library.switchFrame(iframe);
    }
    public void clicksOnRemoveClassButton () {
        removeClassButton.click();
        library.switchFrame(iframe);
    }
    public void clicksOnHideButton () {
        hideButton.click();
        library.switchFrame(iframe);
    }
    public void clicksOnEasingButton () {
        easingButton.click();
        library.switchFrame(iframe);
    }
    public void clicksOnSliderButton () {
        sliderButton.click();
        library.switchFrame(iframe);
    }
    public void clicksOnSpinnerButton () {
        spinnerButton.click();
        library.switchFrame(iframe);
    }
    public void clicksTabsButton () {
        tabsButton.click();
        library.switchFrame(iframe);
    }
    public void clicksToolTipsButton () {
        toolTipButton.click();
        library.switchFrame(iframe);
        }

    public void clickSelectMenuButton() {
        clickSelectMenuButton();
        library.switchFrame(iframe);
    }
}




