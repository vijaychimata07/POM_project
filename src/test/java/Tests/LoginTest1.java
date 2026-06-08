package Tests;

import Base.BaseClass1;
import Pages.LoginPage1;

public class LoginTest1 extends BaseClass1{
public void test() {
	LoginPage1 lp = new LoginPage1(driver);
	lp.enterPassword("vijay");
	lp.enterPassword("1234");
	lp.clickSubmit();
}
}
