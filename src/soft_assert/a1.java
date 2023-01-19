package soft_assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a1 {
	@Test
	public void tc1(){
	Reporter.log("running tc1",true);
	//Assert.fail();
	
	SoftAssert s=new SoftAssert();
	System.out.println("i am after failing tc1");
	s.fail();
	System.out.println("HI");
	s.assertAll();
	}

}
