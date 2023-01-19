package locators$xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a10 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
	//username
	driver.findElement(By.id("usernameField")).sendKeys("akshayjamdade94@gmail.com");
	//passward
	driver.findElement(By.id("passwordField")).sendKeys("8805580955");
	//click
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//logout
	driver.findElement(By.id("ni-gnb-header-section-top")).click();
	driver.findElement(By.xpath("//a[@title='Logout']")).click();
}
}
