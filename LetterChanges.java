package coderbytejava;

/**
 * Write the function LetterChanges(string) to take the string parameter being passed 
 * and modify it using the following algorithm. 
 * Replace every letter in the string with the letter following it in the alphabet 
 * (i.e. c becomes d, z becomes a). 
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string. 
 *
 */

public class LetterChanges {

	public static void main(String[] args) {

		String input = "abz1*";
		
		System.out.println("functionLetterChanges: " + functionLetterChanges(input));
	}
	
	public static String functionLetterChanges(String input) {
		
		char[] inputChar = input.toCharArray();
		char nextLetter = 0;
		StringBuilder change = new StringBuilder("");
		
		for (int i = 0; i < inputChar.length; i++) {
			
			if (Character.isAlphabetic(inputChar[i])) {
				if (inputChar[i] == 'z') {
					nextLetter = 'a';
				}
				
				else {
					nextLetter = inputChar[i];
					nextLetter++;
				}
				
				if (nextLetter == 'a' || nextLetter == 'e' || nextLetter == 'i' || nextLetter == 'o' || nextLetter == 'u') {
					nextLetter = Character.toUpperCase(nextLetter);
				}
				
				change.append(nextLetter);
			}
			
			else {
				change.append(inputChar[i]);
			}
		}
		return change.toString();
	}
}