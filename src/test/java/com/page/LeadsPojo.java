package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LeadsPojo extends  Utility {
	
	public LeadsPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(@href,'/proposal-tool/lead/create?source=')])[2]")
	private WebElement btnAddLead;
	
	
	

}
