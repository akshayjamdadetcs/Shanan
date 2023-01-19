package compatibility_teting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class akshay {
	@Parameters("browsername")
	@Test
	public void tc(String browsername){
	WebDriver driver=null;// runtime polymorphism
	//apply conditions
	if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	else if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		 driver=new FirefoxDriver();
	}
	driver.get("https://www.amazon.in/");
}
}


