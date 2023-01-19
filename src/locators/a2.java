package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//enter username
	driver.findElement(By.id("username")).sendKeys("admin");
	
	
	//click on login button
	driver.findElement(By.xpath("//div[text()='Logi'}")).click();
	//expected title
	String expT="actiTIME-EnterTime-Track";
	String actT=driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("tc pass");
	}
	else {
		System.out.println("tc fail");
	}
	
}
}
