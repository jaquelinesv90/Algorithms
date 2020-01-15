package algorithms.varargs;

/**
 * VarArgs - varios argumentos, � utilizado quando n�o sabemos de antem�o
 * quantos argumentos ser�o necess�rios.
 */

public class VarArgs {
	
	public static void main(String[] args){
		value(2,4,5);
	}
	
	// os valores ficam armazenados em um vetor
	public static int[] value(int... b){
		return b;
	}
	
	// somente o ultimo parametro pode ser vararg
	public static void value(int a, int b, int... c){
		
	}

}
