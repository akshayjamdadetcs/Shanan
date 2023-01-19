package xpath_bygroupIndex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login");
	//username
	driver.findElement(By.xpath("//input[contains(@id,'usernameField')]")).sendKeys("akshayjamdade94@gmail.com");
	//passward
	driver.findElement((By.xpath("//input[contains(@placeholder,'Enter Password')]"))).sendKeys("8805580955");
	//Login
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
}
}
