package pagefactory_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home1Page {
@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
public Home1Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public String VerifyText() {
	String actText=text.getText();
	return actText;
}
}
