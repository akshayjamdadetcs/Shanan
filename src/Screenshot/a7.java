package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class a7 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");

WebElement abc =driver.findElement(By.xpath("//div[@id='nav-packard-glow-loc-icon']"));
	
	File src = abc.getScreenshotAs(OutputType.FILE);
	File f=new File("C:\\Users\\Akshay\\Desktop\\screenshoot\\amazone.png");
	Files.copy(src, f);
	
}
}
