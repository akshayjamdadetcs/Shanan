package TestNG_enabled;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a8 {
@Test(enabled=false)
public void dog1(){
	Reporter.log("1",true);
}
@Test
public void dog2() {
Reporter.log("2",true);
}
}
