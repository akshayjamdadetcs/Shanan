package notification_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class n4 {

public static void main(String[] args){
System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
//we can not handle notification popup so we an avoid to come it
ChromeOptions c=new ChromeOptions();
c.addArguments("--disable-notifications");
c.addArguments("Start-maximized");
WebDriver driver=new ChromeDriver(c);
driver.get("https://www.hdfc.com/");

//hiddendivision popup is there
driver.findElement(By.xpath("//a[@class='close-popup']")).click();
}

}
