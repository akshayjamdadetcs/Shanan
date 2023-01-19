package dependsonmethod;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class a3 {
@Test
public void login() {
	Reporter.log("Running login",true);
	Assert.fail();
}
@Test(dependsOnMethods= {"login"})
public void logout() {
	Reporter.log("Running logout",true);
}
}
