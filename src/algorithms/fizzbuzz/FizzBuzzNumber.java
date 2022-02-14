package algorithms.fizzbuzz;

/* Write a program that outputs if a number is divible of 3 - fizz
 * or buzz divisible of 5, or divible for both fizzbuzz
 */

public class FizzBuzzNumber {

	public static void main(String[] args) {
		Integer number = 15;

		if ((number % 3) == 0) {
			if ((number % 5) == 0) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println("Fizz");
			}
		} else if ((number % 5) == 0) {
			System.out.println("Buzz");
		}
	}
}
