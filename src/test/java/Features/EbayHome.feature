Feature: Ebay Home Page Scenarios

  @P1 
  Scenario: Advanced Search Link
    Given I am on Eaby Home Page
    When I click on Advanced Link
    Then I should  navigate to Advanced Search page
     
    @P3
  Scenario: Search an item in category
    Given I am on Eaby Home Page
    When I serach for 'motivationbooks' in 'Books' category
    
    
 

	