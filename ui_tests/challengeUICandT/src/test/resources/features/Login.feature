Feature: Login

  Background:
    Given Is on the Login Page

  Scenario: Sign Up the account

#    Given I fill up the e-mail ""
#      And I fill up the form
#      |Title|FirstName |LastName|Email          |Password|Address    |City|State|postalCode|Country|MobilePhone|
#      |Mr   |testNewbie|lastTest|testR@teste.com|123456  |testAddresR|BH  |Ohio |001110    |21     |1230099234 |
#    When Register the account
#    Then The will able to Login

  @SignInAccount
  Scenario: Sign In the account

    And fill up the email "testRCreated@test.com" and I fill up the password "442200"
    When Access the System
    Then The user will be authenticated with success

  @addNewAddress
  Scenario: Add New Address

     And Have already sign in
     And Is on My Address Page
    When Fill up and save the new address
    Then Will be present the new address add

  @updateAddress
  Scenario: Update The Address

    And Have already sign in
    And Is on My Address Page
    When Update the address
    Then Will be present the new data on address
