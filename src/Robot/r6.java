package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class r6 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Robot t=new Robot();
	t.keyPress(KeyEvent.VK_PAGE_DOWN);
	t.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	t.keyPress(KeyEvent.VK_PAGE_DOWN);
	t.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(2000);
	t.keyPress(KeyEvent.VK_PAGE_DOWN);
	t.keyRelease(KeyEvent.VK_PAGE_DOWN);
}
}
