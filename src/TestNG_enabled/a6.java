package TestNG_enabled;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a6 {
@Test
public void record1() {
	Reporter.log("1",true);
}
@Test
public void record2() {
	Reporter.log("2",true);
}
@Test(enabled=false)
public void record3() {
	Reporter.log("3",true);
}
}
