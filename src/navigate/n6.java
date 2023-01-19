package navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class n6 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://in.yahoo.com/");
	Thread.sleep(50);
	driver.navigate().to("https://twitter.com/login");
	Thread.sleep(50);
	//back
	driver.navigate().back();
	Thread.sleep(50);
	driver.navigate().forward();
	//refresh
	driver.navigate().refresh();
	//quit
	driver.quit();
}
}
