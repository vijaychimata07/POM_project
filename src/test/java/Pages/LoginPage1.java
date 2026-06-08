package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	WebDriver driver;
public LoginPage1(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy (id="username") private WebElement uname;
@FindBy (id="password") private WebElement pwd;
@FindBy (id="submit") private WebElement click;
public void enterUserName(String username)
{
	uname.sendKeys(username);
}
public void enterPassword(String password)
{
	pwd.sendKeys(password);
}
public void clickSubmit() {
	click.click();
}

}
