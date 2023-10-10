Feature: This is to book a room in adactin hotel



  Scenario: This is to login and book a hotel in adactin
    Given User should able to login and navigate to search hotel page
    When User should able to search and select hotel
    And User should book a hotel
    Then User should able to see the confirmation of the booked hotel
