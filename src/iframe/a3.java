package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//basically selenium control is on main webpage 
	//move control of selenium from main webpage to frame1
	driver.switchTo().frame("packageListFrame");
	//for our confirmations take element from frame1 and print it
	String akshay = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chromium']")).getText();
	System.out.println(akshay);
	
	
	//now move to selenium control from frame 1 to main webpage
	driver.switchTo().defaultContent();
	//move selenium control from main webpage to frame 2
	driver.switchTo().frame("packageFrame");
	//for our confirmation take any element from frame2  and print it
	String jamdade = driver.findElement(By.xpath("//a[text()='By.ByXPath']")).getText();
	System.out.println(jamdade);
	
	
	//move selenium control from frame 2 to main webpage
	driver.switchTo().defaultContent();
	//move selenium control from main webpage to frame 3
	driver.switchTo().frame("classFrame");
	//for our confirmation take any element from frame 3 and print it.
	String demo = driver.findElement(By.xpath("//th[text()='Package']")).getText();
	System.out.println(demo);
	



	
}
}
