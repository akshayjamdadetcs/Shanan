package invocation_count;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a4 {
@Test(invocationCount=4)
public void page1() {
	Reporter.log("Execute Test Case",true);
}
}
