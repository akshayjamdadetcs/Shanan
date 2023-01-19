package listbox_or_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a1 {
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login/");
//click on create new account button
driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
Thread.sleep(2000);
//click on day dropdown
WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select s=new Select(day);
//use select class method
Thread.sleep(2000);
s.selectByVisibleText("18");
Thread.sleep(4000);
//select month
WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
Thread.sleep(4000);
Select a=new Select(month);
a.selectByVisibleText("Jul");
//select year listbox
WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
//create object of select class
Select b=new Select(year);
//use select class method
b.selectByVisibleText("1994");
Thread.sleep(4000);
//select radio button male
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='u_0_5_oe']")).click();

}
}