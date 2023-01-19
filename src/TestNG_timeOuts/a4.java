package TestNG_timeOuts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a4 {
@Test
public void call1() {
	Reporter.log("1",true);
}
@Test(timeOut=120000)
public void call2() {
	Reporter.log("2",true);
}
}
