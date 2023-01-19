package suite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 {
@Test
public void test1() {
	Reporter.log("test case1",true);
}
@Test
public void test2() {
	Reporter.log("test case2",true);
}
@Test
public void test3() {
	Reporter.log("test case3",true);
}
}
