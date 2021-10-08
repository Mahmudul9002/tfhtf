package stepdefinationcode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjectmodel.Homepage;

public class CommonActionsStepCodes {

	StepCodesHelper helper;

	public CommonActionsStepCodes(StepCodesHelper helper) {
		this.helper = helper;
	}

////New Regular Expression Step code	
	
	
	

	@Given("I enter {string} as {string}")
	public void i_enter_as(String elementName, String elementValue) {
		 elementName=elementName.toLowerCase().trim();
	   if (elementName.equals("User Name".toLowerCase())) {
		   helper.GetHomepage().EnterUserName(elementValue);
		   
	   }else if(elementName.equals("password".toLowerCase())) {
		   helper.GetHomepage().EnterPassword(elementValue);
		   
	   }else if(elementName.equals("seller User Name".toLowerCase())) {
		   helper.GetSellerLoginPage().EnterUserName(elementValue);
		   
	   }else if(elementName.equals("seller Password".toLowerCase())) {
		   helper.GetSellerLoginPage().EnterPassword(elementValue);
		   
	   }
	}

	@When("I click {string}")
	public void i_click(String elementName) {
		elementName = elementName.toLowerCase().trim();
		///Member login page 
		if (elementName.equals("Login Button".toLowerCase())) {
			helper.GetHomepage().ClickloginButton();
		} else if (elementName.equals("profile drop down button".toLowerCase())) {
			helper.GetHomepage().ClickProfileDropdownButton();
		} else if (elementName.equals("logout link".toLowerCase())) {
			helper.GetHomepage().ClickLogOutLink();
		} else if (elementName.equals("signup button".toLowerCase())) {
			helper.GetHomepage().ClickSignUpButton();
		}
		//Seller login page
		else if (elementName.equals("seller page login button".toLowerCase())) {
			helper.GetSellerLoginPage().ClickLoginButton();
		} else if (elementName.equals("seller page Logout Button".toLowerCase())) {
			helper.GetSellerLoginPage().ClickLogoutButton();
		}else if (elementName.equals("ok button in pop up alert window")) {
			helper.GetRegAccountPage().ClickAlertOkButton();
		}
		
		

	}

	

	
	
	
	
	
	
	
	
	@And("I click Login link")
	public void i_click_login_link() {

		helper.GetHomepage().Clickloginlink();
	}

//	@And("I click signup button")
//	public void i_click_on_signup_button() {
//		helper.GetHomepage().ClickSignUpButton();
//	}



//	@And("I click drop down profile button")
//	public void i_click_drop_down_profile_button() {
//
//		helper.GetHomepage().ClickProfileDropdownButton();
//
//	}
	@When("I click my account link")
	public void i_click_my_account_link() {
	    helper.GetHomepage().ClickMyAccountLink();
	}

//	@When("I click logout link")
//	public void i_click_logout_link() {
//		helper.GetHomepage().ClickLogOutLink();
//
//	}



	@Given("I clear  User Name")
	public void i_clear_user_name() {
		helper.GetHomepage().ClearUserNameField();
	}

}
