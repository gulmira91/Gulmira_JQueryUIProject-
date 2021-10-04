package stepdefinitions;

import PageObjects.Home_Page;
import PageObjects.widgets_section.*;
import base.Hook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

import java.net.ServerSocket;

public class Widgets_StepDef {
    Home_Page home_page = new Home_Page(Hook.driver);
    Accordion_Page accordion_page = new Accordion_Page(Hook.driver);
    AutoComplete_Page autoComplete_page = new AutoComplete_Page(Hook.driver);
    Button_Page button_page = new Button_Page(Hook.driver);
    CheckBoxRadio_Page checkBoxRadio_page = new CheckBoxRadio_Page(Hook.driver);
    ControlGroup_Page controlGroup_page = new ControlGroup_Page(Hook.driver);
    DatePicker_Page datePicker_page = new DatePicker_Page(Hook.driver);
    Dialog_Page dialog_page = new Dialog_Page(Hook.driver);
    Menu_Page menu_page = new Menu_Page(Hook.driver);
    ProgressBar_Page progressBar_page = new ProgressBar_Page(Hook.driver);
    SelectMenu_Page selectMenu_page = new SelectMenu_Page(Hook.driver);
    Slider_Page slider_page = new Slider_Page(Hook.driver);
    Spinner_Page spinner_page = new Spinner_Page(Hook.driver);
    //Tabs_Page tabs_page = new Tabs_Page(Hook.driver);
    ToolTip_Page toolTip_page = new ToolTip_Page(Hook.driver);

    @Given("user clicks on Accordion")
    public void userClicksOnAccordionButton() {
        home_page.clickAccordionButton();
    }

    @When("user clicks on headers to expand the content")
    public void userClicksOnHeadersToExpandTheContent() {
        accordion_page.clicksHeaderSection();
    }

    @Then("the content is broken into separate sections")
    public void theContentIsBrokenIntoSeparateSections() {
        accordion_page.brokenIntoSeparateSections();
    }

    @And("the user is able to successfully display content panel")
    public void theUserIsAbleToSuccessfullyDisplayContentPanel() {
        accordion_page.accordionDisplayContentPanel();
    }

    @Given("user clicks on Autocomplete")
    public void userClicksOnAutocomplete() {
        home_page.clickAutoCompleteButton();
    }

    @When("user types beginning letter of desired tags")
    public void userTypesBeginningLetterOfDesiredTags() throws InterruptedException {
        autoComplete_page.autoComplete();
    }

    @Then("the program should be able to automatically fill the tag field")
    public void theProgramShouldBeAbleToAutomaticallyFillTheTag()throws InterruptedException  {
        String originalValue =autoComplete_page.autoComplete();
        String afterFieldValue = autoComplete_page.autoField();
        Assert.assertNotEquals(originalValue, afterFieldValue);
    }

    @Given("user clicks on Button")
    public void userClicksOnButton(){
        home_page.clickButtonButton();
    }

    @When("user clicks submit buttons")
    public void userclicksSubmitButtons() throws InterruptedException  {
        button_page.clicksSubmitButtons();
    }

    @Then("user is able to click on the submit buttons")
    public void userIsAbleToClickOnTheSubmitButtons() {
        System.out.println("submit button is clicked");
    }

    @Given("user clicks on Checkboxradio")
    public void userClicksOnCheckboxradio() {
        home_page.clickCheckBoxRadioButton();
    }

    @When("user inputs checkbox elements with appropriate button")
    public void userInputsCheckboxElementsWithAppropriateButton() {
        checkBoxRadio_page.clickAppropriateButton();
    }

    @Then("user choose one of the option under checkbox")
    public void userChooseOneOfTheOptionUnderCheckbox() {
        checkBoxRadio_page.radioTypeIsSelected();
    }

    @And("user is able to click on the chosen option")
    public void userIsAbleToClickOnTheChosenOption() {
        checkBoxRadio_page.clickOnTheChosenOption();
    }

    @Given("user clicks on ControlGroup button")
    public void userClicksOnControlGroupButton() {
        home_page.clickControlGroupButton();
    }

    @When("user select an option from the group")
    public void userSelectAnOptionFromTheGroup() {
        controlGroup_page.rentalCarSelect();
    }

    @Then("user books a car")
    public void userBooksACar() {
        controlGroup_page.bookNow();
    }

    @Given("user clicks on Datepicker")
    public void userClicksOnDatepicker() {
        home_page.clickDatePicker();
    }

    @When("user choose date from the input field")
    public void userChooseDateFromTheInputField() {
        datePicker_page.chooseDate();
    }

    @Then("user is able to successfully choose the date")
    public void userIsAbleToSuccessfullyChooseTheDate() {
        String original = datePicker_page.verifyDates();
        String givenDateAndMonth = "03/09/2022";
        Assert.assertNotEquals(original, givenDateAndMonth);
    }

    @Given("user clicks on Dialog")
    public void userClicksOnDialog() {
        home_page.clickDialogButton();
    }

    @When("user clicks on page content")
    public void userClicksOnPageContent() {
        dialog_page.clickPageContent();
    }

    @Then("user is able to close the content area")
    public void userIsAbleToCloseTheContentArea() {
        dialog_page.checkDialogClosed();
    }

    @Given("user clicks on Menu")
    public void userClicksOnMenu() {
        home_page.clickMenuButton();
    }

    @When("user clicks on utilities from electronics")
    public void userClicksOnListedOptionFromTheMenu() throws InterruptedException {
        menu_page.selectUtilitiesFromElectronics();

    }

    @Then("user is able to display utilities from the electronics")
    public void userIsAbleToDisplayUtilitiesFromTheElectronics() {
        menu_page.getSelectedOption();

    }

    @Given("user clicks on Progressbar")
    public void userClicksOnProgressbar() {
        home_page.clickProgressBar();
    }

    @When("user determines the Progressbar")
    public void userDeterminesTheProgressBar() {
        progressBar_page.determinesProgressBar();
    }
    @Then("user display status Progressbar")
    public void userDisplayStatusProgressBar() {
        progressBar_page.displayStatusProgressBar();
    }

    @Given("user clicks on Selectmenu Button")
    public void userClicksOnSelectmenuButton() {
        home_page.clickSelectMenuButton();
    }

    @When("user clicks on medium from Select speed")
    public void userClicksOnMediumFromSelectSpeed() {
        selectMenu_page.selectMedium();
    }

    @Then("the option should be able to display")
    public void theOptionShouldBeAbleToDisplay() {
        selectMenu_page.optionDisplayed();
    }

    @Given("user clicks on SliderButton")
    public void userClicksOnSliderButton() {
        home_page.clicksOnSliderButton();
    }

    @When("user clicks on the single handle")
    public void userClicksOnTheSingleHandle() {
        slider_page.clicksSingleHandle();
    }

    @Then("user is able to move the handle using arrow keys")
    public void userIsAbleToMoveTheHandleUsingArrowKeys() {
        slider_page.moveArrowKeys();
    }

    @Given("user clicks on SpinnerButton")
    public void userClicksOnSpinnerButton() {
        home_page.clicksOnSpinnerButton();
    }

    @When("user inputs value two inside the select box")
    public void userInputstwoInsideTheSelectBox() throws InterruptedException {
        spinner_page.getData();
    }

    @Then("user chooses Get value")
    public void userChoosesGetValue() {
        spinner_page.selectText();
    }

    @And("the desired value will be shown")
    public void theDesiredValueWillBeShown() {
        spinner_page.valueDisplayed();
    }


    @Given("user clicks on TooltipsButton")
    public void userClicksOnTooltipsButton() {
        home_page.clicksToolTipsButton();
    }

    @When("user hovers to the element")
    public void userHoversToTheElement() throws InterruptedException {
        toolTip_page.setToolTipHover();
    }

    @Then("title attribute is displayed in a little box")
    public void titleAttributeIsDisplayedInALittleBox() {
        toolTip_page.displayHover();
    }
}


