package dependsonmethod;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class a9 {
@Test
public void login1() {
	Reporter.log("Running login1",true);
	Assert.fail();
}
@Test(dependsOnMethods = {"login1"})
public void login2() {
	Reporter.log("Running login2",true);
}
@Test(dependsOnMethods = {"login2"})
public void logout() {
	Reporter.log("Running logout",true);
}
}
