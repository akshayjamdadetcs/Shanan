package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class a4 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement target = driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']"));
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(target).doubleClick().perform();
	Thread.sleep(2000);
	WebElement target1 = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
	Actions abd=new Actions(driver);
	abd.moveToElement(target1).contextClick().perform();
	
}
}
