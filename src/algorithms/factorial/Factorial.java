package algorithms.factorial;

/* Dado um numero é feita uma multiplacação deste numero com seus
antecessores até se chegar em 1
*/

/*The factorial function is a mathematical formula represented by
an exclamation mark "!". In the Factorial formula you must multiply 
all the integers and positives that exist between the number that
appears in the formula and the number 1. 

    4! = 4 × 3 × 2 × 1 = 24
    7! = 7 × 6 × 5 × 4 × 3 × 2 × 1 = 5040
    1! = 1
*/

public class Factorial {

	public static void main(String args[]){
		int n = 4;
		System.out.print(calculate(n));
		
	}
	
	//função recursiva
	// recursive function
	public static int calculate(int n){
		if(n == 0)
			return 1;
		return n*calculate(n - 1);
	}
}
