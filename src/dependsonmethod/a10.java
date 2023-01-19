package dependsonmethod;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class a10 {
@Test
public void login() {
	Reporter.log("Runing logIn",true);
	Assert.fail();
}
@Test(dependsOnMethods= {"login"})
public void logout() {
Reporter.log("Running logout",true);
}
}