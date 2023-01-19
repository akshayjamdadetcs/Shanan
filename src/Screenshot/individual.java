package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class individual {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement abc = driver.findElement(By.xpath("//a[@href='/ref=nav_logo']"));
	File src = abc.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Akshay\\Desktop\\screenshoot\\amazonlogo.png");
	Files.copy(src, dest);
}
}
