Feature: Contact Us

  Scenario: Send Message with Success on Contact Us

    Given Is on Contact Us Page
     When include the message
    |Subject|emailAddress          |OrderNumber|Message         |
    |2      |testUnderTest@test.com|0823       |testWriteMessage|
     Then Will send the message with success