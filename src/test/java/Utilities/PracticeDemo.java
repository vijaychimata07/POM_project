package Utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class PracticeDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"Test Starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"test pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+"Test failed");
		Object currentclass = result.getInstance();
	}

}
