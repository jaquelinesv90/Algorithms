

public class Test {

	public static void main(String[] args){
		int n = 20;
		Test.fibo(n);
		
	}
	
	static int fibo(int n){
		int ant = 0;
		int atual = 1;
		
		for(int i = 0; i < n ; i++){
			atual = atual +ant;
			ant=atual;
			System.out.println(atual);
		}
		return 0;
		
	}
}
