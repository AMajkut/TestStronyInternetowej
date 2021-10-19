Feature: add new user address

  Scenario Outline: user adds new address for existing account
    Given user with mystore-testlab account with opened website
    When user logs in with "<email>" as email and "<password>" as password
    And user clicks Addresses button
    When user fills "<alias>", "<address>", "<zipCode>", "<city>", "<country>", "<phone>"
    And user clicks Save button
    Then new address "<alias>" appears on Your addresses page
    And "Address successfully added!" is displayed

    Examples:
    |email                        |password   |alias|address  |zipCode |city   |country        |phone|
    |telire8916@specialistblog.com|password123|Home |Długa 12 |12-345  |Londyn |United Kingdom |123456789|

