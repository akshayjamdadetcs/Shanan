package Test_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a2 {
@BeforeClass 
public void openBrowser() {
	Reporter.log("open browser",true);
}
@BeforeMethod
public void loginToApp() {
	Reporter.log("Login to Application",true);
}
@Test
public void VerifyTest() {
	Reporter.log("Running verify userId TC",true);
}
@AfterMethod
public void LogoutToApp() {
	Reporter.log("log out from App",true);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("Close the browser",true);
}

}
