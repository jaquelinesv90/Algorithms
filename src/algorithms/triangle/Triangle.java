package algorithms.triangle;


// given a number of lines, print a triangle
public class Triangle {

	
	public static void main(String args[]) {
		int number = 7; //numero de linhas do triangulo
		printTriangle(number);
		printInvertTriangle(number);
	}
	
	public static void printTriangle(int number) {
		
		for (int i = 0; i < number; i++) {
		
			for (int j = number - i; j > 1; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
	
	
	public static void printInvertTriangle(int number){
		
		for(int i = 0 ; i < number; i++){
			
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			
			for(int k = number; k>i;k--){
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
	}
	
}
