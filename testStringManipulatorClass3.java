package CSE430_Lab;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testStringManipulatorClass3 {

	StringManipulatorClass3 SMC3 = new StringManipulatorClass3();
	@Test
	public void testisPalindrome(){
	assertTrue(SMC3.isPalindrome("itti"));
	}
	@Test
	public void removeExtraSpaces(){
	assertEquals("itti",SMC3.removeExtraSpaces("itti         "));
	}
}