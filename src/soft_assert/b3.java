package soft_assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class b3 {

@Test
public void tc() {
	Reporter.log("tc failing intentially",true);
	SoftAssert s=new SoftAssert();
	s.fail();
	System.out.println("HELLO");
	s.assertAll();
}
}
