package locators$xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//username
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	//passward
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
	//click
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
