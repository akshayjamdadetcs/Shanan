package Keys;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class k12 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
	Thread.sleep(3000);
	/*JavascriptExecutor exe= (JavascriptExecutor)driver;
	exe.executeScript("window.scrollBy(0,6000);");*/

	
	WebElement seeall=driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
	Select s=new Select(seeall);
	s.selectByVisibleText("//div[text()='Books']");
	WebElement books=driver.findElement(By.xpath("//div[text()='Books']"));
	Select a=new Select(books);
	a.selectByValue("//a[@href='/gp/browse.html?node=1318073031&ref_=nav_em_sbc_books_children_0_2_17_6']");
	
}
}
