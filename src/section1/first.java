package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://amazon.com");
	
	//maximize
	driver.manage().window().maximize();
	
	//get title
		String title=driver.getTitle();
		System.out.println(title);
		
	//test data
		String expT="Amazon.com. Spend less. Smile more.";
		String actT=driver.getTitle();
		if(expT.equals(actT)) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
	Thread.sleep(4000);
	driver.close();
	
}
}