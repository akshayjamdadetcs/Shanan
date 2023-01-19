package finElements_for_each_loop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a9 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		int count=0;
		driver.get("https://www.flipkart.com/");
		//use findElements method
		List<WebElement> elements=driver.findElements(By.xpath("//div"));
		for (WebElement a:elements){
		String abc=a.getText();
		System.out.println(abc);
		count++;
		}
		System.out.println(count);
		}

}
