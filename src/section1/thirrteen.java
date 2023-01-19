package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thirrteen {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	//maximize
	driver.manage().window().maximize();
	//getTitle
	String title=driver.getTitle();
	System.out.println(title);
	//test data
	String expT="Google";
	String actT =driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("TC pass");
	}
	else {
		System.out.println("tc fail");
	}
	//delay
	Thread.sleep(4000);
	//quit
	driver.quit();
}
}
