package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a6 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(4000);
		//to get alert popup we have to take path and enter value inside textfield
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345",Keys.ENTER);
		//now alert popup will come
		//create object of alert interface
		  Thread.sleep(5000);
		Alert alt=driver.switchTo().alert();
		//use alert method

		//alt.accept();
		 //alt.dismiss();
		String text=alt.getText();
		System.out.println(text);
		
		}
		}


