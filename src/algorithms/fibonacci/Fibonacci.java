package algorithms.fibonacci;

// Leval: Easy
// de sequence starts in 1; after each number is add to number before
// f1 = 1
//f2 = f1 + anterior = 1
//f3 = f2+f1 = 1+1= 2
//f4 = f3 +f2 = 2+1 = 3
//f5 = f4+f3 = 3+2 = 5
//f6 = f5+f4 = 5+3 = 8


public class Fibonacci {
	
	public static void main(String[] args) {

		int maxNumber = 10;
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacci " + maxNumber + " numbers: ");

		for (int i = 1; i <= maxNumber; i++) {
			System.out.print(previousNumber + " ");

			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
	}	
	
////////////////other way to solve
	
	/*
	public static void main(String[] args){
		
		for(int i = 1; i<10 ; i++){
			System.out.println("F"+i +":" +calcFibonacci(i));
		}
	}

	public static long calcFibonacci(int n){
		int current = 0;  // atual
		int previous = 1;   // anterior
		
		for(int i = 1;i<= n; i++){
			if( i ==1){
				current =1;
				previous = 0;
			}else{
				current+= previous;
				previous = current -previous;
			}
		}
		return current;
		}{
*/
}
