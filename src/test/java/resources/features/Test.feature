Feature: Sample Feature

  #Scenario Outline: Create an account
  #Given firstname to register "<firstname>"
  #Given lastname to register "<lastname>"
  #Given email to register "<email>"
  #Given password to register "<password>"
  #Given confirmpassword "<conformpassword>"
  #When I click on create an account button
  #Then account should be created successfully "<firstname>" ,"<lastname>"
  #When I clicked on Sign out
  #Then user signout successfully
  #
  #Examples:
  #| firstname | lastname | email            | password | conformpassword |
  #| ravi      | kumar    | britan21@xyz.com | Test@123 | Test@123        |
  #
  Scenario Outline: Create an account
    When I am on account creation page
    Given details for creating a new account
      | <firstname> | <lastname> | <email> | <password> | <conformpassword> |
    When I click on create an account button
    Then account should be created successfully "<firstname>" ,"<lastname>"
    When I clicked on Sign out
    Then user signout successfully

    Examples: 
      | firstname | lastname | email  | password | conformpassword |
      | ravi      | kumar    | britan | Test@123 | Test@123        |

  #| ravi      | kumar    | britan | Test@123 | Test@123        |
  #| ravi      | kumar    | britan | Test@123 | Test@123        |
  #| ravi      | kumar    | britan | Test@123 | Test@123        |
  #| ravi      | kumar    | britan | Test@123 | Test@123        |
  #| ravi      | kumar    | britan | Test@123 | Test@123        |
  #| ravi      | kumar    | britan | Test@123 | Test@123        |
  #| ravi      | kumar    | britan | Test@123 | Test@123        |
  Scenario Outline: Successful login with valid details
    Given email to login "<email>"
    Given password to login "<password>"
    When I click on Signin button
    Then login Should be successful

    Examples: 
      | email               | password |
      | britanwvHQR@xyz.com | Test@123 |
