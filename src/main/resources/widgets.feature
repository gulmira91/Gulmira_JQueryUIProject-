Feature: Widgets
@Accordion
  Scenario:Enable to display collapsible content panel
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Accordion
    Then user clicks on headers to expand the content
    And the content is broken into seperate sections
    Then the user is able to successfully display content panel

  @Autocomplete
  Scenario: Enable users to search listed value
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Autocomplete
    And user types beginning letter of desired tags
    Then the program should be able to automatically fill the tag
    Then user is able to successfully search a desired value

  @Button
  Scenario: Enhances standard button elements
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Button
    And user inputs submit buttons
    Then user is able to click on the submit buttons

  @Checkboxradio
  Scenario: Enhances standard checkbox and radio
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Checkboxradio
    And user inputs checkbox elements with appropriate button
    Then user choose one of the option under checkbox
    Then user is able to click on the chosen option

  @Controlgroup
  Scenario: Featuring various form of controls
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Controlbox
    And user inputs options under one visual set
    Then user clicks on one of the control option
    Then control should be displayed

  @Datepicker
  Scenario: Select data from a calendar
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Datepicker
    Then user choose date from the input field
    And user is able to successfully choose the date

  @Dialog
  Scenario: Open content in the viewport
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Dialog
    Then user clicks on page content
    And user is able to close the content area

  @Menu
  Scenario: Open menu with default configurations
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Menu
    Then user clicks on listed option from the menu
    And user is able to display items from the chosen option

  @Progressbar
  Scenario: Display status of process
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Progressbar
    Then user determines the progress bar

  @Selectmenu
  Scenario: Extends the functionality of HTML select
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Selectmenu
    Then user clicks on provided select elements
    And user click on one of the option
    Then the option should be able to display

  @Slider
  Scenario: Drag a handle to select numeric value
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Slider
    Then user clicks on the single handle
    And user is able to move the handle using arrow keys

  @Spinner
  Scenario: Enhance text input for entering values
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Spinner
    Then user inputs value inside the select box
    And user chooses text that matches the value
    Then the desired value will be shown

  @Tabs
  Scenario: Able to swap between content
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Tabs
    Then user clicks on header associated with a panel
    And user views the content
    Then user is able to switch between the content

  @Tooltips
  Scenario: Styling tooltips
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Tooltips
    Then user hovers to the element
    And title attribute is displayed in a little box
    Then user is able to form elements