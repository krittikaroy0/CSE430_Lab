package CSE430_Lab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testStringManipulatorClass1 {

	StringManipulatorClass1 SMC1 = new StringManipulatorClass1();
	@Test
	public void testAddPositiveIntegers(){
	assertEquals(8,SMC1.calculateStringLength("Krittika"));
	}
	
	@Test
	public void testreverseString(){
	assertEquals("akittirK",SMC1.reverseString("Krittika"));
	}
	
	@Test
	public void testtoLowerCase(){
	assertEquals("krittika",SMC1.toLowerCase("Krittika"));
	}
	@Test
	public void testcountOccurrences(){
	assertEquals(1,SMC1.countOccurrences("Krittika",'k'));
	}
	
	
}
