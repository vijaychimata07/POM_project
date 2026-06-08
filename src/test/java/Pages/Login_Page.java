 package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
WebDriver driver;
public Login_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id="user-name")private WebElement user;
@FindBy(id="password")private WebElement pwd;
@FindBy(id="login-button")private WebElement btnLogin;
public void setusername(String username) {
	user.sendKeys(username);
}
public void setpassword(String password) {
	pwd.sendKeys(password);
}
public void loginclick() {
	btnLogin.click();
}
}
