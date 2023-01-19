package with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3 {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\parameterisation\\New Microsoft Office Excel Worksheet.xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.actitime.com/login.do");
	 driver.manage().window().maximize();
	//imlicitly wait
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 
	 String username=sh.getRow(0).getCell(0).getStringCellValue();
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	 
	 String passward = sh.getRow(0).getCell(1).getStringCellValue();
	 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(passward);
	 
	 //click on click button
	 driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
