package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	//maximize
	driver.manage().window().maximize();
	//get title
	String title=driver.getTitle();
	System.out.println(title);
	
	//test case
	String expT="Google";
	String actT=driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case pass");
	}
	else {
		System.out.println("test case fail");
	}
	
	
	//quit
	Thread.sleep(5000);
	driver.close();
	
}
}
