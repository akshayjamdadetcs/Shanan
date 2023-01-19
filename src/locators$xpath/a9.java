package locators$xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a9 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login");
	//usename
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("akshayjamdade94@gmail.com");
	Thread.sleep(200);
	//passward
	driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("8805580955");
	Thread.sleep(200);
	//click
	driver.findElement(By.xpath("//button[text()='Login']")).click();
}
}
