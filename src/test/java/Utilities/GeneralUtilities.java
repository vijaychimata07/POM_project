 package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import Base.BaseClass;

public class GeneralUtilities extends BaseClass{
public GeneralUtilities(WebDriver driver) {
	this.driver=driver;
}
public void screenshot(String name) throws Throwable {
	TakesScreenshot ts= (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("E:\\Vijay\\java_programming\\POM_Project\\Screenshot\\36 "+name+".png");
	Files.copy(src, dest);
}
}
