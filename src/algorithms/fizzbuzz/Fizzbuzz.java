package algorithms.fizzbuzz;

/* Write a program that outputs the string representation of
 * numbers from 1 to n.But for multiples of three it should print
 * "Fizz" instead of the number and for the multiples of five 
 * print "Buzz". For numbers which are multiples of both three
 * and five print "FizzBuzz".
 */

public class Fizzbuzz {

	public static void main(String[] args) {
		Integer n = 5;

		for (int i = 1; i <= n; i++) {
			if (((i % 5) == 0) && ((i % 3) == 0)) {
				System.out.println("FizzBuzz,");
			}else if((i % 3) == 0){
				System.out.println("Fizz,");
			}else if((i % 5) == 0){
				System.out.println("Buzz,");
			}else{
				System.out.println(Integer.toString(i)+",");
			}
		}
	}
}
