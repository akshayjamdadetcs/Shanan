package sceenshot;

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

public class s1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	//String ad = RandomString.make();
	WebElement akshay = driver.findElement(By.xpath("//img[@alt='Naukri Logo']"));
	//TakesScreenshot ts=(TakesScreenshot)driver;
	File src=akshay.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Akshay\\Desktop\\screen\\n.png");
	Files.copy(src, dest);
}
}