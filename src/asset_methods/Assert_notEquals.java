package asset_methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_notEquals {
@Test
public void m1() {
	Reporter.log("running m1",true);
	String expT="hi";
	String actT="hello";
	Assert.assertNotEquals(expT, actT);
}
}
