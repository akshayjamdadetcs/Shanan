package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a5 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame("packageListFrame");
	String abc=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi.log']")).getText();
	System.out.println(abc);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	String ab=driver.findElement(By.xpath("//span[text()='ActiveSession']")).getText();
	System.out.println(ab);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
	String ak = driver.findElement(By.xpath("//label[text()='SEARCH:']")).getText();
	System.out.println(ak);
	
}
}