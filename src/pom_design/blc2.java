package pom_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class blc2 {
	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	 
	public blc2(WebDriver driver){
	PageFactory.initElements(driver,this);
	}
	public void VerifyText(){
	String expText="Enter Time-Track";
	String actText=text.getText();
	if(actText.equals(expText)){
	System.out.println("TC Pass");
	}
	else{
	System.out.println("TC fai");
	}
}
}
