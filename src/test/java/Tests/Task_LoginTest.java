package Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.LoginBase_Task;
import Pages.Task_LoginPage;
import Utilities.Task_UtilityClass;



public class Task_LoginTest extends LoginBase_Task {
	@Test
	public void test() throws IOException {
		Task_LoginPage lp=new Task_LoginPage(driver);
		Task_UtilityClass lu = new Task_UtilityClass();
		String[][] data=lu.getExcelData();
		for(int i=0;i<data.length;i++) {
			String username=data[i][0];
			String password=data[i][1];
			String response=data[i][2];
			
			lp.entername(username);
			lp.enterpassword(password);
			lp.submitbutton();
			
			String actualResult;
			if(driver.getCurrentUrl().contains("logged-in-successfully")) {
				actualResult="valid";
			} 
			else {
				actualResult="invalid";
			}
			 if(response.equalsIgnoreCase(actualResult)) {
				 System.out.println("test passed");
			 }
			 else {
				 System.out.println("test failed");
				 Task_UtilityClass.screenshot(driver,username);
				 Assert.fail("Result mismatch");
			 }
			 if(actualResult.equals("valid")) {
				 driver.findElement(By.linkText("Log out")).click();;
			 }
			 else {
				 driver.navigate().refresh();
			 }	 
		}	
	}
}