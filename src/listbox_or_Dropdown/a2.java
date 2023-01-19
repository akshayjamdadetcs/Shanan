package listbox_or_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	//signup for facebook
	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	//day select
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	Select s=new Select(day);
	s.selectByValue("18");
	//select month
	WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
	Select a=new Select(month);
	a.selectByValue("8");
	//year
	WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
	Select b=new Select(year);
	b.selectByVisibleText("1994");
	Thread.sleep(1000);
	//radio
	WebElement radio2=driver.findElement(By.xpath("//input[@id='u_0_5_zJ']"));
	radio2.click();

}
}
