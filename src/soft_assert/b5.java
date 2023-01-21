package soft_assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class b5 {
@Test
public void tc() {
	Reporter.log("hi",true);

	SoftAssert s=new SoftAssert();
	s.fail();
	System.out.println("hello");
	s.assertAll();
}
}
