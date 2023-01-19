package pom_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void VerifyText() {
	String expText="Enter Time-Track";
	String actText=text.getText();
	if(actText.equals(expText)) {
		System.out.println("TC pass");
	}
	else {
		System.out.println("TC Fail");
	}
	
}
}
