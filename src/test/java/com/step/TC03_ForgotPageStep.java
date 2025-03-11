package com.step;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pojo.MagentoForgotPasswordPage;
import com.pojo.MagentoSignInPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC03_ForgotPageStep extends BaseClass{



	@When("I click on the Forgot Password link")
	public void i_click_on_the_forgot_password_link() {
		MagentoSignInPage signInPage = new MagentoSignInPage();
		WebElement btnForgotPassword = signInPage.getBtnForgotPassword();
		elementClick(btnForgotPassword);
		
	}
	
	@Then("I should be redirected to the Forgot Password page and validate the title {string}")
	public void i_should_be_redirected_to_the_forgot_password_page_and_validate_the_title(String expTitle) {
		String actualTitle = getTitle();
		
		Assert.assertEquals(expTitle, actualTitle);
		
	}
	

	@Then("I should see all the fields in Forget Password Page")
	public void i_should_see_all_the_fields_in_forget_password_page() {
		MagentoForgotPasswordPage forgotPasswordPage = new MagentoForgotPasswordPage();
		
		
		boolean txtEmailField = isDisplayed(forgotPasswordPage.getTxtEmailField());
		
		Assert.assertTrue(txtEmailField);
		
		boolean btnReset = isDisplayed(forgotPasswordPage.getBtnReset());
		
		Assert.assertTrue(btnReset);
		
	}




	@When("I enter {string} in the Email Address field in forgot password")
	public void i_enter_in_the_email_address_field_in_forgot_password(String email) {
		
		MagentoForgotPasswordPage forgotPasswordPage = new MagentoForgotPasswordPage();
		
		WebElement txtEmailField = forgotPasswordPage.getTxtEmailField();
		
		elementSendKeys(txtEmailField, email);
		
		
	}
	
	@When("I click on the Reset My Password button")
	public void i_click_on_the_reset_my_password_button() {
		
		MagentoForgotPasswordPage forgotPasswordPage = new MagentoForgotPasswordPage();

		WebElement btnReset = forgotPasswordPage.getBtnReset();
		
		elementClick(btnReset);
		
	}
	
	@Then("I should be redirected to the Customer Login page and Validate {string}")
	public void i_should_be_redirected_to_the_customer_login_page_and_validate(String expTitle) {
		String actualTitle = getTitle();
		Assert.assertEquals(expTitle, actualTitle);
		
	}
	



}
