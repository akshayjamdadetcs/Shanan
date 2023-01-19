package TestNG_timeOuts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class b1 {
@Test
public void test3() {
	Reporter.log("1",true);
}
@Test
public void test2() {
	Reporter.log("2",true);
}
@Test(priority=1)
public void test() {
	Reporter.log("3",true);
}
}
