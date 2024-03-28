Feature: Customer
    Scenario: Add new Customer
        Given user launch chrome browser
        When User opens URL "https://admin-demo.nopcommerce.com/login"
        And User enters Email as "" and password as ""
        And Click on Login
        Then user can view Dashboard
        When User Click on the Customers Menu
        And Click on the Customers Item
        And click on the add new Button
        Then user can view add new customer page
        When User Enter the Customer info
        And click the save Button
        # Then User can view confirmation message "The new customer has been added successfully."
        And close browser

    Scenario: Search customer using companyname
        Given user launch chrome browser
        When User opens URL "https://admin-demo.nopcommerce.com/login"
        And User enters Email as "" and password as ""
        And Click on Login
        Then user can view Dashboard
        When User Click on the Customers Menu
        And Click on the Customers Item
        When user Enter the Customer companyname 
        And click the Search Button
