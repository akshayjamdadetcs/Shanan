package soft_assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class b1 {
@Test
public void tc1() {
	String s1="hi";
	String s2="hello";
	SoftAssert s=new SoftAssert();
	s.assertEquals(s1, s2);
	System.out.println("i am after failing tc1");
	s.assertAll();
}
}
