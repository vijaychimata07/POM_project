package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass1 {
 public WebDriver driver;
@BeforeClass
public void setup() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
@AfterClass
public void teardown() {
//	driver.quit();
}
}
