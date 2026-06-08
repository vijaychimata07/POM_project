package Tests;

import Base.LoginBase_Task;
import Pages.LoginPage_Task;

public class Logintest_Task extends LoginBase_Task{

	public void test() {
		LoginPage_Task page=new LoginPage_Task(driver);
		page.setusername(null);
	}
}
