package pom_design;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ulc {
	
	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	//call first pom class
	blc1 a=new blc1(driver);
	a.enterun();
	a.enterpwd();
	a.ClickLoginBtn();
	//call second pom class
	blc2 b=new blc2(driver);
	b.VerifyText();
	}

}
