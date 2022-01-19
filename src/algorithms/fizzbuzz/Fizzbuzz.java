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

		String[] list = new String[n];

		for (int i = 0; i < n; i++) {
			if ((n % 5 == 0) && (n % 3 == 0)) {
				list[i] = "FizzBuzz";
			}else if(n % 3 == 0){
				list[i] = "Fizz";
			}else if(n % 5 == 0){
				list[i] = "Buzz";
			}else{
				list[i] = Integer.toString(i);
			}
		}
			
		for (String string : list) {
			System.out.println(string);
		}
		
	}
}
