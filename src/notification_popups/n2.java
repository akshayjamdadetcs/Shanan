package notification_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class n2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions c=new ChromeOptions();
	c.addArguments("--disable-notifications");
	c.addArguments("Start-maximized");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.hdfc.com/");
}
}
