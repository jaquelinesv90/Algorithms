package algorithms.anagrams;
import java.util.HashMap;
import java.util.Map;

/* uma palavra que pode formar outras ex: Iracema -> America
* para calcular quantas possibilidades de anagramas existem pode-se
* usar fatorial.
* uma string é um anagrama de outra se a segunda é simplesmente um rearranjo
* da primeira ex: amor -> roma
* O algoritmo deve comparar duas strings -se elas tem a mesma quantidade de caracteres
* e os mesmos caracteres.
* o algoritmo recebe duas palavras e compara se são anagramas.
* 
* */

//word formed by rearranging the letters of a different word  ex: listen -> silence
//to calculate how many anagram possibilities there are you can
//use factorial.
//one string is an anagram of another if the second is simply a rearrangement
//of the first.
public class Anagrams {
	
	static String value1 = "low-salt";
	static String value2= "owls-lat";
	
	final static Map<Character, Integer> mapResult = new HashMap<>();
	final static Map<Character, Character> mapTotal = new HashMap<>();
	

	public static void main(String[] args) {
		if(!validateWord()){
			value1 = value1.toLowerCase();
			value2 = value2.toLowerCase();
			fillMap();
			if(calculateTotal()){
				System.out.println("Anagram");
			}else{
				System.out.println("Not anagrams");
			}
		}
		
	}

	public static boolean validateWord(){
		int aux = value1.length();
		return (aux != value2.length() ? true : false);
	}
	
	
	public static void fillMap(){
		for(int i= 0; i<value2.length();i++){
			char letter = value2.charAt(i);
			
			// sempre adiciona o valor ao mapa
			if(!mapResult.containsKey(letter)){
				mapResult.put(letter , 1);
			}else{
				Integer frequency = mapResult.get(letter);
				mapResult.put(letter, ++frequency);
			}
		}
	}
	
	public static boolean calculateTotal(){
		for(int k = 0; k < value1.length(); k++){
			char letter = value1.charAt(k);
			
			if(!mapResult.containsKey(letter)){
				return false;
			}
			
			Integer frequency = mapResult.get(letter);
			
			if(frequency == 0){
				return false;
			}else
				mapResult.put(letter, --frequency);
		}
		return true;
	}
	
	//utilizando sort
	/**
* public static void main(String[] args){
		String string1 = "low-salt";
		String string2 = "owls-lat";
		System.out.print(isAnagramSort(string1, string2));
	}
	
	
	static boolean isAnagramSort(String string1, String string2) {
	    if (string1.length() != string2.length()) {
	        return false;
	    }
	    char[] a1 = string1.toCharArray();
	    char[] a2 = string2.toCharArray();
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    return Arrays.equals(a1, a2);
	}
	 */
}
