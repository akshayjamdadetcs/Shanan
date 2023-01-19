package childbrowser_popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("headphones",Keys.ENTER);
	//click on boat basshead 100
	driver.findElement(By.xpath("//span[text()='boAt Bassheads 100 in Ear Wired Earphones with Mic(Furious Red)']")).click();
	
	//switch control of webpage from child window to main window
	Set<String> dog = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(dog);
	
	//now control of webpage is on main window
	//print sesssion id of main webpage
	String main = al.get(0);
	System.out.println(main);
	//switch control of webpage from main window to child window
	driver.switchTo().window(al.get(1));
	//print session id
	String a = al.get(1);
	System.out.println(a);
	
	String title=driver.getTitle();
	System.out.println( title);
	
	
}
}
