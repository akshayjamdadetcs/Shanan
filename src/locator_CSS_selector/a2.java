package locator_CSS_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.search.yahoo.com/?fr2=inr");
	//search
	driver.findElement(By.cssSelector("input[autocomplete='off']")).sendKeys("types of agile" );
	//enter
	driver.findElement(By.cssSelector("button[type='submit']")).click();
}
}
