package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class i4 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tatacommunications.com/");
		//maximize size of browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//create make method to avoid overriding
		String random=RandomString.make();
		//Bring screenshot method into webdriver arch..
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		//create object of file
		File dest=new File("C:\\Users\\Akshay\\Desktop\\screen\\tata.jpg");
		//store screenshot on desktop
		Files.copy(src,dest);
}
}