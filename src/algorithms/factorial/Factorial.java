package algorithms.factorial;

//fatorial � representado por n
// � um numero calculado pela multiplica��o desse n�mero
// por todos os seus antecessores at� chegar ao 1

public class Factorial {

	public static void main(String args[]){
		int n = 4;
		System.out.print(calculate(n));
		
	}
	
	//fun��o recursiva
	public static int calculate(int n){
		if(n == 0)
			return 1;
		return n*calculate(n - 1);
	}
}
