
public class ArithmeticTable {
	
	/*
	public static void main(String[] args) {
		printTable();
	}
	*/
	public static void printTable(){
		for(int i = 2; i<11 ; i++){
			for(int j =1; j<11; j++){
				System.out.println(i +"X"+ j + "="+i*j);
			}
			System.out.println();
		}	
	}
}
