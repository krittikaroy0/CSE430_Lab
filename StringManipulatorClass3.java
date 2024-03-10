package CSE430_Lab;

public class StringManipulatorClass3 {
     
	 //This Function checks whether a string is palindrome or not 
	   public boolean isPalindrome(String str) {
	        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	    }
	   //This Function removes unnecessary spaces from the string
	   public String removeExtraSpaces(String str) {
	        return str.replaceAll("\\s+", " ").trim();
	    }
	   //This Function swaps the case of each characters
//	   public String swapCase(String str) {
//	        return str.chars().mapToObj(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c)).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
//	    }
//	 
	
}
