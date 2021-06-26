package algorithms.oddNumber;

/* Odd numbers are whole numbers that cannot be divided exactly into pairs
 * Odd numbers,when divided by 2,leave a remainder of 1.
 * 
 * Numero ímpar
 * É qualquer número dividido por 2 resulta em um número inteiro.
 * O algoritmo exibe os numeros impares dentre o intervalo passado 
 * para as variaveis number1 e number2
 */
public class OddNumber {
	
	public static void main(String[]  args){
		int number1 = 30;
		int number2 = 100;
		calculate(number1,number2);
	}

	public static void calculate(int n1,int n2){
		for(int i = n1; i<=n2; i++){
			int j = i%2;
			if(j != 0){
				System.out.println("odd number"+ i);
			}
		}
	}
}
