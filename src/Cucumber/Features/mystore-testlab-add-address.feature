Feature: add new user address

  Scenario Outline: user adds new address for existing account
    Given user with mystore-testlab account with opened website
    When user logs in with "<email>" as email and "<password>" as password
    And user clicks Addresses button
    When user fills "<alias>", "<address>", "<zipCode>", "<city>", "<country>", "<phone>"
    And user clicks Save button
    Then "Address successfully added!" is displayed

    Examples:
    |email                        |password   |alias|address            |zipCode  |city   |country        |phone|
    |telire8916@specialistblog.com|password123|Home |221b Baker Street  |NW1 6XE  |Londyn |United Kingdom |123456789|
