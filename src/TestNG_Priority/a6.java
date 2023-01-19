package TestNG_Priority;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a6 {
@Test
public void call1() {
	Reporter.log("1",true);
}
@Test(priority = 1)
public void call2() {
	Reporter.log("2",true);
}
@Test(priority = 2)
public void call3() {
	Reporter.log("3",true);
}
}
