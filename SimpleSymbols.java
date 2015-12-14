package coderbytejava;

/**
 * Write the function SimpleSymbols(string) to take the string parameter being passed 
 * and determine if it is an acceptable sequence by either returning the string true or false. 
 * The string parameter will be composed of + and = symbols with several letters between them 
 * (i.e. ++d+===+c++==a) and for the string to be true each letter must be surrounded by a + symbol. 
 * So the string to the left would be false. 
 * The string will not be empty and will have at least one letter. 
 *
 */

public class SimpleSymbols {

	public static void main(String[] args) {

		String input = "+a+b+";
		
		System.out.println("functionSimpleSymbols: " + functionSimpleSymbols(input));
	}
	
	public static boolean functionSimpleSymbols(String input) {
		
		char[] temp = input.toCharArray();
		boolean symbol = false;
		
		for (int i = 0; i < temp.length; i++) {

			if (Character.isAlphabetic(temp[0]) || Character.isAlphabetic(temp[temp.length-1])) {
				break;
			}
			
			if (Character.isAlphabetic(temp[i])) {
				if (temp[i-1] == '+' && temp[i+1] == '+') {
					symbol = true;
				}
			}
			
		}
		return symbol;
	}
}