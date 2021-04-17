Feature: 
  Check  adactin hotel  Booking page features

  Scenario Outline: To check booking options with fill all valid details adactin hotel
    Given Lanuch Adactin Page
    When Give valid login "<userName>" and "<password>"
    And To Enter the hotel details then clicks search "<Location>", "<Hotel>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    And verify and validation of Search page function with All field enter "SelectHotel" text
    And Selection Page Click select and continue
    And To enter credit card details and address of customers enter "<First Name>","<Last Name>","<Billing Address>"
      | CreditCard_No    | Credit_Card_Type | ExpiryMonth | ExpiryYear | CVV_Number |
      | 1234567891234567 | American Express | February    |       2022 |        456 |
      | 1234567891234567 | Master Card      | January     |       2023 |        956 |
      | 1234567908734567 | VISA             | February    |       2022 |        476 |
      | 1234568905123457 | Other            | March       |       2022 |        678 |
    And After Booking Confirmed by current url "BookingConfirm" assertion validation

    Examples: 
      | userName     | password     | Location | Hotel       | Room Type    | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address    | Credit Card No.  | Credit Card Type | ExpiryMonth | ExpiryYear | CVV Number |
      | leopraveen01 | bo9597894811 | Sydney   | Hotel Creek | Super Deluxe | 1 - One         | 05/04/2021    | 10/04/2021     | 1 - One         | 1 - One           | Parvez     | Ahamed    | 13h, Bazaar Street | 1234567891234567 | American Express | February    |       2022 |        456 |

  Scenario Outline: To check booking options without entering any one of  textbox in hotel booking page
    Given Lanuch Adactin Page
    When Give valid login "<userName>" and "<password>"
    And To Enter the hotel details then clicks search "<Location>", "<Hotel>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    And verify and validation of Search page function with All field enter "SelectHotel" text
    And Selection Page Click select and continue
    And To fill the booking page without entering card number  "<First Name>","<Last Name>","<Billing Address>"
      | Credit_Card_Type | ExpiryMonth | ExpiryYear | CVV_Number |
      | American Express | February    |       2022 |        456 |
      | Master Card      | January     |       2023 |        956 |
      | VISA             | February    |       2022 |        476 |
      | Other            | March       |       2022 |        678 |
    And Verify validation of CardNumber not Enter error message "Please Enter your 16 Digit Credit Card Number" assertion validation

    Examples: 
      | userName     | password     | Location | Hotel       | Room Type    | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address    | Credit Card No.  | Credit Card Type | ExpiryMonth | ExpiryYear | CVV Number |
      | leopraveen01 | bo9597894811 | Sydney   | Hotel Creek | Super Deluxe | 1 - One         | 05/04/2021    | 06/04/2021     | 1 - One         | 1 - One           | Parvez     | Ahamed    | 13h, Bazaar Street | 1234567891234567 | American Express | February    |       2022 |        456 |
