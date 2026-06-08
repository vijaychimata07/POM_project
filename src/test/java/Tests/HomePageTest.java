package Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;
import Utilities.GeneralUtilities;

public class HomePageTest extends BaseClass{
	@Test
public void tc_001() throws Throwable {
	driver.get("https://www.google.com");
	HomePage hp=new HomePage(driver);
	WebElement googleS = hp.searchbox();
	googleS.sendKeys("vijay");
	GeneralUtilities gu=new GeneralUtilities(driver);
	gu.screenshot("vijay");
}
}
