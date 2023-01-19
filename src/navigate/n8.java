package navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class n8 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://in.yahoo.com/");
	Thread.sleep(100);
	driver.navigate().to("https://www.facebook.com/login/");
	driver.navigate().back();
	Thread.sleep(100);
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
}
}
