package TestNG_Priority;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a2 {
@Test(priority=2)
public void call() {
	Reporter.log("tc1",true);
}
@Test(priority=1)
public void call1() {
	Reporter.log("tc2",true);
}
}
