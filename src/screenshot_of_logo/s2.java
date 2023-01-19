package screenshot_of_logo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class s2 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?login");
		WebElement  logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		File src=logo.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Akshay\\Desktop\\screen\\facebook.jpg");
		Files.copy(src,f);
		driver.close();

}
}