Feature: Widgets
#  Background: user navigates to "https:jqueryui.com"
@Accordion
  Scenario:Enable to display collapsible content panel
    Given user clicks on Accordion
    When user clicks on headers to expand the content
    Then the content is broken into separate sections
    And the user is able to successfully display content panel

  @Autocomplete
  Scenario: Enable users to search listed value
   Given user clicks on Autocomplete
    When user types beginning letter of desired tags
    Then the program should be able to automatically fill the tag field

  @Button
  Scenario: Enhances standard button elements
   Given user clicks on Button
   When user clicks submit buttons
    Then user is able to click on the submit buttons

  @Checkboxradio
  Scenario: Enhances standard checkbox and radio
    Given user clicks on Checkboxradio
    When user inputs checkbox elements with appropriate button
    Then user choose one of the option under checkbox
    And user is able to click on the chosen option

  @Controlgroup
  Scenario: Featuring various form of controls
    Given user clicks on ControlGroup button
    When user select an option from the group
    Then user books a car

  @Datepicker
  Scenario: Select data from a calendar
    Given user clicks on Datepicker
    When user choose date from the input field
   Then user is able to successfully choose the date

  @Dialog
  Scenario: Open content in the viewport
    Given user clicks on Dialog
    When user clicks on page content
    Then user is able to close the content area

  @Menu
  Scenario: Open menu with default configurations
   Given user clicks on Menu
    When user clicks on utilities from electronics
    Then user is able to display utilities from the electronics

  @Progressbar
  Scenario: Display status of process
    Given user clicks on Progressbar
    When user determines the Progressbar
    Then user display status Progressbar

  @Selectmenu
  Scenario: Extends the functionality of HTML select
   Given user clicks on Selectmenu Button
   When user clicks on medium from Select speed
    Then the option should be able to display

  @Slider
  Scenario: Drag a handle to select numeric value
    Given user clicks on SliderButton
    When user clicks on the single handle
    Then user is able to move the handle using arrow keys

  @Spinner
  Scenario: Enhance text input for entering values
   Given user clicks on SpinnerButton
    When user inputs value two inside the select box
    Then user chooses Get value
    And the desired value will be shown


  @Tooltips
  Scenario: Styling tooltips
    Given user clicks on TooltipsButton
   When user hovers to the element
   Then title attribute is displayed in a little box
