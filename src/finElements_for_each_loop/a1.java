package finElements_for_each_loop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
private static WebElement[] elements;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	int count=0;
	driver.get("https://www.amazon.in/");
	 List<WebElement> akshay = driver.findElements(By.xpath("//div"));
    
	for(WebElement i :akshay) {
		 String str = i.getText();
		 System.out.println(str);
		 count++;
	 }
	 System.out.println(count);
	
}
}
