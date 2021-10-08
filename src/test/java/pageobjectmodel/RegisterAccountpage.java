package pageobjectmodel;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

public class RegisterAccountpage extends Parentpage {

	String getregistertitletext = "items_top_area_ttl";
	String emailfield = "txtEmail";
	String usernamefield = "txtUserName";
	String passwordfield = "txtPassword";
	String confirmpassword = "txtCnfPassword";
	String firstnamefield = "txtFirstName";
	String lastnamefield = "txtLastName";
	String getprofilename = "//button[@id='dLabel']//child::span";
	String createaccountbutton = "btnRegister";
	String errortext ="//div[@class=\"error\"]";
	String termsandconditions = "//textarea[@name='custom_field_1']";
	String addressfield = "//input[@placeholder='Address *']";
	
	//"//input[@placeholder='Address *']"
	//div[@class='error' and contains(text(),'Please correct the following errors to continue!')]
	//String actualerror = "//div[@class='error']//child::br[1]";
	//div[@class='error' and normalize-space(text(,'Please correct the following errors to continue!')]

	public RegisterAccountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	String email;
	String username;
	String password;
	String cpassword;
	//String firstname
	String lastname;
	String address;
	String randomlastname;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void CreateAccountForNewUser(String firstName, String lastName) {
		// TODO Auto-generated method stub
		lastName=lastName.trim().toLowerCase();
		if(lastName.contains("generateNew".trim().toLowerCase())) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.ss").format(new Date());
		randomlastname= timeStamp;
		email = randomlastname+"@gmail.com";
		username=firstName +randomlastname;
		password = "password";
		cpassword = "password";
		lastname= randomlastname;
		address = randomlastname;
		
		}else if(lastName.contains("All Existing Information".trim().toLowerCase())) {
			email= "example@email.com";
			username = "Mr hasan example";
			password ="password";
			cpassword= "password";
			lastname= "example";
			address = "31-10 37th Ave, Long Island";
			
		}if(lastName.contains("existingUserEmail".trim().toLowerCase())) {
			email="example@email.com";
		}else if(lastName.contains("existingUserName".trim().toLowerCase())) {
			username = "Mr hasan example";
		}else if (lastName.contains("unmatchConfirmPassword".trim().toLowerCase())) {
			password = "1234";
		}else if(lastName.contains("invalidEmailId".trim().toLowerCase())) {
			email="hasabhj @.com";
		}else if(lastName.contains("emptyEmailField".trim().toLowerCase())) {
			email="";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		EnterValueOnWebElementById(emailfield , email);
		EnterValueOnWebElementById(usernamefield , username);
		EnterValueOnWebElementById(passwordfield,password);
		EnterValueOnWebElementById(confirmpassword, cpassword);
		EnterValueOnWebElementById(firstnamefield, firstName);
		EnterValueOnWebElementById(lastnamefield ,lastname);
		EnterValueOnWebElementByXpath(addressfield,address);
		
		ClickWebElementById(createaccountbutton);
		
		
		
	}
	

	
	
//	public void EnterEmail(String enterEmail) {
//		// TODO Auto-generated method stub
//		EnterValueOnWebElementById(email, enterEmail);
//	}
//
//	public void EnterUserName(String userName) {
//		// TODO Auto-generated method stub
//
//		EnterValueOnWebElementById(username, userName);
//	}
//
//	public void EnterPassword(String enterPassword) {
//		// TODO Auto-generated method stub
//		EnterValueOnWebElementById(password, enterPassword);
//		// browsercreateaccount.findElement(By.id("txtPassword")).sendKeys(enterPassword);
//	}
//
//	public void EnterConfirmPassword(String enterConfirmPassword) {
//		// TODO Auto-generated method stub
//		EnterValueOnWebElementById(confirmpassword, enterConfirmPassword);
//
//		// browsercreateaccount.findElement(By.id("txtCnfPassword")).sendKeys(enterConfirmPassword);
//	}
//
//	public void EnterFirstName(String enterFirstName) {
//		// TODO Auto-generated method stub
//		EnterValueOnWebElementById(firstname, enterFirstName);
//
//		// browsercreateaccount.findElement(By.id("txtFirstName")).sendKeys(enterFirstName);
//
//	}
//
//	public void EnterLastName(String enterLastName) {
//		// TODO Auto-generated method stub
//
//		EnterValueOnWebElementById(lastname, enterLastName);
//		// browsercreateaccount.findElement(By.id("txtLastName")).sendKeys(enterLastName);
//
//	}
//
//	public String GetActualProfileName() {
//		//return GetTextFromWebElementById(getprofilename);
//		return GetTextFromWebElementByXpath(getprofilename);
//	}

//	public void CloseBrowser() {
//		// TODO Auto-generated method stub
//		CloseBrowser();
//	}

	public String GetActualRegisterTittleText() {
		// TODO Auto-generated method stub
		return GetTextFromWebElementById(getregistertitletext);
		// browsercreateaccount.findElement(By.id("items_top_area_ttl")).getText().toLowerCase();
	}

	
	public void ClickCreateAccountButton() {
		// TODO Auto-generated method stub
		ClickWebElementById(createaccountbutton);
		// browsercreateaccount.findElement(By.id("btnRegister")).click();
	}

	public String GetActualErrorText() {
		String actualErrorText = GetTextFromWebElementByXpath(errortext);
		
		actualErrorText=actualErrorText.replace("\n", "");
		actualErrorText=actualErrorText.trim();
		
		
		
		
		
		
		return actualErrorText;
		
	

		
	}

	
	public void EnterTermsAndConditions(String enterTermsAndConditions) {
		// TODO Auto-generated method stub
		EnterValueOnWebElementByXpath(termsandconditions, enterTermsAndConditions);
	}
























	

	

}
