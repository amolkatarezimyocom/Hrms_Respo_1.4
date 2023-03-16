package com.HRMS.Utilities;

import org.testng.asserts.SoftAssert;

public class AssertObject {
	
public void assertobject(String actual ,String expected) {
	SoftAssert sa = new SoftAssert();
	System.out.println(actual);
	sa.assertEquals(actual, expected);
	sa.assertAll();
	
}


}
