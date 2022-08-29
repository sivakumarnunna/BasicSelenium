Feature: Sample Feature

   Scenario Outline: Create an account
    Given firstname to register "<firstname>"
    Given lastname to register "<lastname>"
    Given email to register "<email>"
    Given password to register "<password>"
    Given confirmpassword "<conformpassword>"
    When I click on create an account button
    Then account should be created successfully

    Examples: 
      | firstname | lastname  | email            | password | conformpassword |
      | nunna     | sivakumar | abcdefgh@xyz.com | Test@123 | Test@123        |

  #Scenario Outline: Successful login with valid details
    #Given email to login "<email>"
    #Given password to login "<password>"
    #When I click on Signin button
    #Then login Should be successful
#
    #Examples: 
      #| email            | password |
      #| abcdefgh@xyz.com | Test@123 |
