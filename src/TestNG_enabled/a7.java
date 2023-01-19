package TestNG_enabled;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a7 {
@Test
public void vel1() {
	Reporter.log("1",true);
}
@Test(enabled=false)
public void vel2() {
	Reporter.log("2",true);
}
}
