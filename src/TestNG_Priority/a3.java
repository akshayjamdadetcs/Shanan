package TestNG_Priority;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a3 {
	@Test
	public void d3() {
		Reporter.log("tc-1",true);
	}
	@Test
	public void d1() {
		Reporter.log("tc-2",true);
	}
	@Test
	public void d2() {
		Reporter.log("tc-3",true);
	}
}
