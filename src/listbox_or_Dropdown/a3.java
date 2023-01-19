package listbox_or_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a3 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	//signup
	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	//first name
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Akshay");
	//last name
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jamdade");
	Thread.sleep(2000);
	//mobile no/email id
	driver.findElement(By.id("u_0_g_xc")).sendKeys("8805580955");
	Thread.sleep(2000);
	//new passward
	driver.findElement(By.id("password_step_input")).sendKeys("8805580955");
	Thread.sleep(2000);
	//dropdown date
	WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
	Select s=new Select(date);
	s.selectByValue("18");
	//dropdown2 month
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	Select a=new Select(month);
	a.selectByValue("7");
	//year
	WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	Select b=new Select(year);
	b.selectByValue("1994");
	
	
	//signup
	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	//
}
}
