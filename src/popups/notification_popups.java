package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification_popups {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");


	ChromeOptions c=new ChromeOptions();
	c.addArguments("--disable-notifications");
	c.addArguments("Start-maximized");
	//open browser
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.hdfcbank.com/");
	
}
}
