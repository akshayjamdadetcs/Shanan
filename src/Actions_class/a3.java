package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class a3 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement target = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
	Actions act=new Actions(driver);
	/*act.moveToElement(target).perform();
	Thread.sleep(2000);
	act.contextClick(target).perform();
	Thread.sleep(2000);
	act.click(target).perform();*/
	act.moveToElement(target).doubleClick().perform();
	
	
	}
}
