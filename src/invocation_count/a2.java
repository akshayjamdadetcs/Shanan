package invocation_count;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a2 {
@Test(invocationCount=3)
public void m11() {
	Reporter.log("hello",true);
}
}
