package asset_methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assert_fail {
@Test
public void m1() {
	Reporter.log("m1",true);
	Assert.fail();
	System.out.println("hi i am after failing test case");
}
@Test
public void m2() {
	Reporter.log("m2",true);
}
}
