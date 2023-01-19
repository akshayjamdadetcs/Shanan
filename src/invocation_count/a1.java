package invocation_count;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class a1 {
@Test(invocationCount = 8)
public void TC1() {
	Reporter.log("hi",true);
}
@Test
public void TC2() {
	Reporter.log("hello",true);
	Assert.fail();
}
}
