Feature: My Account Page

  Scenario: User are able to see all the option in my account page
    Given I open my "firefox" browser
    And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    And I click Login link
    And I enter User Name as "user"
    And I enter Password as "pass"
    And I click Login button
    And I click drop down profile button
    When I click my account link
    Then I expect all my account options are available
      | My Orders            |
      | Profile              |
      | My Return Requests   |
      | Change Password      |
      | My Favorite Products |
      | My Favorite Sellers  |
      | Seller Dashboard     |
    And I close my browser
