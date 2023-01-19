package pom_design;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait((10),TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("https://demo.actitime.com/login.do");
	//call first pom class
	LoginPage1 a=new LoginPage1(driver);
	a.enterun();
	a.enterpwd();
	a.clickloginBtn();
	//call second pom class
	HomePage1 b=new HomePage1(driver);
	b.VerifyText();
}
}