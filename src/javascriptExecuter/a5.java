package javascriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a5 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	//use javascriptExcutor Interface
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000);");
	Thread.sleep(6000);
	jse.executeScript("window.scrollBy(0,-1000);");
}
}
