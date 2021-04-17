
Feature: 
  To verify adactin hotel search page  possibilties

  Scenario Outline: To Check result of Adactin Hotel search page with filling all fields of text boxes
    Given Lanuch Adactin Page
    When Give valid login "<userName>" and "<password>"
    And To Enter the hotel details then clicks search "<Location>", "<Hotel>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    And verify and validation of Search page function with All field enter "SelectHotel" text

    Examples: 
      |  userName     | password     | Location  | Hotel          | Room Type    | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | leopraveen01 | bo9597894811 | Sydney    | Hotel Creek    | Super Deluxe | 1 - One         | 05/04/2021    | 10/04/2021     | 1 - One         | 1 - One           |

  Scenario Outline: To Check search result of Adactin Hotel search page with filling mandatory field only
    Given Lanuch Adactin Page
    When Give valid login "<userName>" and "<password>"
    And To fill search hotel mandatory fields then clicks search  "<Location>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>"
    And verify and validation of Search page function with mandatory field enter  "SelectHotel" text

    Examples: 
      | userName     | password     | Location | Number of Rooms | Check In Date | Check Out Date | Adults per Room |
      | leopraveen01 | bo9597894811 | Sydney   | 1 - One         | 05/04/2021    | 10/04/2021     | 1 - One         |

  
  Scenario Outline: To Check result of Adactin Hotel search page with invalid check out date
    Given Lanuch Adactin Page
    When Give valid login "<userName>" and "<password>"
    And To fill search hotel mandatory fields and pass invalid checkout dates  then click continue  "<Location>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>"
    And verify and validation of Search page function for invalid checkoutdate  "Check-Out Date shall be after than Check-In Date" text

    Examples: 
      | userName     | password     | Location | Number of Rooms | Check In Date | Check Out Date |Adults per Room |
      | leopraveen01 | bo9597894811 | Sydney   | 1 - One         | 05/04/2021    | 03/04/2021     |1 - One         |

  Scenario Outline: To Check result of Adactin Hotel search page without filling all field of textboxes
    Given Lanuch Adactin Page
    When Give valid login "<userName>" and "<password>"
    And clik continue without filling textboxes
    And verify and validation of Search page function without entering FieldTextBox  by  "Please Select a Location" text

    Examples: 
      | userName     | password     |
      | leopraveen01 | bo9597894811 |
