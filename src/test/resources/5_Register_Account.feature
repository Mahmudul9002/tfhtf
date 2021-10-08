Feature: Create account mechanism test scenerios

  Background: 
    Given I open my "firefox" browser
    And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    And I click Login link

  Scenario: Successfull land registration page
    When I click "signup button"
    Then I land on register page and expect title text  as "User Registration"
    
#
  ###empty field####
  #Scenario: Creating account with all field empty
    #Given I open my "firefox" browser
    #And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    #And I click Login link
    #And I click signup button
    #And I enter Email id as ""
    #And I enter user name as ""
    #And I enter password as ""
    #And I enter confirm password as ""
    #And I enter first name as ""
    #And I enter last name as ""
    #And I enter terms and conditions as ""
    #When I click create account button
    #Then I expect popup aletr window with text as "Enter Email Address. "
    #And I click ok button in pop up alert window
    #And I close my browser
  #Scenario: Creating account with username field empty
    #Given I open my "firefox" browser
    #And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    #And I click Login link
    #And I click signup button
    #And I enter Email id as "abcd01@email.com"
    #And I enter user name as ""
    #And I enter password as ""
    #And I enter confirm password as ""
    #And I enter first name as ""
    #And I enter last name as ""
    #And I enter terms and conditions as ""
    #When I click create account button
    #Then I expect popup aletr window with text as "Enter Username."
    #And I click ok button in pop up alert window
    #And I close my browser
#
  #Scenario: Creating account with password field empty
    #Given I open my "firefox" browser
    #And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    #And I click Login link
    #And I click signup button
    #And I enter Email id as "abcd01@email.com"
    #And I enter user name as "abcd01"
    #And I enter password as ""
    #And I enter confirm password as ""
    #And I enter first name as ""
    #And I enter last name as ""
    #And I enter terms and conditions as ""
    #When I click create account button
    #Then I expect popup aletr window with text as "Enter Password."
    #And I click ok button in pop up alert window
    #And I close my browser
#
  #Scenario: Creating account with confirm password field empty
    #Given I open my "firefox" browser
    #And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    #And I click Login link
    #And I click signup button
    #And I enter Email id as "abcd01@email.com"
    #And I enter user name as "abcd01"
    #And I enter password as "abcd01"
    #And I enter confirm password as ""
    #And I enter first name as ""
    #And I enter last name as ""
    #And I enter terms and conditions as ""
    #When I click create account button
    #Then I expect popup aletr window with text as "Enter Confirm Password."
    #And I click ok button in pop up alert window
    #And I close my browser
#
  #Scenario: Creating account with first name field empty
    #Given I open my "firefox" browser
    #And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    #And I click Login link
    #And I click signup button
    #And I enter Email id as "abcd01@email.com"
    #And I enter user name as "abcd01"
    #And I enter password as "abcd01"
    #And I enter confirm password as "abcd01"
    #And I enter first name as ""
    #And I enter last name as ""
    #And I enter terms and conditions as ""
    #When I click create account button
    #Then I expect popup aletr window with text as "Enter Firstname."
    #And I click ok button in pop up alert window
    #And I close my browser
#
  #Scenario: Creating account with terms and conditions field empty
    #Given I open my "firefox" browser
    #And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    #And I click Login link
    #And I click signup button
    #And I enter Email id as "abcd01@email.com"
    #And I enter user name as "abcd01"
    #And I enter password as "abcd01"
    #And I enter confirm password as "abcd01"
    #And I enter first name as "abcd"
    #And I enter last name as ""
    #And I enter terms and conditions as ""
    #When I click create account button
    #Then I expect popup aletr window with text as "Enter Lastname."
    #And I click ok button in pop up alert window
    #And I close my browser
  #
  #Scenario: Creating account with existing account informations.
#
  #Given I open my "firefox" browser
    #And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    #And I click Login link
    #And I click signup button
  #And I enter Email id as "example01@email.com"
  #And I enter user name as "example01"
  #And I enter password as "example01"
  #And I enter confirm password as "example01"
  #And I enter first name as "example"
  #And I enter last name as "01"
  #And I enter terms and conditions as "example01"
  #When I click create account button
  #Then I expect existing error text as "Please correct the following errors to continue!* User Name already exists!* The email address is already in use!."
  #
  #And I close my browser
  #empty terms and coditions
   #Given I open my "firefox" browser
    #And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    #And I click Login link
    #And I click signup button
    #And I enter Email id as "abcd01@email.com"
    #And I enter user name as "abcd01"
    #And I enter password as "abcd01"
    #And I enter confirm password as "abcd01"
    #And I enter first name as "abcd"
    #And I enter last name as "01"
    #And I enter terms and conditions as ""
    #When I click create account button
    #Then I expect a error text as
    #"""
    #Please correct the following errors to continue!
#Terms & Conditions cannot be empty !
    #""" 
  #
#
 #
    #And I close the browser    
        #
