Feature: Buy
  Scenario: 1 Successful purchase
    When I am on the Sauce Demo Login Page
    Then I fill the account information for account StandardUser into the Username field and the Password field
    And I click the Login Button
    Then I am redirected to the Sauce Demo Main Page
    When I choose the item to purchase
    And I click the Add To Cart button
    Then I click the shopping cart icon and redirected to the Cart Page
    When I click the checkout  button
    Then I am redirected to the CheckOut Information Page
    When I fill field First Name, Last Name, Zip Code
    And I click the Continue Button
    Then I am redirected to the CheckOut Overview Page
    And I click the Finish button
    Then I verify the Order Message contains the text "THANK YOU FOR YOUR ORDER"