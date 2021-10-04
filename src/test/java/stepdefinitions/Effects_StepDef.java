package stepdefinitions;

import PageObjects.Home_Page;
import PageObjects.effects_section.AddClass_Page;
import PageObjects.effects_section.ColorAnimation_Page;
import base.Hook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Effects_StepDef {
        Home_Page home_page = new Home_Page(Hook.driver);
        AddClass_Page addClass_page = new AddClass_Page(Hook.driver);
        ColorAnimation_Page colorAnimation_page = new ColorAnimation_Page(Hook.driver);
        @Given("user clicks on AddClass button")
        public void userClicksOnAddClass() {
                home_page.clickAddClassButton();
        }
        @When("user clicks on Run Effect")
        public void userClicksOnRunEffect() throws InterruptedException {
                addClass_page.clickRunEffectButton();
        }
        @Then("effect should display on the text")
        public void effectShouldDisplayOnTheText() throws InterruptedException {
                addClass_page.ShouldDisplayEffect();
        }
        @Given("user clicks on Easing")
        public void userClicksOnEasing() {
                home_page.clicksOnEasingButton();
        }
        @When("user clicks on a diagram")
        public void userClicksOnADiagram() {
                home_page.clicksOnDiagramButton();
        }
        @Then("an easing action should appear")
        public void anEasingActionShouldAppear() {
            addClass_page.clickEasingAction();
        }
        @Given("user clicks EffectButton")
        public void userClicksOnEffectButton() {
                 home_page.clickEffectButton();
        }
        @When("selected animation effect should display")
        public void selectedAnimationEffectShouldDisplay () {
                 addClass_page.getAnimationEffect();
        }
        @Given("user clicks on HideButton")
        public void userClicksOnHideButton(){
                home_page.clicksOnHideButton();
        }
        @When("selected animation effect should be removed")
        public void selectedAnimationEffectShouldBeRemoved () {
                addClass_page.getAnimationEffectRemoved();
        }
        @Given("user clicks on Show")
        public void userClicksOnShow () {
               home_page.clicksOnShowButton();
        }
        @When("elements should display with chosen effect")
        public void elementsShouldDisplayWithChosenEffect () {
                ColorAnimation_Page.getEffectChanged();
        }
        @Given("user clicks on SwitchClass")
        public void userClicksOnSwitchClass () {
                home_page.clicksOnSwitchClassButton();
        }
        @When("class should be removed from elements")
        public void classShouldBeRemovedFromElements () {
               home_page.clicksOnRemoveClassButton();
        }

        @Given("user clicks on ToggleClass")
        public void userClicksOnToggleClass() {
                home_page.clicksOnToggleClassButton();
        }
        @When("elements should display with toggle class")
        public void elementsShouldDisplayWithToggleClass () {
                 String beforeEffect = colorAnimation_page.clickToggleEffect();
                 String afterEffect = colorAnimation_page.getEffectChanged();
                 Assert.assertNotEquals(beforeEffect, afterEffect);
        }
        }



