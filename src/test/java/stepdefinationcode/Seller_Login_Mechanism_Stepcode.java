package stepdefinationcode;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Seller_Login_Mechanism_Stepcode{
	
	StepCodesHelper helper;
	public Seller_Login_Mechanism_Stepcode(StepCodesHelper helper) {
		this.helper = helper;
	}
	
//	@Given("I open my system {string} browser")
//	public void i_open_my_system_browser(String browserName) {
//	    browser = new Browsers();
//	    browser.OpenBrowser(browserName);
//	}
//
//	@And("I naviget to mct seller login wabepage url {string}")
//	public void i_naviget_to_mct_seller_login_wabepage_url(String webpageUrl) {
//	    browser.NavigettoWbpage(webpageUrl);
//	}

//	@And("I enter seller User Name as {string}")
//	public void i_enter_seller_user_name_as(String sellerUserName) {
//		//seller = new Sellerloginpage(browser.driver);
//		helper.GetSellerLoginPage().EnterUserName(sellerUserName);
//	    
//	}

//	@And("I enter seller Password as {string}")
//	public void i_enter_seller_password_as(String sellerPassword) {
//		helper.GetSellerLoginPage().EnterPassword(sellerPassword);
//	}

//	@When("I click seller page login button")
//	public void i_click_seller_page_login_button() {
//		helper.GetSellerLoginPage().ClickLoginButton();
//	}

//	@Then("I expect seller profile name text as {string}")
//	public void i_expect_seller_profile_name_text_as(String expectedProfileName) {
//		String actualProfileName = helper.GetSellerLoginPage().GetActualProfileName();
//		Assert.assertEquals("", actualProfileName, expectedProfileName.toLowerCase());
//	    
//	}
//	@Then("I expect invalid input error text as {string}")
//	public void i_expect_invalid_input_error_text_as(String expectedInvalideError) {
//	    String acctualInvalidError = helper.GetSellerLoginPage().GetActualInvalidError();
//	    Assert.assertEquals(expectedInvalideError.toLowerCase(), acctualInvalidError);
//	    
//	}
	///logout mechanism
//		@When("I click Logout Button")
//		public void i_click_logout_button() {
//			helper.GetSellerLoginPage().ClickLogoutButton();
//		}

//		@Then("I landed to login page and expect a title text as {string}")
//		public void i_landed_to_login_page_and_expect_a_title_text_as(String expectedLogiPageTitleText) {
//		   String actualLoginPageTitleText = helper.GetSellerLoginPage().GetActualLoginPageTitleText();
//		   Assert.assertEquals(expectedLogiPageTitleText.toLowerCase(), actualLoginPageTitleText);
//		  
		//}
		
//		@And("I click ok button in pop up alert window")
//		public void i_click_ok_button_in_pop_up_alert_window() {
//			helper.GetSellerLoginPage().ClickOkOnAlertwindow();
//		}

//
//	@And("I close the  browser")
//	public void i_close_the_browser() {
//	   seller.CloseBrowser();
//	}

}
