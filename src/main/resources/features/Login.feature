Feature: Home Page Test
  Scenario: User valid login into web HRM
    Given  User open browser and url
    When User enter valid username
    And User Enter Valid password
    And User click button login
    Then User go to page Dashboard

  Scenario: User invalid login into web HRM
    When  click button logout
    And User enter invalid username
    And User Enter invalid password
    And User click button login
    Then Invalid credential

  Scenario: User Null Password login into web HRM
    When invalid credential
    And User enter valid usernamereq
    And User Enter null password
    And User click button login
    Then Required


