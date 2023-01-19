package Keys;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class k1 {
public static void main(String[] akshay) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login");
	//Enter username
	driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("akshayjamdade94@gmail.com",Keys.TAB,"8805580955",Keys.ENTER);
	
}
}
