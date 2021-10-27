Feature: product purchase

 Scenario Outline: user purchase product
   Given user with opened website with mystore-testlab account
   When user logs in with "<email>" and "<password>"
   And user writes "<productName>" on search bar
   When user picks "<productName>" product
   When user chooses "<size>"
   When user chooses "<quantity>" pices of product
   And user checks if product price is reduced by 20%
   And user clicks Add to cart button
   And user clicks Proceed to checkout button
   And user clicks Proceed to checkout button again
   When user confirms the address
   And user chooses Shipping method as pick up in store
   And user chooses Payment as Pay by Check
   When user clicks on therms of service checkbox
   And user clicks Order with an obligation to pay button
   Then user take a screenshot


  Examples:
    |email                        |password   |productName                |size|quantity|
    |telire8916@specialistblog.com|password123|Hummingbird Printed Sweater|M   |5       |
