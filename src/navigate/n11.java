package navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class n11 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://demo.actitime.com/login.do");
	driver.navigate().to("https://www.amazon.in/");
	
    //back
    driver.navigate().back();
    //forward
    driver.navigate().forward();
    //refresh
    driver.navigate().refresh();


}
}
