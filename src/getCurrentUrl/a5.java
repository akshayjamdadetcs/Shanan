package getCurrentUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://newspaper.pudhari.co.in/index.php");
	//getCurrentTitle
	String link=driver.getCurrentUrl();
	System.out.println(link);
	driver.quit();
}
}
