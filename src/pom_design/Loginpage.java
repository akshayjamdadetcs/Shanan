package pom_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(xpath="//input[@id='username']")private WebElement username;
	@FindBy(xpath="//input[@name='pwd']")private WebElement passward;
	@FindBy(xpath="//div[text()='Login ']")private WebElement loginButton;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterun() {
		username.sendKeys("admin");
	}
	public void enterpwd() {
		passward.sendKeys("manager");
	}
	public void clickloginBtn() {
		loginButton.click();
	}
}

