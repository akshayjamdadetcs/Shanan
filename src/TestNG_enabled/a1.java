package TestNG_enabled;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a1 {
@Test
public void test() {
	Reporter.log("TC1",true);
}
@Test(enabled = false)
public void test1() {
	Reporter.log("TC2",true);
}
}
