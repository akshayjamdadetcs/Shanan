package pagefactory_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	Sheet sh;
	Login1Page l;
	Home1Page h;
	
	@BeforeClass
	public void OpenBrowser() throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Akshay\\Desktop\\parameterisation\\testng.xlsx");
		 sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		// all object create
	     l=new Login1Page(driver);
		 h=new Home1Page(driver);
	}
	
	@BeforeMethod
	public void LoginApp() {
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		l.Enterun(username);
		
		String passward=sh.getRow(0).getCell(1).getStringCellValue();
		l.Enterpwd(passward);
		l.ClickloginBtn();
	}
	@Test
	public void VerifyText() {
		Reporter.log("running VerifyText",true);
		String expText=sh.getRow(0).getCell(2).getStringCellValue();
		String actText=h.VerifyText();
		Assert.assertEquals(expText, actText);
	}
	@AfterMethod
	public void LogOutApp() {
		Reporter.log("logout from application",true);
	}
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("Close browser",true);
	}
}
