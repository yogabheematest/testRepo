package ReusableMethods;

import org.openqa.selenium.By;
import org.testng.Assert;

import utilities.commonMethods;

public class ReusableMethods extends commonMethods {
	
public static void switchToAlert() {
		
		try {
			driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='mainpanel']")));
		} catch (Exception e) {
			Assert.fail("Unable to Switch the Alert "+e.getMessage());
		}
	}

}
