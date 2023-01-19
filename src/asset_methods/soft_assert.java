package asset_methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert {
@Test
public void tc1() {
String s1="hi";
String s2="hello";
SoftAssert s=new SoftAssert();
s.assertEquals(s1, s2);
Reporter.log("i am after failing tc1",true);
s.assertAll();
}
}