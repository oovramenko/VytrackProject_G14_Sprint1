Feature: Clicking Export Grid dropdown

  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons

  Scenario: User should be able to click Export Grid dropdown

    Given user is on the log in page
    When user log in with valid user name and password
    And user is on the home page
    When user clicks on the Fleet tap
    And user selects Vehicle dropdown button
    And user is on the Car Homepage
    And user clicks Export Grid dropdown
    And user should see Export Grid dropdown is on the left of the page
    And User should be able to click refresh button
    Then User should be able click reset button

