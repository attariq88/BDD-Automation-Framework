Feature: search items
  Scenario: user being able to search for java books
    Given user opens the browser and navigate to amazon.com
    When user can see the search bar
    Then user types Nike Shoes in the search bar
    And user clicks on search button
    And user can see search result of Nike Books
    And user close the browser

  Scenario Outline: user being able to search for java books
    Given user opens the browser and navigate to amazon.com
    When user can see the search bar
    Then user types <brandName> in the search bar
    And user clicks on search button
    And user can see search result of Nike Books
    And user close the browser

    Examples:
    |brandName|
    |Nike|
    |Addidas|