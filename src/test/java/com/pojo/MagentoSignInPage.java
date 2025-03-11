package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class MagentoSignInPage extends BaseClass{
	
	public MagentoSignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	private WebElement btnSignIn;
	
	@FindBy(id = "email")
	private WebElement txtEmail;
	
	@FindBy(id = "pass")
	private WebElement txtPass;
	
	@FindBy(id = "send2")
	private WebElement btnSubmitSignIn;
	
	@FindBy(xpath = "(//span[text()='Sign In']//ancestor::div[@class='actions-toolbar']//span[text()='Forgot Your Password?'])[1]")
	private WebElement btnForgotPassword;
	
	@FindBy(id = "email-error")
	private WebElement txtEmailErrorMsg;
	
	@FindBy(id = "pass-error")
	private WebElement txtPassErrorMsg;

	@FindBy(xpath = "//div[@class='panel header']//span[contains(text(), 'Welcome, ')]")
	private WebElement txtWelcomeMsg;
	
	public WebElement getTxtWelcomeMsg() {
		return txtWelcomeMsg;
	}

	public void setTxtWelcomeMsg(WebElement txtWelcomeMsg) {
		this.txtWelcomeMsg = txtWelcomeMsg;
	}

	public WebElement getBtnSignIn() {
		return btnSignIn;
	}

	public void setBtnSignIn(WebElement btnSignIn) {
		this.btnSignIn = btnSignIn;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(WebElement txtEmail) {
		this.txtEmail = txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}

	public WebElement getBtnSubmitSignIn() {
		return btnSubmitSignIn;
	}

	public void setBtnSubmitSignIn(WebElement btnSubmitSignIn) {
		this.btnSubmitSignIn = btnSubmitSignIn;
	}

	public WebElement getBtnForgotPassword() {
		return btnForgotPassword;
	}

	public void setBtnForgotPassword(WebElement btnForgotPassword) {
		this.btnForgotPassword = btnForgotPassword;
	}

	public WebElement getTxtEmailErrorMsg() {
		return txtEmailErrorMsg;
	}

	public void setTxtEmailErrorMsg(WebElement txtEmailErrorMsg) {
		this.txtEmailErrorMsg = txtEmailErrorMsg;
	}

	public WebElement getTxtPassErrorMsg() {
		return txtPassErrorMsg;
	}

	public void setTxtPassErrorMsg(WebElement txtPassErrorMsg) {
		this.txtPassErrorMsg = txtPassErrorMsg;
	}
	
	
}
