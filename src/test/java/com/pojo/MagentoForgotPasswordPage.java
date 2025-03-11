package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class MagentoForgotPasswordPage extends BaseClass{
	
	public MagentoForgotPasswordPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email_address")
	private WebElement txtEmailField;
	
	@FindBy(xpath = "//span[text()='Reset My Password']")
	private WebElement btnReset;

	public WebElement getTxtEmailField() {
		return txtEmailField;
	}

	public void setTxtEmailField(WebElement txtEmailField) {
		this.txtEmailField = txtEmailField;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}

	public void setBtnReset(WebElement btnReset) {
		this.btnReset = btnReset;
	}
	

}
