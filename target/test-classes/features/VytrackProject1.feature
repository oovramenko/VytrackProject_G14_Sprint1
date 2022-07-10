Feature: Clicking Export Grid dropdown

  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons

  Background:
    Given user is on the log in page
    When user log in with valid user name and password
    And user is on the home page
    When user clicks on the Fleet tap
    And user selects Vehicle dropdown button
    And user is on the Car Homepage

  Scenario: click Export Grid dropdown
    Then user clicks Export Grid dropdown

  Scenario: Export Grid dropdown is on the left of the page
    Then user should see Export Grid dropdown is on the left of the page

  Scenario:click refresh button
    Then User should be able to click refresh button

  Scenario:click reset button
    Then User should be able click reset button

  Scenario:click Grid Settings button
      Then User should be able to click Grid Settings button
  @wip
  Scenario: Refresh button should be on the left side of Reset button
    Then user should see Refresh button on the left side of Reset button



