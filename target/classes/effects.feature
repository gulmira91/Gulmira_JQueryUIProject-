Feature:effects
@Addclass
  Scenario: Add class to elements to animate style changes
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Addclass
    Then user clicks on Run Effect
    And effect should display on the text
  @Easing
  Scenario: Apply easing equation to an animation
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Easing
    Then user clicks on a diagram
    And an easing action should appear
  @Effect
  Scenario: Apply an animation effect to an element
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Effect
    And user chooses an effect from the list
    Then user clicks on Run effect
    And selected animation effect should display
  @Hide
  Scenario: Hide elements using custom effects
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Hide
    And user chooses an effect from the list
    Then user clicks on Run effect
    And selected animation effect should hide the elements
  @RemoveClass
  Scenario: RemoveClass from elements while animating style changes
    Given user navigates to "https:jqueryui.com"
    Then user clicks on RemoveClass
    Then user clicks on Run effect
    And selected animation effect should be removed
  @Show
  Scenario: Display elements using custom effects.
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Show
    And user chooses an effect from the list
    Then user clicks on Run effect
    And elements should display with chosen effect
  @SwitchClass
  Scenario: Add or remove class to elements
    Given user navigates to "https:jqueryui.com"
    Then user clicks on SwitchClass
    Then user clicks on Run effect
    And class should be removed from elements
  @Toggle
  Scenario: Either display or hide elements using effect
    Given user navigates to "https:jqueryui.com"
    Then user clicks on Toggle
    And user chooses an effect from the list
    Then user clicks on Run effect
    And elements should display with chosen effect
  @ToggleClass
  Scenario: Toggle class while animating all style changes
    Given user navigates to "https:jqueryui.com"
    Then user clicks on ToggleClass
    Then user clicks on Run effect
    And elements should display with toggle class