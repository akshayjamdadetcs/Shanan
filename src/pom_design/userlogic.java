package pom_design;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class userlogic {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait((10),TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/logout.do");
		driver.manage().window().maximize();
		//call first pom class
		akshay a=new akshay(driver);
		a.Enterun();
		a.Enterpwd();
		a.ClickLoginBtn();
		//call second pom class
		jamdade j=new jamdade(driver);
		j.VerifyText();
		}

}
