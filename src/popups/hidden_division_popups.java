package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_division_popups {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
}
}
