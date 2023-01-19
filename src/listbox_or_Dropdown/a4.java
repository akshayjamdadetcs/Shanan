package listbox_or_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a4 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	Thread.sleep(2000);
	//year dropdown
	WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
	Select s=new Select(year);
	s.selectByValue("1994");
	Thread.sleep(2000);
	//month
	WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
	Select a=new Select(month);
	a.selectByVisibleText("Jul");
	//day
	WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select b=new Select(date);
	b.selectByVisibleText("18");
	//passward
	driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("8805580955");
	Thread.sleep(2000);
	//emailid
	driver.findElement(By.xpath("//input[@id='u_0_g_DX']")).sendKeys("akshayjamdade94@gmail.com");
	//lastname
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jamdade");
		//first name
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akshay");
}
}
