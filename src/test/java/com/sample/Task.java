package com.sample;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import com.page.HomePojo;
import com.page.LoginPojo;
import com.utility.Utility;

public class Task extends Utility {
	
	public static void main(String[] args) {
			
		launchDriver();
		
		launchUrl("https://www.liidaveqa.com/");
		
		implicitWait(30);
		
		maximize();
		
		LoginPojo l = new LoginPojo();
		
		click(l.getLnkSignIn());
		
	    insert(l.getTxtUser(), "lenproautomation8@lenqat.com");
	    
	    insert(l.getTxtPassword(), "Community17");
	    
	    click(l.getBtnSignIn());
	    
	    HomePojo h = new HomePojo();
	    
	    click(h.getNavList());
	    
	    click(h.getNavSalesTools());
	    
	    click(h.getNavBuildProposal());
	    
	    click(h.getBtnSelectLead());
	    
	    
		
	}
	

}
