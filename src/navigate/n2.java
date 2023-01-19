package navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class n2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/login/");
	Thread.sleep(100);
	driver.navigate().to("https://www.google.co.in/");
	Thread.sleep(50);
	//back
	driver.navigate().back();
	//forward
	driver.navigate().forward();
	//refresh the browsers
	driver.navigate().refresh();
	driver.close();
}
}
