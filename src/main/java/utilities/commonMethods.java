package utilities;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;





public class commonMethods {

	
	
	public static String timeStamp = null;
	public Properties prop;
	public WebDriverWait wait=null;	
	protected static WebDriver driver=null;	
	
	
	@BeforeClass(alwaysRun=true)
	@Parameters({ "browser", "app" })
	public void setUp(String name, String url) {

		selectBrowser(name);
		initApplication(url);
	}
	
	public void selectBrowser(String name) {

		switch (name) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","./drivers_folder/chromedriver.exe");
			driver =new ChromeDriver();
			break;
		case "firefox":
			/*
			 * System.setProperty(Constants.firefoxKey, Constants.fireFoxExe); driver = new
			 * GeckoDriverInfo();
			 */
			break;
		case "ie":
			/*
			 * System.setProperty(Constants.IEKey, Constants.IEExe); driver = new
			 * IEDriverINFo();
			 */
			
			break;
		default:
			Assert.fail("Please pass the  valid browser name");
			break;
		}
	}

	public void initApplication(String url) {
		switch (url) {
		case "awesomeqa":
				driver.get("https://awesomeqa.com/ui/");
				break;
		case "guru":
			driver.get("https://www.demo.guru99.com/v4");
			break;
		case "amazon":
			driver.get("https://www.amazon.in/");
			break;
		case "DMVI":
			driver.get("https://dmvi-staging.demo.secomind.ai/login?next=/");
			break;
		case "facebook":
			driver.get("https://www.facebook.com/r.php");
			break;
		case "OrangeHRM":
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			break;
		case "OpenMRS":
			driver.get("https://demo.openmrs.org/openmrs/login.htm");
			break;
		case "openCart":
			driver.get("https://www.opencart.com/index.php?route=account/login");
			break;
		case "MRS":
			driver.get("https://demo.openmrs.org/openmrs/login.htm");
			break;
		default:
			Assert.fail("Please select valid Application");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void input(WebElement ele, String data, String fieldName) {
		try {
			//System.out.print("1");
			if (ele.isDisplayed()) {
				ele.clear();
				ele.sendKeys(data);
				
			}
		} catch (Exception e) {
			
			Assert.fail("Element is Not Displayed at this point of time " + e.getMessage());
		}
	}
	
	//genericMethods.click(amazonLoginPage.btnContinue,btnContinue);
		public void click(WebElement ele, String fieldname) {

			try {
				if (ele.isDisplayed() || ele.isEnabled()) {

					ele.click();
				
				}
			} catch (Exception e) {
				// logger.log(Status.FAIL, "Element is Not Displaye at this point of time");
				Assert.fail("Element is Not Displaye at this point of time " + e.getMessage());
			}
		}
	 // radio buttons,checkboxes,dropdownlist
		public void selectVisibleText(WebElement ele, String data, String fieldName) {
			try {
				if (ele.isDisplayed()) {
					new Select(ele).selectByVisibleText(data);
					
				}

			} catch (Exception e) {
				// logger.log(Status.FAIL, "Unable to Select Value at this point of time");
				Assert.fail("Unable to Select Value at this point of time " + e.getMessage());
			}
		}

		public void selectByIndex(WebElement ele, int data, String fieldName) {
			try {
				if (ele.isDisplayed()) {
					new Select(ele).selectByIndex(data);
					
				}

			} catch (Exception e) {
				// logger.log(Status.FAIL, "Unable to Select Value at this point of time");
				Assert.fail("Unable to Select Value at this point of time " + e.getMessage());
			}
		}
		
		public void selectByValue(WebElement ele, String data, String fieldName) {
			try {
				if (ele.isDisplayed()) {
					new Select(ele).selectByValue(data);
					
				}

			} catch (Exception e) {
				// logger.log(Status.FAIL, "Unable to Select Value at this point of time");
				Assert.fail("Unable to Select Value at this point of time " + e.getMessage());
			}
		}
		public void click1(WebElement signUpBtn, String fieldname) {
			// TODO Auto-generated method stub
			
		}
  

}
