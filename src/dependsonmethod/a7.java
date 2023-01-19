package dependsonmethod;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class a7 {
@Test
public void login() {
	Reporter.log("Runnig login",true);
	Assert.fail();
}
@Test
public void login1() {
	Reporter.log("Running login1",true);
	
}
@Test
public void login2() {
	Reporter.log("Running login2",true);
}
@Test(dependsOnMethods= {"login","login1","login2"})
public void logout() {
	Reporter.log("Runnig logout",true);
}
}
