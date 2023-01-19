package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a6 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.search.yahoo.com/?fr2=inr");
	driver.findElement(By.id("yschsp")).sendKeys("hello guys");
	driver.manage().window().maximize();
	//click
	driver.findElement(By.xpath( "//button[@class='sbb']")).click();
}
}
