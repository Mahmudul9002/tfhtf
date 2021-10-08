package stepdefinationcode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonStepCodes {
	StepCodesHelper helper;
 public CommonStepCodes(StepCodesHelper helper) {
	 this.helper = helper;
 }
	
	///common steps 
		@Given("I open my {string} browser")
		public void i_open_my_browser(String browserName) {

//			
			helper.GetBrowser().OpenBrowser(browserName);
			
		}

		@And("I naviget to mct webpage url {string}")
		public void i_naviget_to_mct_webpage(String webpageUrl) {
			//browser
			helper.GetBrowser().NavigettoWbpage(webpageUrl);
		}
//		@Given("I Scroll down in the page {string} {string}")
//		public void i_scroll_down_in_the_page(String horizontal, String vertical) {
//			helper.GetFooterSection().ScrollBar(horizontal,vertical);
//		    
//		}
//		@Given("I Scrol down {string}")
//		public void i_scrol_down(String string) {
//		   helper.GetFooterSection()
//		}
//		
//		@Given("I Scroll down in the page")
//		public void i_scroll_down_in_the_page() {
//			//helper.GetBrowser().GetScrollBar();
//			helper.GetFooterSection().GetScrollBar();
//		    
//		}
		
//		@Given("I Scroll down in the page {string}{string}")
//		public void i_scroll_down_in_the_page(String horizontal, String vertical) {
//		    helper.GetBrowser().GetScrollBar(horizontal, vertical);
//		}

		@Then("I close my browser")
		public void i_close_my_browser() {
			helper.GetHomepage().CloseBrowser();
		}
			
			
}
