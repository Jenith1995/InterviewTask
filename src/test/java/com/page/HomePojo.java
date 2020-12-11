package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class HomePojo extends Utility{
	
	public HomePojo(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[contains(@href,'#navigation')]")
	private WebElement navList;
	
	@FindBy(xpath ="//a[contains(@href,'#navigation')]")
	private WebElement navSalesTools ;
	
	@FindBy(xpath ="//a[text()='Build a Proposal']")
	private WebElement navBuildProposal ;
	
	@FindBy(xpath ="//a[text()='SELECT LEAD']")
	private WebElement btnSelectLead ;

	public WebElement getNavList() {
		return navList;
	}

	public WebElement getNavSalesTools() {
		return navSalesTools;
	}

	public WebElement getNavBuildProposal() {
		return navBuildProposal;
	}

	public WebElement getBtnSelectLead() {
		return btnSelectLead;
	}
	
	
	
	
	
	

}
