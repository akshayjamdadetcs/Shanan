package TestNG_timeOuts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a2 {
@Test(timeOut=60000)
public void cat() {
	Reporter.log("1",true);
}
@Test
public void mouse() {
	Reporter.log("2",true);
}
}
