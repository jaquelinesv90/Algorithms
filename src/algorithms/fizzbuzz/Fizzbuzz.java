package algorithms.fizzbuzz;

/* Write a program that outputs the string representation of
 * numbers from 1 to n.But for multiples of three it should print
 * "Fizz" instead of the number and for the multiples of five 
 * print "Buzz". For numbers which are multiples of both three
 * and five print "FizzBuzz".
 */

public class Fizzbuzz {

	public static void main(String[] args) {
		Integer number = 15;

		for(int i = 1; i < number; i++){
			if((i % 3) == 0){
				if((i % 5) == 0){
					System.out.println("FizzBuzz");
				}else{
					System.out.println("Fizz");
				}
			}else if((i % 5) == 0){
				System.out.println("Buzz");
			}
			
		}
		
	}
}
