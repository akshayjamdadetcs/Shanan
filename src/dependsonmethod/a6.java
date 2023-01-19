package dependsonmethod;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class a6 {
@Test
public void login() {
	Reporter.log("Running login",true);
}
@Test
public void login1() {
	Reporter.log("Running login1",true);
	Assert.fail();
}
@Test(dependsOnMethods= {"login","login1"})
public void logout() {
	Reporter.log("Running logout",true);
}
}
