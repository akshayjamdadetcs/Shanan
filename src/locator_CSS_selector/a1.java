package locator_CSS_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//maximize
	driver.manage().window().maximize();
	Thread.sleep(1000);
	//cancel
	driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(1000);
	//search for product
	driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("santoor soap");
	Thread.sleep(1000);
	
	//click
	driver.findElement(By.cssSelector("path[class='_34RNph']")).click();
}
}
