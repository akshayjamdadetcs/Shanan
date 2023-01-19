package childbrowser_popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c7 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait((10),TimeUnit.SECONDS);

		//enter value inside textfield (Main window)
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles under10000",Keys.ENTER);
		//open child window
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();

		Set<String> ab=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String> (ab);


		//now get session id  of child window
		String one=al.get(0);
		System.out.println(one);
		// now move to child window 
		driver.switchTo().window(al.get(1));
		
		String two=al.get(1);
		System.out.println(two);
		String title=driver.getTitle();
		System.out.println(title);
}
}
