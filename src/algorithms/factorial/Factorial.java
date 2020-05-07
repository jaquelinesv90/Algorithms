package algorithms.factorial;

//fatorial é representado por n
// é um numero calculado pela multiplicação desse número
// por todos os seus antecessores até chegar ao 1

public class Factorial {

	public static void main(String args[]){
		int n = 4;
		System.out.print(calculate(n));
		
	}
	
	//função recursiva
	public static int calculate(int n){
		if(n == 0)
			return 1;
		return n*calculate(n - 1);
	}
}
