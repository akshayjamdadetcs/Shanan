package pom_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	@FindBy (xpath="//input[@name='username']")private WebElement un;
	@FindBy (xpath="//input[@name='pwd']")private WebElement pwd;
	@FindBy (xpath="//div[text()='Login ']")private WebElement loginBtn;

	public LoginPage1(WebDriver driver){
	PageFactory.initElements(driver,this);
	}

	public void enterun(){
	un.sendKeys("admin");
	}
	public void enterpwd(){
	pwd.sendKeys("manager");
	}
	public void clickloginBtn(){
	loginBtn.click();
	}
	}


