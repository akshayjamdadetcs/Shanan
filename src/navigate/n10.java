package navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class n10 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//navigate
	driver.navigate().to("https://www.facebook.com/login/");
	driver.navigate().to("https://www.google.co.in/");
	//delay
	Thread.sleep(3000);
	//back
	driver.navigate().back();
	//delay
		Thread.sleep(3000);
	//forward
	driver.navigate().forward();
	//delay
		Thread.sleep(3000);
	//refresh
	driver.navigate().refresh();
	
}
}
