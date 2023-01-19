package finElements_for_each_loop;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3 {
	public static void main(String[] args){
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		int count=0;
		driver.get("https://www.amazon.in/");
		//use finElements method
		List<WebElement> element=driver.findElements(By.xpath("//a"));
		 for(WebElement a:element){
		String atm=a.getText();
		System.out.println(atm);
		count ++;
		}
		System.out.println(count);
}
}
