package algorithms.arithmetictable;

//tabuada
//Arithmetic table
public class ArithmeticTable {
	
	
	public static void main(String[] args) {
		printTable();
	}
	
	//o i recebe dois pq começa na tabuada do dois poderia ser 1
	// variable i is started using 2 because we want to start in 2 arithmetic table
	public static void printTable(){
		for(int i = 2; i<11 ; i++){
			for(int j =1; j<11; j++){
				System.out.println(i +"X"+ j + "="+i*j);
			}
			System.out.println();
		}	
	}
}
