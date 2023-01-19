package TestNG_enabled;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a3 {
@Test(enabled=false)
public void demo1() {
	Reporter.log("1",true);
}
@Test
public void dmo2() {
	Reporter.log("2",true);
}
}
