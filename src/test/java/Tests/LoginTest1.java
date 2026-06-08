package Tests;

import org.testng.annotations.Test;

import Base.BaseClass1;
import Pages.LoginPage1;

public class LoginTest1 extends BaseClass1{
	@Test
public void test() {
	LoginPage1 lp = new LoginPage1(driver);
	lp.enterPassword("student");
	lp.enterPassword("Password123");
	lp.clickSubmit();
}
}
