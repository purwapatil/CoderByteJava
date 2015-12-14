package coderbytejava;

/**
 * Write the function SimpleAdding(number) to add up all the numbers from 1 to number. 
 *
 */

public class SimpleAdding {

	public static void main(String[] args) {

		int number = 5;
		
		System.out.println("functionSimpleAdding: " + functionSimpleAdding(number));
	}
	
	public static int functionSimpleAdding(int number) {
		
		int sum = 0;
		
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		
		return sum;
	}
}