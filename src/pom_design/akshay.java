package pom_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class akshay {

	@FindBy(xpath="//input[@id='username']")private WebElement un;
	@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
	@FindBy(xpath="//div[text()='Login ']")private WebElement LoginBtn;
	//create constructor as a public
	public akshay(WebDriver driver){
	PageFactory.initElements(driver,this);
	}
	//take method as a public
	public void Enterun(){
	un.sendKeys("admin");
	}
	public void Enterpwd(){
	pwd.sendKeys("manager");
	}
	public void ClickLoginBtn(){
	LoginBtn.click();
	}
}
