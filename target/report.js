$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/leo/eclipse-workspace/cucumberProject/src/test/resources/Feature/AdactinhotelWithCuCuOptions.feature");
formatter.feature({
  "name": "Adactin hotel deatails verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To book the adactin hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "we have enter username and password for login",
  "keyword": "Given "
});
formatter.step({
  "name": "click login \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Enter room deatails and book",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Location",
        "Hotel",
        "Room Type",
        "Number of Rooms",
        "Check In Date",
        "Check Out Date",
        "Adults per Room",
        "Children per Room"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Super Deluxe",
        "1 - One",
        "05/04/2021",
        "10/04/2021",
        "1 - One",
        "1 - One"
      ]
    },
    {
      "cells": [
        "Melbourne",
        "Hotel Sunshine",
        "Double",
        "3 - Three",
        "06/04/2021",
        "09/04/2021",
        "2 - Two",
        "2 - Two"
      ]
    }
  ]
});
formatter.step({
  "name": "select hotel verifivation form and click continue",
  "keyword": "And "
});
formatter.step({
  "name": "fill the transaction details and card details",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "First_Name",
        "Last_Name",
        "BillingAddress",
        "CreditCard_No",
        "Credit_Card_Type",
        "ExpiryMonth",
        "ExpiryYear",
        "CVV_Number"
      ]
    },
    {
      "cells": [
        "leo",
        "praveen",
        "sivagangai",
        "1234567891234567",
        "American Express",
        "February",
        "2022",
        "456"
      ]
    },
    {
      "cells": [
        "leo",
        "praveen",
        "128-1 sivagangai",
        "1234567891234567",
        "American Express",
        "February",
        "2022",
        "456"
      ]
    }
  ]
});
formatter.step({
  "name": "click continue",
  "keyword": "And "
});
formatter.step({
  "name": "get PO number",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "leopraveen01",
        "bo9597894811"
      ]
    },
    {
      "cells": [
        "leopraveen01",
        "bo9597894811"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To book the adactin hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "we have enter username and password for login",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.we_have_enter_username_and_password_for_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login \"leopraveen01\" and \"bo9597894811\"",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.click_login_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter room deatails and book",
  "rows": [
    {
      "cells": [
        "Location",
        "Hotel",
        "Room Type",
        "Number of Rooms",
        "Check In Date",
        "Check Out Date",
        "Adults per Room",
        "Children per Room"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Super Deluxe",
        "1 - One",
        "05/04/2021",
        "10/04/2021",
        "1 - One",
        "1 - One"
      ]
    },
    {
      "cells": [
        "Melbourne",
        "Hotel Sunshine",
        "Double",
        "3 - Three",
        "06/04/2021",
        "09/04/2021",
        "2 - Two",
        "2 - Two"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.enter_room_deatails_and_book(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select hotel verifivation form and click continue",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.select_hotel_verifivation_form_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill the transaction details and card details",
  "rows": [
    {
      "cells": [
        "First_Name",
        "Last_Name",
        "BillingAddress",
        "CreditCard_No",
        "Credit_Card_Type",
        "ExpiryMonth",
        "ExpiryYear",
        "CVV_Number"
      ]
    },
    {
      "cells": [
        "leo",
        "praveen",
        "sivagangai",
        "1234567891234567",
        "American Express",
        "February",
        "2022",
        "456"
      ]
    },
    {
      "cells": [
        "leo",
        "praveen",
        "128-1 sivagangai",
        "1234567891234567",
        "American Express",
        "February",
        "2022",
        "456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.fill_the_transaction_details_and_card_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click continue",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get PO number",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.get_PO_number()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To book the adactin hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "we have enter username and password for login",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.we_have_enter_username_and_password_for_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login \"leopraveen01\" and \"bo9597894811\"",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.click_login_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter room deatails and book",
  "rows": [
    {
      "cells": [
        "Location",
        "Hotel",
        "Room Type",
        "Number of Rooms",
        "Check In Date",
        "Check Out Date",
        "Adults per Room",
        "Children per Room"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Super Deluxe",
        "1 - One",
        "05/04/2021",
        "10/04/2021",
        "1 - One",
        "1 - One"
      ]
    },
    {
      "cells": [
        "Melbourne",
        "Hotel Sunshine",
        "Double",
        "3 - Three",
        "06/04/2021",
        "09/04/2021",
        "2 - Two",
        "2 - Two"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.enter_room_deatails_and_book(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select hotel verifivation form and click continue",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.select_hotel_verifivation_form_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill the transaction details and card details",
  "rows": [
    {
      "cells": [
        "First_Name",
        "Last_Name",
        "BillingAddress",
        "CreditCard_No",
        "Credit_Card_Type",
        "ExpiryMonth",
        "ExpiryYear",
        "CVV_Number"
      ]
    },
    {
      "cells": [
        "leo",
        "praveen",
        "sivagangai",
        "1234567891234567",
        "American Express",
        "February",
        "2022",
        "456"
      ]
    },
    {
      "cells": [
        "leo",
        "praveen",
        "128-1 sivagangai",
        "1234567891234567",
        "American Express",
        "February",
        "2022",
        "456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.fill_the_transaction_details_and_card_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click continue",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get PO number",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinHotelForCuCuOption.get_PO_number()"
});
formatter.result({
  "status": "passed"
});
});