package childbrowser_popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//search any mobile
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles under 10000",Keys.ENTER);
	//click on first phone
	driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
    //switch the control
	Set<String> allwindows = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(allwindows);
	//print main window id
    String mainid = al.get(0);
    System.out.println(mainid);
    //switch to child window
    driver.switchTo().window(al.get(1));
    //print session id
    String cwind=al.get(1);
    System.out.println(cwind);
    String title=driver.getTitle();
    System.out.println(title);


}
}
