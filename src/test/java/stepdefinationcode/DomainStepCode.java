package stepdefinationcode;

import io.cucumber.java.en.When;

public class DomainStepCode {

	StepCodesHelper helper;
	public DomainStepCode(StepCodesHelper helper) {
		this.helper=helper;
	}
	@When("I complete the registration form for a new user firstname {string} lastname {string}")
	public void i_complete_the_registration_form_for_a_new_user_firstname_lastname(String firstName, String lastName) {
		helper.GetRegAccountPage().CreateAccountForNewUser(firstName, lastName);
	}

	
}
