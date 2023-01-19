package testng;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class b1 {
@BeforeClass
public void openBrowser() {
	Reporter.log("open browser",true);
}
@BeforeMethod
public void loginToApp() {
	Reporter.log("Login to appication",true);
}
@Test(enabled=false)
public void VerifyText() {
	Reporter.log("running verifytext",true);
	
}

@AfterMethod
public void logOutToApp() {
	Reporter.log("Logout to application",true);
}
@BeforeMethod
public void m1() {
	Reporter.log("m1 method",true);
}
@Test
public void tc2() {
	Reporter.log("TEST CASE2",true);
}
@AfterMethod
public void m2() {
	Reporter.log("m2 method",true);
}
@AfterClass
public void CloseBrowser() {
	Reporter.log("Close the browser",true);
}
}
