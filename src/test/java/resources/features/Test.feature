Feature: Sample Feature

  Scenario Outline: Login to web application
    Given email "<username>"
    Given password  "<password>"
    When I click on Signin button
    Then login Should be successful

    Examples: 
      | username      | password |
      | abcde@xyz.com | Test@123 |
