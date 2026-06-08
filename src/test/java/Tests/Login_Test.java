package Tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.Login_Page;
import Utilities.SauceListener;

@Listeners(SauceListener.class)
public class Login_Test extends BaseClass {
	@Test
public void test() {
	Login_Page page = new Login_Page(driver);
	page.setusername("standard_user");
	page.setpassword("secret_sauce");
	page.loginclick();
	Assert.assertEquals(driver.getTitle(), "vijay");
}
}
