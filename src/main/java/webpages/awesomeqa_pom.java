package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class awesomeqa_pom {
	
	@FindBy(how=How.XPATH,using="//div[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	public WebElement myAccountLink;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Register')]")
	public WebElement registerButton;
}
