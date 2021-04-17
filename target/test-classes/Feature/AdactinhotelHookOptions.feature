Feature: Adactin hotel deatails verification
@reg
  Scenario Outline: To book the adactin hotel
    Given we have enter username and password for login
    When click login "<userName>" and "<password>"
    And Enter room deatails and book
      | Location  | Hotel          | Room Type    | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | Sydney    | Hotel Creek    | Super Deluxe | 1 - One         | 05/04/2021    | 10/04/2021     | 1 - One         | 1 - One           |
      | Melbourne | Hotel Sunshine | Double       | 3 - Three       | 06/04/2021    | 09/04/2021     | 2 - Two         | 2 - Two           |
    And select hotel verifivation form and click continue
    And fill the transaction details and card details
      | First_Name | Last_Name | BillingAddress   | CreditCard_No    | Credit_Card_Type | ExpiryMonth | ExpiryYear | CVV_Number |
      | leo        | praveen   | sivagangai       | 1234567891234567 | American Express | February    |       2022 |        456 |
      | leo        | praveen   | 128-1 sivagangai | 1234567891234567 | American Express | February    |       2022 |        456 |
    And click continue
    And get PO number

    Examples: 
      | userName     | password     |
      | leopraveen01 | bo9597894811 |
