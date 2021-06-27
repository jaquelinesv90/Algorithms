package algorithms.divisibility;

/* An array A of size N that contains non-negative integers.
 * Determine whether the number that is formed by selecting the 
 * last digit of all the N numbers is divisible by 10.
 * 
 * Um array A de tamanho N contém números não negativos.
 * Determine se o ultimo digito de cada numero é divisivel
 * por 10.
 * 
 */
public class Divisibility {
	
	static Integer[] array = {11};
	
	public static void main(String[] args){
		boolean result = isDivisible();
		System.out.println((result == true)? "Yes":"No");
	}
	
	public static boolean isDivisible(){
		
		for(int i = 0; i < array.length;i++){
			Integer value = array[i];
			String aux = value.toString();
			
			int number = 0;
			number = aux.charAt(1);
			
			if((number % 10) != 0){
				return false;
			}
		}
		return true;
	}
}
