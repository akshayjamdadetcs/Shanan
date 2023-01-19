package childbrowser_popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	//Enter the value in Google search text box
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("led TV ",Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	//click on first link that is of tv 
	driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]")).click();
	//switch the control from child window to main window
	Set<String> one = driver.getWindowHandles();
	//create object of Arraylist 
	ArrayList<String > al=new ArrayList<String>(one);
	//print main window id
	String mainWindow = al.get(0);
	System.out.println(mainWindow);
	//switch to child window
	driver.switchTo().window(al.get(1));
	//print session id
	String childWindow = al.get(1);
	System.out.println(childWindow);
	//get text
	String text=driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
	System.out.println(text);
	
}
}
