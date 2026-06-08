package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Task {
	WebDriver driver;
	public LoginPage_Task(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")private WebElement user;
	@FindBy(id="password")private WebElement pwd;
	@FindBy(id="submit")private WebElement btnlogin;
	public void setusername(String username)
	{
		user.sendKeys(username);
	}
	public void setpassword(String password)
	{
		pwd.sendKeys(password);
	}
	public void loginClick() {
		btnlogin.click();
	}
}
