package dependsonmethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a5 {
@Test
public void logIn() {
	Reporter.log("Running logIn",true);
}
@Test(dependsOnMethods= {"logIn"})
public void logOut() {
	Reporter.log("Running logOut",true);
}
}
