package aaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver akshay=new ChromeDriver();
	akshay.get("https://web.whatsapp.com/");
}
}
