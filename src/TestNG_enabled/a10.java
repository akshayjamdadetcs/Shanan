package TestNG_enabled;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a10 {
@Test
public void demo() {
	Reporter.log("A",true);
}
@Test(enabled=false)
public void demo1() {
	Reporter.log("B",true);
}
@Test
public void demo2() {
	Reporter.log("C",true);
}
}
