package childbrowser_popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.lenskart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sunglass",Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	//select one sunglass
	driver.findElement(By.xpath("//div[text()='Vincent Chase Polarized']")).click();
	
	//switch control from child window to main window
	Set<String> jstr = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(jstr);
	//print session id of main window
	String main = al.get(0);
	System.out.println(main);
	//move control o.f selenium from main window to child window
	driver.switchTo().window(al.get(1));
	//print session id of window 1
	String child = al.get(1);
	System.out.println(child);
	String title=driver.getTitle();
	System.out.println(title);
	
}
}
