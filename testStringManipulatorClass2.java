package CSE430_Lab;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testStringManipulatorClass2 {

	StringManipulatorClass2 SMC2 = new StringManipulatorClass2();
	@Test
	public void testcapitalizeWords(){
	assertEquals("Krittika",SMC2.capitalizeWords("krittika"));
	}
	@Test
	public void testremoveNonAlphabetic(){
	assertEquals("howareyou",SMC2.removeNonAlphabetic("how are you? 001 "));
	}
	@Test
	public void testcontainsSubstring(){
	assertTrue(SMC2.containsSubstring("Krittika","it" ));
	}
	@Test
	public void testMergeStrings(){
	assertEquals("Krittika",SMC2.MergeStrings("Krit","tika" ));
	}
	@Test
	public void testreverseWords(){
	assertEquals("girl good a is krittika",SMC2.reverseWords("krittika is a good girl" ));
	}
	
	
}
