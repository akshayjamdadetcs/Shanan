package invocation_count;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a3 {
@Test(invocationCount=9)
public void testCase() {
	Reporter.log("hello",true);
}
}
