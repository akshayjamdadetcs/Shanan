package how_Topass_fail_TC;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class a1 {
@Test
public void tc() {
	Reporter.log("hello",true);
	Assert.fail();
}
}
