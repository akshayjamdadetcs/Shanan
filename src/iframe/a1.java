package iframe;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	//give implicitly wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//maximize size of browsers
	driver.manage().window().maximize();
	//bydefault selenium control is on main webpage so we need to switch it.
	//switch to frame1
	driver.switchTo().frame("packageListFrame");
	//for our confirmation take any element on first frame and print it
	String pack = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	System.out.println(pack);
	/////////////////////////////////////////////////////////////////////////////////////////
	//switch from fram1 to main webpage
	driver.switchTo().defaultContent();
	//jump from webpage to frame2
	driver.switchTo().frame("packageFrame");
	//for our confirmation take any element on second webpage and print it
	String deal = driver.findElement(By.xpath("//a[text()='By']")).getText();
	System.out.println(deal);
	/////////////////////////////////////////////////////////////////////////////////////////
	//switch from frame2 to main webpage
	driver.switchTo().defaultContent();
	//jump from webpage to frame3
	driver.switchTo().frame("classFrame");
	//for our confirmations take any element on third webpage and print it
	String team = driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-summary.html']")).getText();
	System.out.println(team);
	
	
	
	}
}
