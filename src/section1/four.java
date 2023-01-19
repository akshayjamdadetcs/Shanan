package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class four {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	//maximize
	driver.manage().window().maximize();
	
	//getTitle
	String title=driver.getTitle();
	System.out.println(title);
	
	//loop for test case execution
    String expT="Google";
    String actT=driver.getTitle();
    if(actT.equals(expT)) {
    	System.out.println("tc pass");
    }
    else {
    	System.out.println("tc fail");
    }
    
	Thread.sleep(5000);
	//close
	driver.close();
	
}
}
