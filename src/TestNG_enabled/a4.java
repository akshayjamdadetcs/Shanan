package TestNG_enabled;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a4 {
@Test(enabled=false)
public void got1() {
	Reporter.log("1",true);
}
@Test(enabled=false)
public void got2() {
	Reporter.log("2",true);
}
@Test
public void got3() {
	Reporter.log("3",true);
}
}
