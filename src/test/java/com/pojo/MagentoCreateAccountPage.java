package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class MagentoCreateAccountPage extends BaseClass{
	
	public MagentoCreateAccountPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//div[@class='panel wrapper']//a[contains(text(),'Create an Account')]")
	private WebElement btnCreateAnAccount;
	
	@FindBy(id = "firstname")
	private WebElement txtFirstName;
	
	@FindBy(id = "lastname")
	private WebElement txtLastName;
	
	@FindBy(id = "email_address")
	private WebElement txtEmailAddress;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(id = "password-confirmation")
	private WebElement txtCPassword;
	
	@FindBy(xpath = "//button[@title='Create an Account']")
	private WebElement btnSubmitCreateAccount;
	
	@FindBy(id = "email_address-error")
	private WebElement txtConfimationEmailFormatError;
	
	@FindBy(id = "password-confirmation-error")
	private WebElement txtConfimationPasswordError;

	@FindBy(id = "firstname-error")
	private WebElement txtRequiredFieldErrorMsg;
	
	@FindBy(id = "password-error")
	private WebElement txtSecurityPasswordError;

	public WebElement getTxtErrorMessage() {
		return txtErrorMessage;
	}

	public void setTxtErrorMessage(WebElement txtErrorMessage) {
		this.txtErrorMessage = txtErrorMessage;
	}

	@FindBy(xpath = "//div[text()='There is already an account with this email address. If you are sure that it is your email address, ']")
	private WebElement txtErrorMessage;

	public WebElement getTxtConfimationPasswordError() {
		return txtConfimationPasswordError;
	}

	public void setTxtConfimationPasswordError(WebElement txtConfimationPasswordError) {
		this.txtConfimationPasswordError = txtConfimationPasswordError;
	}
	
	public WebElement getTxtConfimationEmailFormatError() {
		return txtConfimationEmailFormatError;
	}

	public void setTxtConfimationEmailFormatError(WebElement txtConfimationEmailFormatError) {
		this.txtConfimationEmailFormatError = txtConfimationEmailFormatError;
	}

	public WebElement getTxtRequiredFieldErrorMsg() {
		return txtRequiredFieldErrorMsg;
	}

	public void setTxtRequiredFieldErrorMsg(WebElement txtRequiredFieldErrorMsg) {
		this.txtRequiredFieldErrorMsg = txtRequiredFieldErrorMsg;
	}

	public WebElement getTxtSecurityPasswordError() {
		return txtSecurityPasswordError;
	}

	public void setTxtSecurityPasswordError(WebElement txtSecurityPasswordError) {
		this.txtSecurityPasswordError = txtSecurityPasswordError;
	}

	public WebElement getBtnCreateAnAccount() {
		return btnCreateAnAccount;
	}

	public void setBtnCreateAnAccount(WebElement btnCreateAnAccount) {
		this.btnCreateAnAccount = btnCreateAnAccount;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public void setTxtFirstName(WebElement txtFirstName) {
		this.txtFirstName = txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public void setTxtLastName(WebElement txtLastName) {
		this.txtLastName = txtLastName;
	}

	public WebElement getTxtEmailAddress() {
		return txtEmailAddress;
	}

	public void setTxtEmailAddress(WebElement txtEmailAddress) {
		this.txtEmailAddress = txtEmailAddress;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(WebElement txtPassword) {
		this.txtPassword = txtPassword;
	}

	public WebElement getTxtCPassword() {
		return txtCPassword;
	}

	public void setTxtCPassword(WebElement txtCPassword) {
		this.txtCPassword = txtCPassword;
	}

	public WebElement getBtnSubmitCreateAccount() {
		return btnSubmitCreateAccount;
	}

	public void setBtnSubmitCreateAccount(WebElement btnSubmitCreateAccount) {
		this.btnSubmitCreateAccount = btnSubmitCreateAccount;
	}
	
	
	
}
