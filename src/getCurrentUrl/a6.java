package getCurrentUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class a6 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	//maximize
	driver.manage().window().maximize();
	//getCurrentUrl
	String link=driver.getCurrentUrl();
	System.out.println(link);
	Thread.sleep(4000);
	driver.get("https://in.yahoo.com/");
	Options opt=driver.manage();
	Window win=opt.window();
	win.maximize();
	Thread.sleep(5000);
	//quit
	driver.quit();
}
}
