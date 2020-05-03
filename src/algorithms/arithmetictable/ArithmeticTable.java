package algorithms.arithmetictable;

//tabuada
public class ArithmeticTable {
	
	
	public static void main(String[] args) {
		printTable();
	}
	
	//o i recebe dois pq começa na tabuada do dois poderia ser 1
	public static void printTable(){
		for(int i = 2; i<11 ; i++){
			for(int j =1; j<11; j++){
				System.out.println(i +"X"+ j + "="+i*j);
			}
			System.out.println();
		}	
	}
}
