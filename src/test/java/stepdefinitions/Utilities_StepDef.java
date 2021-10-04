package stepdefinitions;

import PageObjects.Home_Page;
import PageObjects.utilities_section.Position_Page;
import PageObjects.utilities_section.WidgetFactory_Page;
import base.Hook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Utilities_StepDef {

    Home_Page home_page=new Home_Page(Hook.driver);
    Position_Page position_page=new Position_Page(Hook.driver);
    WidgetFactory_Page widgetFactory_page=new WidgetFactory_Page(Hook.driver);

    @Given("user click Position Button")
    public void user_clicks_on_position() {
       home_page.clickPositionButton();
    }
    @When("user click Parent Element Button")
    public void user_click_parent_element_button() {
home_page.clickParentElementButton();
    }
    @Then("user is able to successfully position the element to related element")
    public void user_is_able_to_successfully_position_the_element_to_related_element() {
    position_page.getPositionLocation();
    }
    @Given("user click WidgetFactory Button")
    public void user_clicks_on_widget_factory() {
        home_page.clickWidgetFactoryButton();
    }
    @When("user click Green Button")
    public void user_clicks_on_go_green() {
        widgetFactory_page.clickGreenButton();
    }
    @Then("user is able to successfully change the background color")
    public void user_is_able_to_successfully_change_the_background_color() {
       int original=position_page.getPositionLocation();
       int adjusted=position_page.adjustPositionLocation();
        Assert.assertNotEquals(original,adjusted);
    }


}
