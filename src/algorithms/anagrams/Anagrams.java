package algorithms.anagrams;
import java.util.HashMap;
import java.util.Map;

// uma palavra que pode formar outras ex: Iracema -> America
public class Anagrams {
	
	static String value1 = "anagram";
	static String value2= "marganaaa";
	
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
}
