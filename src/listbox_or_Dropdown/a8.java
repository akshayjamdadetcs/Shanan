package listbox_or_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s=new Select(day);
	s.selectByVisibleText("5");
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	Select a=new Select(month);
	a.selectByVisibleText("Aug");
	WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	Select b=new Select(year);
	b.selectByValue("2021");
}
}
