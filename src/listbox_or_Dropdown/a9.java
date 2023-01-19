package listbox_or_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a9 {
	public static void main(String[] args) {
		
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.makemytrip.com/");
driver.findElement(By.xpath("//div[@class='landingContainer eng']")).click();

driver.findElement(By.xpath("//div[@class='whiteText makeFlex perfectCenter langSlct']")).click();
//driver.findElement(By.xpath("//span[text()='India']")).click();
driver.findElement(By.xpath("//p[@class='selectConInput']")).click();
driver.findElement(By.xpath("//p[text()='USA']")).click();
/*Select s=new Select(USA);
s.selectByVisibleText("//p[text()='USA']").*/
}
}