package listbox_or_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a7 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	//day dropdown
	Thread.sleep(3000);
	WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select a=new Select(day);
	a.selectByValue("18");
	//month
	Thread.sleep(3000);
	WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
	Select b=new Select(month);
	b.selectByVisibleText("Oct");
}
}
