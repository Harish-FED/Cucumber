Feature: User Need to book a room in adactin hotel

  #Background: print time
    #Given print the current time

  #@Reg
  Scenario Outline: User need to login adactin website
    Given User should launch the adactin hotel webpage
    When User should login with "<username>" and "<password>"
    And User should click login and navigate to home page

    Examples: 
      | username | password   |
      | Harish03 | Shravan11$ |

  Scenario Outline: User need to select the hotel
    Given User Should select "<location>" and "<hotel>" and "<room_type>" and "<no_of_rooms>" and "<check_in_date>" and "<check_out_date>" and "<no_of_adults>" and "<no_of_children>"
    When User should click search button and navigate to select hotel page
    Then User should select the hotel and click on continue button and navigate to book a hotel page

    Examples: 
      | location | hotel         | room_type    | no_of_rooms | check_in_date | check_out_date | no_of_adults | no_of_children |
      | Brisbane | Hotel Cornice | Super Deluxe | 1 - One     | 11/09/2023    | 13/09/2023     | 2 - Two      | 1 - One        |

  Scenario Outline: User Need to book a hotel
    Given User should select the "<firstName>" and "<lastName>" and "<address>" and "<creditCardNo>" and "<creditCardType>" and "<expiryDate_Month>" and "<expiryDate_Year>" and "<cvvNumber>"
    When User should click on book now button and navigate to booking confirmation page
    And User should click on my itenary button and navigate to booked itenary page
    Then User should enter the order id in search order id input box and click on go button and user should able to see the selected order id with booked info

    Examples: 
      | firstName | lastName | address                                                 | creditCardNo     | creditCardType | expiryDate_Month | expiryDate_Year | cvvNumber |
      | Harish    | Krishnan | B1 - 1st Main Road, Old Perungalathur, Chennai - 600071 | 4691234573459469 | VISA           | November         |            2028 |       786 |
