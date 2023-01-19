package Robot;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class r12 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[id='twotabsearchtextbox']")).click();
	Thread.sleep(4000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_DOLLAR);
	r.keyRelease(KeyEvent.VK_DOLLAR);
	r.keyRelease(KeyEvent.VK_SHIFT);
	
	r.keyPress(KeyEvent.VK_B);
	r.keyRelease(KeyEvent.VK_B);
}
}
