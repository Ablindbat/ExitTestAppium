Feature: Graphics testing of api demo apk

  @graphics @smoke
  Scenario: Arcs text link test of Api demos apk
    Given I open api demo apk
    And I tap on graphics
    When I tap on arc
    Then open arc screen

  @Layer @smoke
  Scenario: layer text link test of graphics section in api demo apk
    Given I open api demo apk
    And I tap on graphics
    And I scroll until appear layer option
    When I tap on layer text link
    Then open layer screen
