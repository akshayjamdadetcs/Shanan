package pagefactory_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1Page {
@FindBy(xpath="//input[@id='username']")private WebElement un;
@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
@FindBy(xpath="//div[text()='Login ']")private WebElement loginBtn;

public Login1Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void Enterun(String username) {
	un.sendKeys(username);
}
public void Enterpwd(String passward) {
	pwd.sendKeys(passward);
}
public void ClickloginBtn() {
	loginBtn.click();
}
}
	

