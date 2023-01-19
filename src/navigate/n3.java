package navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class n3 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.co.in/");
	Thread.sleep(50);
	driver.navigate().to("https://in.yahoo.com/");
	//back
	driver.navigate().back();
	Thread.sleep(50);
	//forward
	driver.navigate().forward();
	//refresh
	driver.navigate().refresh();
	//quit
	driver.close();
	
}
}
