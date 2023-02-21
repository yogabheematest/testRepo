package testcases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.commonMethods;

import webpages.awesomeqa_pom;

public class login_awesome extends commonMethods {
	
	@Test
	public void sign_app()
	{
		commonMethods common = new commonMethods();
		awesomeqa_pom awesompom = PageFactory.initElements(driver, awesomeqa_pom.class);
		common.click(awesompom.myAccountLink, "myaccountLink");
		
		common.click(awesompom.registerButton, "Register");
		/*
		 * Actions actions = new Actions(driver);
		 * actions.moveToElement(awesompom.myAccountLink).click();
		 */
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//common.click(amazonpom.signInButton, "signInbutton");
	}

}
