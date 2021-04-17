Feature: 
  Check  adactin hotel  Cancel booking option from booking Itenary

  Scenario Outline: To Book the hotel nad  get order id then cancel same order id
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
    And Cancel same  last Booked order id 
    And Verify status Order if presense or not  "The booking has been cancelled."

    Examples: 
      | userName     | password     | Location | Hotel       | Room Type    | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address    |
      | leopraveen01 | bo9597894811 | Sydney   | Hotel Creek | Super Deluxe | 1 - One         | 05/04/2021    | 10/04/2021     | 1 - One         | 1 - One           | Parvez     | Ahamed    | 13h, Bazaar Street |

  Scenario Outline: Go to  Booked Itinerary then cancelled known Order Id.
    Given Lanuch Adactin Page
    When Give valid login "<userName>" and "<password>"
    And Go Booked Itenary tab and Pass "<order_ID>" then  Select radio button and Click CancelOrderID button
    And Verify status Order if presense or not  "The booking has been cancelled."

    Examples: 
      | userName     | password     | order_ID   |
      | leopraveen01 | bo9597894811 | M6K70748G3 |
