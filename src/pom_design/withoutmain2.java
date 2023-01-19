package pom_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class withoutmain2 {
	//take  variable as a private
	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	//take constructor as public

	public withoutmain2 (WebDriver driver){
	PageFactory.initElements(driver,this);
	}
	//take method as a public
	public void VerifyText(){
	String expText="Enter Time-Track";
	String actText=text.getText();
	if(actText.equals(expText)){
	System.out.println("TC pass");
	}
	else{
	System.out.println("TC fail");
	}
	}
}

