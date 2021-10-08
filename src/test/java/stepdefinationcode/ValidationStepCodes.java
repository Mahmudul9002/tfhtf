package stepdefinationcode;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class ValidationStepCodes {
	StepCodesHelper helper;

	public ValidationStepCodes(StepCodesHelper helper) {
		this.helper = helper;

	}

	//// Homepage start
	///Regular expression step code
	@Then("I expect {string} text as {string}")
	public void i_expect_text_as(String elementName, String expectedProfileName) {
		elementName=elementName.trim().toLowerCase();
		///member  home page profile 
		if(elementName.equals("profile name".toLowerCase())) {
			String actualProfileName = helper.GetHomepage().GetActualProfileName();
		Assert.assertEquals("Faild to find the correct profile name", actualProfileName,expectedProfileName.toLowerCase());
			
		}
		///Seller home page profile
		else if(elementName.equals("seller profile name".toLowerCase())) {
			String actualProfileName = helper.GetSellerLoginPage().GetActualProfileName();
			Assert.assertEquals("", actualProfileName, expectedProfileName.toLowerCase());
		    
		}
		
		
		
	   
	}   
	
	
	
	
//	@Then("I expect profile name text as {string}")
//	public void i_expect_profile_name_as(String expectedProfileName) {
//		String actualProfileName = helper.GetHomepage().GetActualProfileName();
//
//		Assert.assertEquals("Faild to find the correct profile name", actualProfileName,
//				expectedProfileName.toLowerCase());
//
//	}
	
	
	
	@Then("I expect empty {string} error  text as {string}")
	public void i_expect_empty_error_text_as(String fieldName, String expectedEmptyFieldErrorText) {
		fieldName=fieldName.trim().toLowerCase();
		if(fieldName.equals("user name".trim().toLowerCase())) {
			String actualEmptyUserNameFieldError = helper.GetHomepage().GetActualEmptyUserNameFieldError();
		Assert.assertEquals(actualEmptyUserNameFieldError, expectedEmptyFieldErrorText.toLowerCase());
			
		}
		else if(fieldName.equals("paasword".trim().toLowerCase())) {
			String actualdEmptyPasswowrdFieldError = helper.GetHomepage().GetActualEmptyPasswowrdFieldError();
			Assert.assertEquals(actualdEmptyPasswowrdFieldError, expectedEmptyFieldErrorText.toLowerCase());
			
		}
		
	   
	}
	@Then("I land on {string} and expect title text  as {string}")
	public void i_land_on_and_expect_title_text_as(String pageName, String expectedpageTitleText) {
		pageName = pageName.trim().toLowerCase();
	   if(pageName.equals("register page")) {
		   String actualTitleText = helper.GetRegAccountPage().GetActualRegisterTittleText();
		   Assert.assertEquals(actualTitleText, expectedpageTitleText.toLowerCase());
	    
	}

//		   String actualTitleText = helper.GetRegAccountPage().GetActualRegisterTittleText();
//		   Assert.assertEquals(actualTitleText, expectedpageTitleText.toLowerCase());
//	   }
	}


	
	@Then("I expect {string} error text as {string}")
	public void i_expect_error_text_as(String errortype, String expectederrorText) {
		errortype=errortype.trim().toLowerCase();
		if(errortype.equals("existing".trim().toLowerCase())) {
		String actualerrorText = helper.GetRegAccountPage().GetActualErrorText();
		   Assert.assertEquals(actualerrorText, expectederrorText.toLowerCase());
		}
	}

	@Then("I expect a input invalid error  text as {string}")
	public void i_expect_a_input_invalid_error_text_as(String expectedInvalidErrorText) {
		String actualInvalidErrorText = helper.GetHomepage().GetActuaInvalidlErrorText();
		Assert.assertEquals(actualInvalidErrorText, expectedInvalidErrorText.toLowerCase());

	}
	// Homepage End
	//seller login mechanism
	
	@Then("I expect invalid input error text as {string}")
	public void i_expect_invalid_input_error_text_as(String expectedInvalideError) {
	    String acctualInvalidError = helper.GetSellerLoginPage().GetActualInvalidError();
	    Assert.assertEquals(expectedInvalideError.toLowerCase(), acctualInvalidError);
	    
	}

//	@Then("I landed to login page and expect a title text as {string}")
//	public void i_landed_to_login_page_and_expect_a_title_text_as(String expectedLogiPageTitleText) {
//	   String actualLoginPageTitleText = helper.GetSellerLoginPage().GetActualLoginPageTitleText();
//	   Assert.assertEquals(expectedLogiPageTitleText.toLowerCase(), actualLoginPageTitleText);
//	  
//	}
	//pop up alert 
	@Then("I expect seller page popup aletr window with  text as {string}")
	public void i_expect_seller_page_popup_aletr_window_with_text_as(String expectedAlertText) {
		String actualAlertText = helper.GetSellerLoginPage().GetTextFromAlertWindow();
	  Assert.assertEquals("alert", expectedAlertText.toLowerCase(), actualAlertText);
	}
	
	///register  account page
	
	@Then("I land on register page and expect title text as {string}")
	public void i_land_on_register_page_and_expect_title_text_as(String expectedTitleText) {
		String actualTitleText = helper.GetRegAccountPage().GetActualRegisterTittleText();
		   Assert.assertEquals(actualTitleText, expectedTitleText.toLowerCase());
	    
	}

	// pop up alert
	@Then("I expect popup aletr window with text as {string}")
	public void i_expect_popup_aletr_window_with_text_as(String expectAlerttText) {
	  String actualAlerttext = helper.GetRegAccountPage().GetTextFromAlertWindow();
	  Assert.assertEquals("alert",expectAlerttText.toLowerCase(), actualAlerttext);
	}


	/// My account

	@Then("I expect all my account options are available")
	public void i_expect_all_my_account_options_are_available(DataTable dataTable) {

		List<String> expectedMyAccountOptions = dataTable.asList(String.class);
		// for(int i=0;i<expectedOptions.size();i++) {
		// //System.out.println("exp option from gherkin (" + i +")" +
		// expectedOptions.get(i));
		// }

		//// Get the List of Option From UI - Selenium
		List<String> actualMyAccountOptions = helper.GetMyAccountPage().GetAllMyAccountOptionsFromUI();
		///// Compare 2 List
		Assert.assertEquals("List Not Matched !!", actualMyAccountOptions, expectedMyAccountOptions);

	}
	
	
	
	
	
	
	
	
	///Footer
//	@Then("I expect all Get to know us option links are displayed in footer")
//	public void i_expect_all_get_to_know_us_option_links_are_displayed_in_(DataTable getToKnowUsDataTable) {
//		List<String> expectedGetToKnowUsOptions = getToKnowUsDataTable.asList(String.class);
////		 
//		//Get text from webelements
//		List<String> actualGetToKnowUsOptions = helper.GetFooterSection().GetToKnowUsOptionsFromUI();
//		//Compare both table
//		Assert.assertEquals(expectedGetToKnowUsOptions, actualGetToKnowUsOptions);
//	  
//	}
//	@Then("I expect all Shop with us option links are displayed in footer")
//	public void i_expect_all_shop_with_us_option_links_are_displayed_in_footer(DataTable shopWithUsDataTable) {
//		List<String>expectedShopWithUsOptions = shopWithUsDataTable.asList(String.class);
//		List<String>actualShopWithUsOptions =helper.GetFooterSection().GetShopWithUsOptionsFromUI();
//		Assert.assertEquals(expectedShopWithUsOptions, actualShopWithUsOptions);
//	    
//	}
//	@Then("I expect all Make money with us option links are displayed in footer")
//	public void i_expect_all_make_money_with_us_option_links_are_displayed_in_footer(DataTable makeMoneyWithUsDataTable) {
//		List<String>expectedMakeMoneyWithUsOptions = makeMoneyWithUsDataTable.asList(String.class);
//		List<String>actualMakeMoneyWithUsOptions = helper.GetFooterSection().GetMakeMoneyWithUsFromUI();
//		Assert.assertEquals(expectedMakeMoneyWithUsOptions, actualMakeMoneyWithUsOptions);
//	    
//	}



}
