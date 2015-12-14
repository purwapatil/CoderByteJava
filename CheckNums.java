package coderbytejava;

/**
 * Write the function CheckNums(number1, number2) to take both parameters being passed 
 * and return the string true if number2 is greater than number1, otherwise return the string false. 
 * If the parameter values are equal to each other then return the string -1.  
 *
 */

public class CheckNums {

	public static void main(String[] args) {

		int number1 = 5;
		int number2 = 10;
		
		System.out.println("functionCheckNums: " + functionCheckNums(number1, number2));
	}
	
	public static int functionCheckNums(int number1, int number2) {
		
		if (number1 == number2) {
			return -1;
		} 
		else if (number1 < number2) {
			return 0;
		}
		else {
			return 1;
		}
	}
}