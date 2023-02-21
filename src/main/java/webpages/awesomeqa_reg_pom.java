package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class awesomeqa_reg_pom {
	
	@FindBy(how=How.XPATH,using="//input[@id=\"input-firstname\"]")
	public WebElement firstname;
	
	
	@FindBy(how=How.XPATH,using="//input[@id=\"input-lastname\"]")
	public WebElement lastname;

	@FindBy(how=How.XPATH,using="//input[@id=\"input-email\"]")
	public WebElement email;


	@FindBy(how=How.XPATH,using="//input[@id=\"input-telephone\"]")
	public WebElement telephone;

	@FindBy(how=How.XPATH,using="//input[@id=\"input-password\"]")
	public WebElement password;

	@FindBy(how=How.XPATH,using="//input[@id=\"input-confirm_password\"]")
	public WebElement confirm_password;


	

	@FindBy(how=How.XPATH,using="//input[@name=\"agree\"]")
	public WebElement agree;

	@FindBy(how=How.XPATH,using="//input[@value=\"Continue\"]")
	public WebElement Continue;


	



}
