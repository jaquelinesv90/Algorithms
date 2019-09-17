 // de sequence start in 1; after each number is add to number before
 //f1 = 1 ; f2 = 1; f3 = 2; f4 = 3; f5 = 5;
public class Fibonacci {
	
	public static void main(String[] args){
		for(int i = 0; i<10 ; i++){
			System.out.println("(" + i + "):" + calculaFibonacci(i));
		}
	}

	public static long calculaFibonacci(int n){
		int F = 0; //atual
		int ant = 1; //anterior
		
		for(int i = 1; i<= n; i++){
			if(i == 1){
				F=1;
				ant= 0;
			}else{
				F+= ant;
				ant = F - ant;
			}
		}
		return F;
	}
}
