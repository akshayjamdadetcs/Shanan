package soft_assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class b4 {
@Test
public void tc() {
	String s1="hi";
	String s2="Hello";
	SoftAssert s=new SoftAssert();
s.assertEquals(s1, s2);
	
	System.out.println("got it");
	s.assertAll();
}
}
