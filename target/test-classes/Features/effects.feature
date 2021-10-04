Feature:effects
#Background: user navigates to "https:jqueryui.com"
@Addclass
  Scenario: Add class to elements to animate style changes
    Given user clicks on AddClass button
    When user clicks on Run Effect
    Then effect should display on the text
  @Easing
  Scenario: Apply easing equation to an animation
    Given user clicks on Easing
    When user clicks on a diagram
    Then an easing action should appear
  @Effect
  Scenario: Apply an animation effect to an element
    Given user clicks EffectButton
    When selected animation effect should display
  @Hide
  Scenario: Hide elements using custom effects
    Given user clicks on HideButton
    When selected animation effect should be removed
  @Show
  Scenario: Display elements using custom effects.
    Given user clicks on Show
    When elements should display with chosen effect
  @SwitchClass
  Scenario: Add or remove class to elements
    Given user clicks on SwitchClass
    When class should be removed from elements

  @ToggleClass
  Scenario: Toggle class while animating all style changes
    Given user clicks on ToggleClass
    When elements should display with toggle class