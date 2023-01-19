package Test_Annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a1 {
@Test(invocationCount = 5)
public void m1() {
	Reporter.log("hi count",true);
}
@Before
}
