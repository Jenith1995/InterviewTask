package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LoginPojo extends Utility {
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath ="//div//a[text()='Sign In']")
	private WebElement lnkSignIn;
	
	@FindBy(id ="j_username")
	private WebElement txtUser;
	
	@FindBy(id ="j_password")
	private WebElement txtPassword;
	
	@FindBy(id ="loginSubmit")
	private WebElement btnSignIn;
	
	
	public WebElement getLnkSignIn() {
		return lnkSignIn;
	}


	public WebElement getTxtUser() {
		return txtUser;
	}


	public WebElement getTxtPassword() {
		return txtPassword;
	}


	public WebElement getBtnSignIn() {
		return btnSignIn;
	}


	
	
	
}
