package asset_methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class asser_true {
@Test
public void t1() {
	Reporter.log("running t1",true);
	Boolean actResult=true;
	Assert.assertTrue(actResult);
}
}
