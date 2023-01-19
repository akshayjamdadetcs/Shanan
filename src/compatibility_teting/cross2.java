package compatibility_teting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross2 {
	@Parameters("browsername")
	@Test
	public void TC(String browsername) {
		WebDriver driver=null;
		if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	else if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akshay\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		 driver=new FirefoxDriver();
	}
	driver.get("https://www.google.com");
}
}