package coderbytejava;

/**
 * Write the function FirstReverse(string) to take the string parameter being passed 
 * and return the string in reversed order. 
 * 
 */

public class FirstReverse {

	public static void main(String[] args) {

		String input = "this is test";
		
		System.out.println("functionFirstReverse: " + functionFirstReverse(input));
	}
	
	public static String functionFirstReverse(String input) {

		StringBuilder reverse = new StringBuilder(input).reverse();
		return reverse.toString();
		
		/*
		char[] reverseC = input.toCharArray();
		String reverse = "";
		
		
		for (int i = reverseC.length - 1; i >= 0; i--) {
			reverse = reverse + reverseC[i];
		}
		
		return reverse;
		*/	
	}
}