package listbox_or_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a10 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");

		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(3000);
		WebElement aj=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s=new Select(aj);
		s.selectByValue("18");
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select a=new Select(month);
		a.selectByVisibleText("Jul");
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select b=new Select(year);
		b.selectByVisibleText("1994");
}
}