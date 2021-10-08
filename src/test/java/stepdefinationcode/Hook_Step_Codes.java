package stepdefinationcode;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook_Step_Codes {
	StepCodesHelper helper;
	public Hook_Step_Codes(StepCodesHelper helper) {
		this.helper = helper;
		
	}
	
	
	///hook for before
	@Before
	public void RampUp() {
		
	}
	
	
	//hook for after
	@After
	public void TearDown() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		helper.GetBrowser().driver.close();
	}

}
