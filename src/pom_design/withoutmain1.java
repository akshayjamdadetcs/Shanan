package pom_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class withoutmain1 {
	//take variable as a private
	@FindBy(xpath="//input[@name='username']")private WebElement un;
	@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
	@FindBy(xpath="//div[text()='Login ']")private WebElement loginBtn;
	//take constructor as a public

	public withoutmain1(WebDriver driver){
	PageFactory.initElements(driver,this);
	}
	//take method as a public
	public void Enterun(){
	un.sendKeys("admin");
	}
	public void Enterpwd(){
	pwd.sendKeys("manager");
	}
	public void ClickloginBtn(){
	loginBtn.click();
	}
}
