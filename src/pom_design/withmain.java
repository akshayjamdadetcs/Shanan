package pom_design;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withmain {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait((10),TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//call first pom class
		withoutmain1 m1=new withoutmain1(driver);
		m1.Enterun();
		m1.Enterpwd();
		m1.ClickloginBtn();
		//call second pom class
		withoutmain2 m2=new withoutmain2(driver);
		m2.VerifyText();
		}
}
