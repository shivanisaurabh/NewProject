Feature: SauceDemo Login

  Scenario : Login with different types of users
    Given the user navigates to the login page
    When the user logs in with username "<userKey>" and valid password
    Then the user should see the home page