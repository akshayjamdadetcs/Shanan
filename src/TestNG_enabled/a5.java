package TestNG_enabled;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a5 {
@Test
public void case1() {
	Reporter.log("1",true);
}
@Test(enabled=false)
public void case2() {
	Reporter.log("2",true);
}
}
