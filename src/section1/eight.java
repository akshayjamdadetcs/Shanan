package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eight {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	//maximize
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//getTitle
	String title=driver.getTitle();
	System.out.println(title);
	
	//test case execution 
	String expT="Google";
	String actT=driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test case pass");
	}
	else {
		System.out.println("Test case fail");
	}
	
	//quit
	driver.quit();
	
}
}
