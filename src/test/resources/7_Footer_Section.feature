Feature: Footer Section options

  Background: 
    Given I open my "chrome" browser
    And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    #And I click Login link

Scenario: User are able to see Get to know us And all the option under in footer section
And I Scrol down in the page
Then I expect All Get to know us option link are display in footer
|About Us|
|FAQ|
|Help|
|Site Feedback|
|Terms & Conditions|
|Contact Us|






#About Us
#FAQ
#Help
#Site Feedback
#Terms & Conditions
#Contact Us
  #Scenario: User are able to see Get to know us and all the options under it in footer section
    #Given I open my "firefox" browser
    #And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    #And I Scroll down in the page
    #Then I expect all Get to know us option links are displayed in footer
      #| About Us           |
      #| FAQ                |
      #| Help               |
      #| Site Feedback      |
      #| Terms & Conditions |
      #| Contact Us         |
    #And I close my browser
  #Scenario: User are able to see Shop with us and all the options under it in footer section
    #Given I open my "firefox" browser
    #And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
      #And I Scroll down in the page
    #Then I expect all Shop with us option links are displayed in footer
        #| Combo Products    |
      #| New Products      |
      #| Featured Products |
      #| Categories        |
      #| View Cart         |
      #| Gift Certificate  |
    #And I close my browser
#
  #Scenario: User are able to see Make money with us and all the options under it in footer section
    #Given I open my "firefox" browser
    #And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
      #And I Scroll down in the page
    #Then I expect all Make money with us option links are displayed in footer
      #| Affiliates |
      #| Sellers    |
      #| Home       |
    #And I close my browser
