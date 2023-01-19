package dependsonmethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a1 {
@Test
public void login() {
	Reporter.log("Running login",true);
}
@Test(dependsOnMethods = {"login"})
public void logout() {
	Reporter.log("Running logout",true);
}
}
