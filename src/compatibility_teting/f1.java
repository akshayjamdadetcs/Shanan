package compatibility_teting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class f1 {
	@Parameters("browsername")
	@Test
	public void tc1(String browsername){
	//runtime polymorphism
	WebDriver driver=null;
	//if else ladder condition
	if(browsername.equals("Chrome")){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe") ;
	driver=new ChromeDriver();
	}
	else if(browsername.equals("Firefox")){
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Akshay\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
	driver=new FirefoxDriver();
	}
	driver.get("https://www.amazon.in/");
	}
}

