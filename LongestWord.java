package coderbytejava;

/**
 *  Write the function LongestWord(input) to take the input parameter being passed 
 *  and return the largest word in the string. 
 *  If there are two or more words that are the same length, return the first word from the string 
 *  with that length. Ignore punctuation and assume input will not be empty. 
 *
 */

public class LongestWord {

	public static void main(String[] args) {

		String input = "this is test";
		
		System.out.println("functionLongestWord: " + functionLongestWord(input));
	}
	
	public static String functionLongestWord(String input) {
		
		String[] words = input.split("\\s");
		
		int wordLength = 0;
		String longestWord = "";

		for (int i = 0; i <= words.length-1; i++) {
			if (words[i].length() > wordLength) {
				longestWord = words[i];
				wordLength = words[i].length();
			}
		}
		
		return longestWord;
	}
}