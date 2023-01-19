package sceenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class t1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Akshay/eclipse-workspace/Selenium/test-output/emailable-report.html");
	driver.manage().window().maximize();
	String til = RandomString.make();
	TakesScreenshot ts=(TakesScreenshot)driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\Users\\Akshay\\Desktop\\screen\\TestNg1.jpg");
	 Files.copy(src, dest);
}
}
