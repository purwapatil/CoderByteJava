package coderbytejava;

/**
 * Write the function LetterCapitalize(string) to take the string parameter being passed 
 * and capitalize the first letter of each word. Words will be separated by only one space. 
 *
 */

public class LetterCapitalize {

	public static void main(String[] args) {

		String input = "this is test";
		
		System.out.println("functionLetterCapitalize: " + functionLetterCapitalize(input));
	}
	
	public static String functionLetterCapitalize(String input) {
		String[] words = input.split("\\s");
		StringBuilder temp = new StringBuilder("");
		
		for (int i = 0; i < words.length; i++) {
			temp.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1)).append(" ");
		}
		
		return temp.toString();
	}
}