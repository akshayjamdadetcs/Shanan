package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twleve {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mpsc.gov.in/");
	//maximize
	driver.manage().window().maximize();
	//get Title
	String title=driver.getTitle();
	System.out.println(title);
	
	//test data
	String expT="MPSC";
	String actT=driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("tc pass");
	}
	else {
		System.out.println("tc fail");
	}
	//delay
	Thread.sleep(3000);
	//quit
	driver.quit();
	
}
}
