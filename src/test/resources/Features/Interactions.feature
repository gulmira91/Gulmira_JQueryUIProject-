Feature: Interactions
#  Background: user navigates to "https:jqueryui.com"
@SmokeTest
  @Draggable
Scenario:Enable draggable functionality
Given user clicks on Draggable
When moves the draggable object to AandBLocation
Then user is able to successfully move it to AandBLocation
@SmokeTest
@Droppable
Scenario: Enable any DOM element to be droppable
Given user clicks on Droppable Button
When user creates target for droppable elements
Then user is able to successfully drop the element

@Resizable
Scenario: Change the size of the element using mouse
Given user clicks on Resizable
When user clicks the bottom border
Then user is able to successfully drag to the desired size

@Selectable
Scenario: Enable to select elements
Given user clicks on Selectable Button
When user use the mouse to select elements
Then user is able to successfully select an item

@Sortable
Scenario: Enable to sort the given elements
Given user clicks on Sortable Button
When user clicks on one item and drags it to a new spot
Then other items will adjust to fit
