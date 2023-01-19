package TestNG_Priority;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a1 {
@Test(priority =1)
public void test1() {
	Reporter.log("TC 1",true);
}
@Test(priority = -1)
public void test2() {
	Reporter.log("TC 2",true);
}
@Test(priority=0)
public void test3() {
	Reporter.log("TC 3",true);
}
}
