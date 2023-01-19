package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class five {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	//maximize
	driver.manage().window().maximize();
	//getTitle
	String title=driver.getTitle();
	System.out.println(title);
	
	//test case exeecution
	String expT="Google";
	String actT=driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("TC pass");
		
	}
	else {
		System.out.println("TC fail");
	}
	Thread.sleep(4000);
	//quit
	driver.quit();
	
}
}
