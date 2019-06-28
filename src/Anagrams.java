import java.util.HashMap;
import java.util.Map;


public class Anagrams {
	
	final static String valor1 = "anagram";
	final static String valor2= "marganaa";
	
	final static Map<Character, Integer> mapResult = new HashMap<>();
	
	
	public static void main(String[] args) {
		verifica();
	}

	public static void verifica(){
		for(int i= 0; i<valor1.length();i++){
			// se o mapa contém a letra eu acrescento + 1
			if(mapResult.containsKey(valor1.charAt(i))){
				
				
				//senão eu adiciono a letra e o valor
			}else{
				mapResult.put(valor1.charAt(i), 1);
			}
		}
		
	}
	
}
