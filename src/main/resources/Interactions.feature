Feature: Interactions
  Background: user navigates to "https:jqueryui.com"
@Draggable
Scenario:Enable draggable functionality
Then user clicks on Draggable
And moves the draggable object by clicking on it
Then user is able to successfully move the object

@Droppable
Scenario: Enable any DOM element to be droppable
Then user clicks on Droppable
And user creates target for droppable elements
Then user drops the element to the target
Then user is able to successfully drop the element

@Resizable
Scenario: Change the size of the element using mouse
Then user clicks on Resizable
And user clicks the right or bottom border
Then user is able to successfully drag to the desired size

@Selectable
Scenario: Enable to select elements
Then user clicks on Selectable
And user use the mouse to select elements
Then user is able to successfully select an item

@Sortable
Scenario: Enable to sort the given elements
Then user clicks on Sortable
And user clicks on one item and drags it to a new spot
Then other items will adjust to fit
Then user is able to successfully reorder items in a list