package getCurrentUrl;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class all {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String link=driver.getCurrentUrl();
		System.out.println(link);
		String expT="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actT=driver.getTitle();
		if(actT.equals(expT)){
		System.out.println("TC pass");
		}
		else{
		System.out.println("TC fail");
		}
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.get("https://www.amazon.in/");
		

}
}
