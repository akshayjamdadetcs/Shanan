package navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class n1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//navigate
	driver.navigate().to("https://www.google.co.in/");
	Thread.sleep(4000);
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(4000);
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	Thread.sleep(4000);
	driver.navigate().refresh();

	driver.quit();
}
}
