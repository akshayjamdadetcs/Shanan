package pom_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jamdade {
	//Take variable  as a private
	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	//create constructor as a public
	public jamdade(WebDriver driver){
	PageFactory.initElements(driver,this);
	}
	//Take method as a public
	public void VerifyText(){
	String expText="Enter Time-Track";
	String actText=text.getText();
	if(actText.equals(expText)){
	System.out.println("TC is Pass");
	}
	else{
	System.out.println("TC is Fail");
	}
	}
	}
