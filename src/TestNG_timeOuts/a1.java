package TestNG_timeOuts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a1 {
@Test
public void cat() {
	Reporter.log("1",true);
}
@Test(timeOut = 80000)
public void cat1() {
	Reporter.log("2",true);
}
}
