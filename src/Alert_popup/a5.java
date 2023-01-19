package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class a5 {
public static void main(String[] args) throws Throwable {
	//ALERT POPUP
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345",Keys.ENTER);
	Alert act=driver.switchTo().alert();
	Thread.sleep(3000);
	/*act.accept();
	act.accept();*/
	Thread.sleep(3000);
	String go=act.getText();
	System.out.println(go);
	act.dismiss();
}
}
