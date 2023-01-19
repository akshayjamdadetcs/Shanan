package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//bydefault selenium control is on main webpage 
	//move selenium control from main webpage to frame1
	driver.switchTo().frame("packageListFrame");
	//for our confirmation take any element from iframe 1 
	String akshay = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	System.out.println(akshay);
	/////////////////////////////////////////
	//Selenium control is now on frame 1 so move control to main webpage
	driver.switchTo().defaultContent();
	//now move selenium control to frame2
	driver.switchTo().frame("packageFrame");
	//for our confirmation take any element and print it
	String jamdade = driver.findElement(By.xpath("//span[text()='Action']")).getText();
	System.out.println(jamdade);
	////////////////////////////////////////
	//Now selenium control is on page 2
	//move control from frame 2 to main webpage
	driver.switchTo().defaultContent();
	//move selenium control from main webpage to frame3
	driver.switchTo().frame("classFrame");
	//now selenium control is on frame 3
	//for our confirmation take any element from frame 3 and print it
	String velocity = driver.findElement(By.xpath("//label[text()='SEARCH:']")).getText();
	System.out.println(velocity);
	
	
}
}
