package stepdefinitions;

import PageObjects.Home_Page;
import PageObjects.interactions_section.*;
import base.Hook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Interaction_StepDef {
    Home_Page home_page=new Home_Page(Hook.driver);
    Draggable_Page draggable_page=new Draggable_Page(Hook.driver);
    Droppable_Page droppable_page=new Droppable_Page(Hook.driver);
    Resizeable_Page resizeable_page=new Resizeable_Page(Hook.driver);
    Selectable_Page selectable_page=new Selectable_Page(Hook.driver);
    Sortable_Page sortable_page=new Sortable_Page(Hook.driver);

    @Given("user clicks on Draggable")
    public void userClickDraggableButton() {
        home_page.clickDraggableButton();
    }

    @When("moves the draggable object to AandBLocation")
    public void movesTheDraggableObjecttoAandBLocation() {
        draggable_page.dragItToAandBLocation();
    }

    @Then("user is able to successfully move it to AandBLocation")
    public void userIsAbleToSuccessfullyMoveitToAandBLocation() {
        int afterA=draggable_page.getAfterDraggableLocation();
        int  beforeA=home_page.xOriginalLocation;
        Assert.assertNotEquals(beforeA,afterA);

    }

    @Given("user clicks on Droppable Button")
    public void userClicksOnDroppableButton() {
        home_page.clickDroppableButton();
    }

    @When("user creates target for droppable elements")
    public void userCreatesTargetForDroppableElements() {
        droppable_page.setTargetForTheDroppableElements();
    }

    @Then("user is able to successfully drop the element")
    public void userIsAbleToSuccessfullyDropTheElement() {
        droppable_page.successfullyDropTheElement();
    }

    @Given("user clicks on Resizable")
    public void userClicksOnResizable() {
        home_page.clickResizableButton();
    }

    @When("user clicks the bottom border")
    public void userClickstheBottomBorder() {
        resizeable_page.clickstheButtomBorder();
    }

    @Then("user is able to successfully drag to the desired size")
    public void userIsAbleToSuccessfullyDragToTheDesiredSize() {
        int AfterX=resizeable_page.reSizeTheElement();
        int BeforeX=home_page.xOriginalLocation;
        Assert.assertNotEquals(BeforeX,AfterX);
    }

    @Given("user clicks on Selectable Button")
    public void userClicksOnSelectableButton() {
        home_page.clickSelectableButton();
    }

    @When("user use the mouse to select elements")
    public void userUseTheMouseToSelectElements() {
        selectable_page.selectTheItem();
    }

    @Then("user is able to successfully select an item")
    public void userIsAbleToSuccessfullySelectAnItem() {
        selectable_page.verifyTheSelectItem();
    }

    @Given("user clicks on Sortable Button")
    public void userClicksOnSortableButton() {
        home_page.clickSortableButton();
    }

    @When("user clicks on one item and drags it to a new spot")
    public void userClicksOnOneItemAndDragsItToANewSpot() {
       sortable_page.dragItToNewSpot();
    }

    @Then("other items will adjust to fit")
    public void otherItemsWillAdjustToFit() {
        sortable_page.ItemsAdjustToFit();
    }

    }

