Feature: Member login and logout Mechanism

  Background: 
    Given I open my "chrome" browser
    And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    And I click Login link

  @sc01
 #Scenario: Successfull land registration page
    #When I click "signup button"
    #Then I land on "register page" and expect title text  as "User Registration"
    #
      #Scenario: Successfully creation of a new user
    #And I click "signup button"
    #When I complete the registration form for a new user firstname "Mr Hasan " lastname "generateNew"
    #Then I expect "new user profile name" text as "Mr Hasan generateNew"
  #
#Creating Account With Existing information
  
    #Scenario: Creating account with the information of a existing user
     #And I click "signup button"
    #When I complete the registration form for a new user firstname "Mr Hasan " lastname "All Existing Information"
    #Then I expect "existing" error text as "Please correct the following errors to continue!* User Name already exists!* The email address is already in use!."
    #
     #Scenario: Creating account with existing user email Id
#	 And I click "signup button"
    #When I complete the registration form for a new user firstname "Mr Hasan " lastname "generateNew-existingUserEmail"
    #Then I expect "existing" error text as "Please correct the following errors to continue!* The email address is already in use!."
    #
     #Scenario: Creating account with existing user name
    #And I click "signup button"
    #When I complete the registration form for a new user firstname "Mr Hasan " lastname "generateNew-existingUserName"
    #Then I expect "existing" error text as "Please correct the following errors to continue!* User Name already exists!"
    ## Creating Account With Invalid Email
    
      #Scenario: Creating account with unmatched confirm password
    #And I click "signup button"
    #When I complete the registration form for a new user firstname "Mr Hasan " lastname "generateNew-unmatchConfirmPassword"
    #Then I expect popup aletr window with text as "Confirm password does not match with the password"
    #And I click "ok button in pop up alert window"
    #
    ## Creating Account With Invalid Email
    #
    #Scenario: Create account with Invalid Email
     #And I click "signup button"
    #When I complete the registration form for a new user firstname "Mr Hasan " lastname "generateNew-invalidEmailId"
    #Then I expect popup aletr window with text as "Invalid Email Address"
    #And I click "ok button in pop up alert window"
    
  ####  #Creating Account With Empty field 
    
    Scenario: Creating account with empty email field
    
     And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan " lastname "generateNew-emptyEmailField"
    Then I expect popup aletr window with text as "Enter Email Address. "
    And I click "ok button in pop up alert window"
    
    
    
    
    
    
    