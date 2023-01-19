package TestNG_timeOuts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a3 {
@Test(timeOut=120000)
public void test() {
	Reporter.log("1",true);
}
@Test
public void test1() {
	Reporter.log("2",true);
}
}
