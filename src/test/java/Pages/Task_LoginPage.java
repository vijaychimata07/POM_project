package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Task_LoginPage{
	WebDriver driver;
	public Task_LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")private WebElement user;
	@FindBy(id="password")private WebElement pwd;
	@FindBy(id="submit")private WebElement button;
	
	public void entername(String username) {
		user.clear();
		user.sendKeys(username);
	}
	public void enterpassword(String password) {
		pwd.clear();
		pwd.sendKeys(password);
	}
	public void submitbutton() {
		button.click();
	}
}