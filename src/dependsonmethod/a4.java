package dependsonmethod;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class a4 {
@Test
public void login() {
	Reporter.log("Running LogIn",true);
	Assert.fail();
}
@Test(dependsOnMethods= {"login"})
public void logout() {
	Reporter.log("Running LogOut",true);
	
}
}