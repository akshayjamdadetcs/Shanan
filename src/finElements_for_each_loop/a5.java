package finElements_for_each_loop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a5 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		int count=0;
		driver.get("https://vctcpune.com/");
		//use findElements method
		List<WebElement> element=driver.findElements(By.xpath("//div"));
		for(WebElement a:element){
		String akshay=a.getText();
		System.out.println(akshay);
		count++;
		}
		System.out.println(count);
		}
		}

