package com.step;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pojo.MagentoCreateAccountPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC01_MagentoCreateAccountPageStep extends BaseClass {


	@Given("I am on the homepage")
	public void i_am_on_the_homepage() throws Exception {
		launchBrowser("Chrome");
		launchUrl(getPropertyValue("url"));
	}

	@When("I click on Create an Account")
	public void i_click_on_create_an_account() {
		MagentoCreateAccountPage accountPage = new MagentoCreateAccountPage();
		WebElement btnCreateAnAccount = accountPage.getBtnCreateAnAccount();
		elementClick(btnCreateAnAccount);

	}


	@Then("I should be redirected to the {string} page")
	public void i_should_be_redirected_to_the_page(String expTitle) {
		String actualTitle = getTitle();
		Assert.assertEquals(expTitle, actualTitle);
	}

	@Then("I should see all the fields")
	public void i_should_see_all_the_fields() {

		MagentoCreateAccountPage accountPage = new MagentoCreateAccountPage();

		boolean txtFirstNameField = isDisplayed(accountPage.getTxtFirstName());

		Assert.assertTrue(txtFirstNameField);

		boolean txtLastNameField = isDisplayed(accountPage.getTxtLastName());

		Assert.assertTrue(txtLastNameField);

		boolean txtEmailField = isDisplayed(accountPage.getTxtEmailAddress());

		Assert.assertTrue(txtEmailField);

		boolean txtPasswordField = isDisplayed(accountPage.getTxtPassword());

		Assert.assertTrue(txtPasswordField);

		boolean txtCPasswordField = isDisplayed(accountPage.getTxtCPassword());

		Assert.assertTrue(txtCPasswordField);

		boolean btnSubmitCreateAcc = isDisplayed(accountPage.getBtnSubmitCreateAccount());

		Assert.assertTrue(btnSubmitCreateAcc);
	}

	@Given("I am on the {string} page")
	public void i_am_on_the_page(String expTitle) {
		String actualTitle = getTitle();

		Assert.assertEquals(expTitle, actualTitle);

	}

	@When("I enter {string} in the First Name field")
	public void i_enter_in_the_first_name_field(String fName) {
		MagentoCreateAccountPage createAccountPage = new MagentoCreateAccountPage();

		WebElement txtFirstName = createAccountPage.getTxtFirstName();
		elementSendKeys(txtFirstName, fName);

	}

	@When("I enter {string} in the Last Name field")
	public void i_enter_in_the_last_name_field(String lName) {
		MagentoCreateAccountPage createAccountPage = new MagentoCreateAccountPage();

		WebElement txtLastName = createAccountPage.getTxtLastName();
		elementSendKeys(txtLastName, lName);

	}

	@When("I enter {string} in the Email field")
	public void i_enter_in_the_email_field(String emailId) {
		MagentoCreateAccountPage createAccountPage = new MagentoCreateAccountPage();

		WebElement txtEmailAddress = createAccountPage.getTxtEmailAddress();
		elementSendKeys(txtEmailAddress, emailId);

	}

	@When("I enter {string} in the Password field")
	public void i_enter_in_the_password_field(String password) {
		MagentoCreateAccountPage createAccountPage = new MagentoCreateAccountPage();

		WebElement txtPassword = createAccountPage.getTxtPassword();
		elementSendKeys(txtPassword, password);

	}

	@When("I enter {string} in the Confirm Password field")
	public void i_enter_in_the_confirm_password_field(String cPassword) {
		MagentoCreateAccountPage createAccountPage = new MagentoCreateAccountPage();

		WebElement txtCPassword = createAccountPage.getTxtCPassword();
		elementSendKeys(txtCPassword, cPassword);
	}

	@When("I click on the Submit Sign In button")
	public void i_click_on_the_submit_sign_in_button() {
		MagentoCreateAccountPage createAccountPage = new MagentoCreateAccountPage();

		WebElement btnSubmitCreateAccount = createAccountPage.getBtnSubmitCreateAccount();
		elementClick(btnSubmitCreateAccount);

	}

	
	@Then("I should get the Error Message {string}")
	public void i_should_get_the_error_message(String errorMsg) {

		MagentoCreateAccountPage createAccountPage = new MagentoCreateAccountPage();

		String txtErrorMessage = createAccountPage.getTxtErrorMessage().getText();
		
		
		Assert.assertEquals(errorMsg, txtErrorMessage);
	}




	@Then("I should see an error message {string} for password do not match")
	public void i_should_see_an_error_message_for_password_do_not_match(String errorPasswordMsg) {
		MagentoCreateAccountPage createAccountPage = new MagentoCreateAccountPage();

		WebElement txtConfimationPasswordError = createAccountPage.getTxtConfimationPasswordError();
		Assert.assertEquals(errorPasswordMsg, txtConfimationPasswordError.getText());
	}


	@Then("I should see an error message {string} for invalid Email")
	public void i_should_see_an_error_message_for_invalid_email(String invalidMailFormatMsg) {
		MagentoCreateAccountPage createAccountPage = new MagentoCreateAccountPage();

		WebElement txtConfimationEmailFormatError = createAccountPage.getTxtConfimationEmailFormatError();
		Assert.assertEquals(invalidMailFormatMsg, txtConfimationEmailFormatError.getText());
	}
	

	@When("I leave {string} in the First Name field")
	public void i_leave_in_the_first_name_field(String fName) {
		MagentoCreateAccountPage createAccountPage = new MagentoCreateAccountPage();

		WebElement txtFirstName = createAccountPage.getTxtFirstName();
		elementSendKeys(txtFirstName, fName);
		
	}
	@Then("I should see an error message {string} for missing field")
	public void i_should_see_an_error_message_for_missing_field(String requiredFieldErrMsg) {
		MagentoCreateAccountPage createAccountPage = new MagentoCreateAccountPage();

		WebElement txtRequiredFieldErrorMsg = createAccountPage.getTxtRequiredFieldErrorMsg();
		Assert.assertEquals(requiredFieldErrMsg, txtRequiredFieldErrorMsg.getText());
	}
	

	@Then("I should see an error message {string} for password Security criteria")
	public void i_should_see_an_error_message_for_password_security_criteria(String passwordSecurityErrMsg) {
		MagentoCreateAccountPage createAccountPage = new MagentoCreateAccountPage();

		WebElement txtSecurityPasswordError = createAccountPage.getTxtSecurityPasswordError();
		Assert.assertEquals(passwordSecurityErrMsg, txtSecurityPasswordError.getText());
	
	}











}
