package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class HomePage extends BaseClass {
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	By searchboxlocator = By.xpath("//textarea[@name='q']");
	public WebElement searchbox() {
		WebElement element = driver.findElement(searchboxlocator);
		return element;
	}
}
 