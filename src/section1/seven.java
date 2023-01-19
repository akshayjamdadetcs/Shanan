package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seven {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	//maximize
	driver.manage().window().maximize();
	//getTitle
	String title=driver.getTitle();
	System.out.println(title);
	//test case
	String expT="Google";
	String actT=driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Tc pass");
	}
	else {
		System.out.println("tc fail");
	}
	driver.quit();
}
}
