package invocation_count;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a5 {
@Test(invocationCount=2)
public void go() {
	Reporter.log("hi team",true);
}
}
