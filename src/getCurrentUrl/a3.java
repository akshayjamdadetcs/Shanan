package getCurrentUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.yahoo.com/");
	//maximize
	driver.manage().window().maximize();
	//getCurrentUrl
	String link=driver.getCurrentUrl();
	System.out.println(link);
	//delay
	Thread.sleep(3000);
	//quit
	driver.quit();
	
}
}
