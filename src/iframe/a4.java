package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a4 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		//maximize
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//bydefault selenium control is on main webpage
		//move control of selenium from main webpage to frame1
		driver.switchTo().frame("packageListFrame");
		//for our confirmation take any element from frame1 and print it
		String akshay = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
		System.out.println(akshay);

		//now move control from  frame 1 to main webpage
		driver.switchTo().defaultContent();
		//move control from main webpage to frame2
		driver.switchTo().frame("packageFrame");
		//for our confirmaton take any element from frame 2 and print it
		String jamdade=driver.findElement(By.xpath("//a[text()='AbstractFindByBuilder']")).getText();
		System.out.println(jamdade);

		//now selenium control is on page 2 so move selenium control from frame 2 to main webpage
		driver.switchTo().defaultContent();
		//move selenium control from  main webpage to frame 3
		driver.switchTo().frame("classFrame");
		//now selenium control is on frame 3 but for our confirmaton take any element from frame 3 and print it
		String gourav=driver.findElement(By.xpath("//label[text()='SEARCH:']")).getText();
		System.out.println(gourav);
}
}
