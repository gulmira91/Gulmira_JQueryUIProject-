@Draggable
Feature: Draggable window
  Scenario:Enable draggable functionality
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Draggable under interactions section
    And moves the draggable object by clicking on it
    Then user is able to successfully move the object

  @Droppable
    Feature:Droppable window
      Scenario: Enable any DOM element to be droppable
        Given user navigates to "https:jqueryui.com"
        Then user clicks on Droppable under interactions section
        And user creates target for droppable elements
        Then user drops the element to the target
        Then user is able to successfully drop the element

  @Resizable
  Feature: Resizable
  Scenario: Change the size of the element using mouse
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Resizable under interactions section
    And user clicks the right or bottom border
    Then user is able to successfully drag to the desired size
   @Selectable
   Feature:Selectable
     Scenario: Enable to select elements
       Given user navigates to "https:jqueryui.com"
       Then user clicks on Selectable under interactions section
       And user use the mouse to select elements
       Then user is able to successfully select an item
  @Sortable
  Feature:Sortable
    Scenario: Enable to sort the given elements
      Given user navigates to "https:jqueryui.com"
      Then user clicks on Sortable under interactions section
      And user clicks on one item and drags it to a new spot
      Then other items will adjust to fit
      Then user is able to successfully reorder items in a list
      @Accordion
      Feature: Accordion
        Scenario:Enable to display collapsible content panel
         Given user navigates to "https:jqueryui.com"
          Then user clicks on Accordion under Widgets section
         Then user clicks on headers to expand the content
          And the content is broken into seperate sections
          Then the user is able to successfully display content panel
          @Autocomplete
          Feature: Autocomplete
            Scenario: Enable users to search listed value
              Given user navigates to "https:jqueryui.com"
              Then user clicks on Autocomplete under Widgets section
              And user types beginning letter of desired tags
              Then the program should be able to automatically fill the tag
              Then user is able to successfully search a desired value
  @Button
  Feature:Button
    Scenario: Enhances standard button elements
      Given user navigates to "https:jqueryui.com"
      Then user clicks on Button under Widgets section
      And user inputs submit buttons
      Then user is able to click on the submit buttons
@Checkboxradio
Feature:Checkboxradio
  Scenario: Enhances standard checkbox and radio
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Checkboxradio under Widgets section
    And user inputs checkbox elements with appropriate button
    Then user choose one of the option under checkbox
    Then user is able to click on the chosen option
  @Controlgroup
  Feature:Controlgroup
  Scenario: Featuring various form of controls
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Controlbox under Widgets section
    And user inputs options under one visual set
    Then user clicks on one of the control option
    Then control should be displayed
  @Datepicker
  Feature:Datepicker
  Scenario: Select data from a calendar
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Datepicker under Widgets section
    Then user choose date from the input field
    And user is able to successfully choose the date

  @Dialog
  Feature:Dialog
  Scenario: Open content in the viewport
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Dialog under Widgets section
    Then user clicks on page content
    And user is able to close the content area
  @Menu
  Feature:Menu
  Scenario: Open menu with default configurations
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Menu under Widgets section
    Then user clicks on listed option from the menu
    And user is able to display items from the chosen option

  @Progressbar
  Feature:Progressbar
  Scenario: Display status of process
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Progressbar under Widgets section
    Then user determines the progress bar
  @Selectmenu
  Feature:Selectmenu
  Scenario: Extends the functionality of HTML select
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Selectmenu under Widgets section
    Then user clicks on provided select elements
    And user click on one of the option
    Then the option should be able to display

  @Slider
  Feature:Slider
  Scenario: Drag a handle to select numeric value
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Slider under Widgets section
    Then user clicks on the single handle
    And user is able to move the handle using arrow keys
  @Spinner
  Feature:Spinner
  Scenario: Enhance text input for entering values
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Spinner under Widgets section
    Then user inputs value inside the select box
    And user chooses text that matches the value
    Then the desired value will be shown
  @Tabs
  Feature:Tabs
  Scenario: Able to swap between content
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Tabs under Widgets section
    Then user clicks on header associated with a panel
    And user views the content
    Then user is able to switch between the content
  @Tooltips
  Feature:Tooltips
  Scenario: Styling tooltips
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Tooltips under Widgets section
    Then user hovers to the element
    And title attribute is displayed in a little box
    Then user is able to form elements
    @Addclass
    Feature:Addclass
  Scenario: Add class to elements to animate style changes
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Addclass under Effects section
    Then user clicks on Run Effect
    And effect should display on the text
  @Easing
  Feature:Easing
  Scenario: Apply easing equation to an animation
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Easing under Effects section
    Then user clicks on a diagram
    And an easing action should appear
  @Effect
  Feature:Effect
  Scenario: Apply an animation effect to an element
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Effect under Effects section
    And user chooses an effect from the list
    Then user clicks on Run effect
    And selected animation effect should display
  @Hide
  Feature:Hide
  Scenario: Hide elements using custom effects
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Hide under Effects section
    And user chooses an effect from the list
    Then user clicks on Run effect
    And selected animation effect should hide the elements
  @RemoveClass
  Feature:RemoveClass
  Scenario: RemoveClass from elements while animating style changes
    Given user navigates to "https:jqueryui.com"
    Then user clicks on RemoveClass under Effects section
    Then user clicks on Run effect
    And selected animation effect should be removed
  @Show
  Feature:Show
  Scenario: Display elements using custom effects.
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Show under Effects section
    And user chooses an effect from the list
    Then user clicks on Run effect
    And elements should display with chosen effect
  @SwitchClass
  Feature:SwitchClass
  Scenario: Add or remove class to elements
    Given user navigates to "https:jqueryui.com"
    Then user clicks on SwitchClass under Effects section
    Then user clicks on Run effect
    And class should be removed from elements
  @Toggle
  Feature:Toggle
  Scenario: Either display or hide elements using effect
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Toggle under Effects section
    And user chooses an effect from the list
    Then user clicks on Run effect
    And elements should display with chosen effect
  @ToggleClass
  Feature:ToggleClass
  Scenario: Toggle class while animating all style changes
    Given user navigates to "https:jqueryui.com"
    Then user clicks on ToggleClass under Effects section
    Then user clicks on Run effect
    And elements should display with toggle class
  @Position
  Feature:Position
  Scenario: Position an element relative to another element
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Position under Utilities section
    Then user clicks on the parent element
    And user is able to successfully position the element to related element
  @WidgetFactory
  Feature:WidgetFactory
  Scenario: Create plugins using JQuery UI widgets
    Given user navigates to "https:jqueryui.com"
    Then user clicks on WidgetFactory under Utilities section
    Then user clicks on Go green
    And user is able to successfully change the background color
