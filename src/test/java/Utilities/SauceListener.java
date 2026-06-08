 package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

import Tests.Login_Test;

public class SauceListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" Test starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Test Success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Test fail");
		Object currentClass = result.getInstance();
		WebDriver driver1=((Login_Test)currentClass).driver;
		TakesScreenshot ts = (TakesScreenshot) driver1;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("E:\\Vijay\\java_programming\\POM_Project\\Screenshot\\vijay.png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
