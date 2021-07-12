Feature:utilities
  Background: user navigates to "https:jqueryui.com"
@Position
  Scenario: Position an element relative to another element
    When user clicks on Position
    Then user clicks on the parent element
    And user is able to successfully position the element to related element

  @WidgetFactory
  Scenario: Create plugins using JQuery UI widgets
    Then user clicks on WidgetFactory
    Then user clicks on Go green
    And user is able to successfully change the background color
