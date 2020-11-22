package algorithms.euclidsalgorithm;

/* Calculates the greatest common divisor for two number.
 * 
 * calcular mdc(maximo divisor comum)divide o primeiro numero
 * pelo segundo, depois divide o segundo numero pelo resto da
 * divisão com o primeiro e assim sucessivamente até atingir zero
 * de resto de divisão
 * 
 */
public class EuclidsAlgorithm {

	public static void main(String[] args) {
		System.out.println(calculate(16,12));
	}
	
	public static double calculate(double n1, double n2){
		if(n2 == 0){
			return n1;
		}else{
			return calculate(n2,n1 % n2);
		}
	}
}
