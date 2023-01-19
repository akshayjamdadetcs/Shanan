package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sixteeen {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	//maximize
	driver.manage().window().maximize();
	//get Title
	String title=driver.getTitle();
	System.out.println(title);
	//test data
	String expT="Amazon.com. Spend less. Smile more.";
    String actT=driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("test case pass");
	}
	else {
		System.out.println("Test case fail");
	}
	//delay
	Thread.sleep(4000);
	//quit
	driver.close();

}
}
