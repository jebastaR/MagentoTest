package com.step;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pojo.MagentoSignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC02_MagentoSignInPageStep extends BaseClass{
	
	@When("I click on the Sign In button in Homepage")
	public void i_click_on_the_sign_in_button_in_homepage() {
		MagentoSignInPage magentoSignInPage = new MagentoSignInPage();

		WebElement btnSignIn = magentoSignInPage.getBtnSignIn();
		elementClick(btnSignIn);
		
	}
	
	@Then("I should be redirected to the Customer Login page and Validate title {string}")
	public void i_should_be_redirected_to_the_customer_login_page_and_validate_title(String expTitle) {
		String actualTitle = getTitle();
		Assert.assertEquals(expTitle, actualTitle);
	}


	@Given("I am on the Customer {string} page")
	public void i_am_on_the_customer_page(String expTitle) {
		String actualTitle = getTitle();
		Assert.assertEquals(expTitle, actualTitle);
	}



	@Then("I should see all the fields in Customer Login Page")
	public void i_should_see_all_the_fields_in_customer_login_page() {
		
		MagentoSignInPage magentoSignInPage = new MagentoSignInPage();
		
		boolean txtEmailField = isDisplayed(magentoSignInPage.getTxtEmail());
		Assert.assertTrue(txtEmailField);
		
		boolean txtPasswordField = isDisplayed(magentoSignInPage.getTxtPass());
		Assert.assertTrue(txtPasswordField);
		
		boolean btnConfirmSignIn = isDisplayed(magentoSignInPage.getBtnSubmitSignIn());
		Assert.assertTrue(btnConfirmSignIn);
		
		boolean btnForgotPassword = isDisplayed(magentoSignInPage.getBtnForgotPassword());
		Assert.assertTrue(btnForgotPassword);
		
	}
	
	@When("I enter {string} in the Email Address field")
	public void i_enter_in_the_email_address_field(String email) {
		MagentoSignInPage magentoSignInPage = new MagentoSignInPage();

		WebElement txtEmail = magentoSignInPage.getTxtEmail();
		elementSendKeys(txtEmail, email);
	}
	@When("I enter {string} in the Password field in Customer Login Page")
	public void i_enter_in_the_password_field_in_customer_login_page(String pass) {
		MagentoSignInPage magentoSignInPage = new MagentoSignInPage();

		WebElement txtPass = magentoSignInPage.getTxtPass();
		elementSendKeys(txtPass, pass);
	}



	@When("I click on the Submit Sign In button in Customer Login Page")
	public void i_click_on_the_submit_sign_in_button_in_customer_login_page() {
		MagentoSignInPage magentoSignInPage = new MagentoSignInPage();

		WebElement btnSubmitSignIn = magentoSignInPage.getBtnSubmitSignIn();
		elementClick(btnSubmitSignIn);

	}
	

	@Then("I should be redirected to my account dashboard and verify the title {string}")
	public void i_should_be_redirected_to_my_account_dashboard_and_verify_the_title(String expTitle) {
		
		String actualTitle = getTitle();
		
		Assert.assertEquals(expTitle, actualTitle);
		
	
	}
	@Then("I should see a welcome message with my name {string}")
	public void i_should_see_a_welcome_message_with_my_name(String userName) {
		MagentoSignInPage magentoSignInPage = new MagentoSignInPage();

		WebElement txtWelcomeMsg = magentoSignInPage.getTxtWelcomeMsg();
		
		boolean verifyUserName = txtWelcomeMsg.getText().contains(userName);
		
		Assert.assertTrue(verifyUserName);
		
	
	}

	@Then("I should see an error message {string} for Invalid Email field")
	public void i_should_see_an_error_message_for_invalid_email_field(String emailFieldErrMsg) {
		
		MagentoSignInPage magentoSignInPage = new MagentoSignInPage();

		WebElement txtEmailErrorMsg = magentoSignInPage.getTxtEmailErrorMsg();
		
		Assert.assertEquals(emailFieldErrMsg, txtEmailErrorMsg.getText());
	}


	@When("I leave {string} in the Password field")
	public void i_leave_in_the_password_field(String password) {
		
		MagentoSignInPage magentoSignInPage = new MagentoSignInPage();

		WebElement txtPass = magentoSignInPage.getTxtPass();
		
		elementSendKeys(txtPass, password);
	}
	
	
	@Then("I should see an error message {string} in password Field")
	public void i_should_see_an_error_message_in_password_field(String passwordErrMsg) {
		MagentoSignInPage magentoSignInPage = new MagentoSignInPage();

		WebElement txtPassErrorMsg = magentoSignInPage.getTxtPassErrorMsg();
		
		Assert.assertEquals(passwordErrMsg, txtPassErrorMsg.getText());
		
	}









	
	


}
