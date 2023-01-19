package TestNG_Priority;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a5 {
@Test(priority=2)
public void testcase1() {
	Reporter.log("TC1",true);
}
@Test(priority=1)
public void testcase2() {
	Reporter.log("TC2",true);
}
@Test
public void akshay() {
	Reporter.log("TC3",true);
}
}
