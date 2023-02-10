package pom_design;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	//call first POM class
	Loginpage l=new Loginpage(driver);
	l.enterun();
	l.enterpwd();
	l.clickloginBtn();
	//call second POM class
	HomePage h=new HomePage(driver);
	h.VerifyText();
}
}
