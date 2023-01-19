package setsize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://twitter.com/explore");
	//maximize
	driver.manage().window().maximize();
	//setSize
	Dimension d=new Dimension(50, 100);
	driver.manage().window().setSize(d);
}
}
