
Feature:utilities
#  Background: user navigates to "https:jqueryui.com"
@Position
  Scenario: Position an element relative to another element
    Given user click Position Button
    When user click Parent Element Button
    Then user is able to successfully position the element to related element

  @WidgetFactory
  Scenario: Create plugins using JQuery UI widgets
    Given user click WidgetFactory Button
    When user click Green Button
    Then user is able to successfully change the background color
