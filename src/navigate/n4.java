package navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class n4 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(500);
	driver.navigate().to("https://www.google.co.in/");
    Thread.sleep(500);
    driver.navigate().back();
    Thread.sleep(500);
    driver.navigate().forward();
    Thread.sleep(500);
    driver.navigate().refresh();
    
}
}
