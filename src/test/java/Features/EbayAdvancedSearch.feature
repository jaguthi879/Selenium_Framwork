Feature: Ebay Advanced Search Page

   @P7
  Scenario: Ebay Logo on Advanced Search Page
    Given I am Ebay Advanced Search Page
    When I click on Ebay Logo
    Then I will be navigated to Ebay Home Page
    Then I will search for "iphone12"
    Then I validate the number of search items present
    
     @P2
  Scenario:  Verify the search item 
    Given I am on Eaby Home Page
    Then I will search for "laptops"
    Then I validate the number of search items present
     