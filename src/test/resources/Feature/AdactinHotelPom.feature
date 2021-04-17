Feature: AdactinHotel Deatailed verifivation

  Scenario Outline: verify Booking function of Adactin Hotel page
    Given Lanch ur for Adactin with ChromeBrowser
    When Give Login details are "<username>" and "<password>"
    And User has given hotel booking details then book "<Location>", "<Hotel>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    And Select radio & continue button
    And To enter credit card details and address of customers enter "<First Name>","<Last Name>","<Billing Address>","<Credit Card No.>","<Credit Card Type>","<ExpiryMonth>""<ExpiryYear>" and "<CVV Number>"
    And I get PO of Adactin

    Examples: 
      | username     | password     | Location  | Hotel          | Room Type    | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address    | Credit Card No.  | Credit Card Type | ExpiryMonth | ExpiryYear | CVV Number |
      | leopraveen01 | bo9597894811 | Sydney    | Hotel Creek    | Super Deluxe | 1 - One         | 05/04/2021    | 10/04/2021     | 1 - One         | 1 - One           | Parvez     | Ahamed    | 13h, Bazaar Street | 1234567891234567 | American Express | February    |       2022 |        456 |
      | leopraveen01 | bo9597894811 | Melbourne | Hotel Sunshine | Double       | 3 - Three       | 06/04/2021    | 09/04/2021     | 2 - Two         | 2 - Two           | Parvez     | Ahamed    | 13h, Bazaar Street | 1234567891234567 | American Express | February    |       2022 |        456 |
