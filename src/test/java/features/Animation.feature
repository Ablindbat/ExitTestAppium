Feature: Animation testing of Api Demo apk

  @smoke @reverse
  Scenario: Reverse testing of animation screen
    Given I open the app
    And Tap on animation
    And Tap on Reversing
    When Tap on play button
    And Tap on reverse button
    Then Ball return same place

  @loading @smoke
  Scenario: Loading testing of Animation screen
    Given I open the app
    And Tap on animation
    And Tap on loading
    When Tap on run button
    Then Loading the screen

  @cloning @smoke
  Scenario: Cloning testing of Animation screen
    Given I open the app
    And Tap on animation
    And Tap on cloning text link
    When Tap on clonig run button
    Then Cloning the screen

  @custom @smoke
  Scenario: Custom evaluator testing of animation screen
    Given I open the app
    And Tap on animation
    And Tap on custom evaluation text link
    When Tap on play button
    Then custom evaluator work
