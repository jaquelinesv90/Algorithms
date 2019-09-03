import java.util.HashMap;
import java.util.Map;


public class Anagrams {
	
	static String valor1 = "anagram";
	static String valor2= "marganaaa";
	
	final static Map<Character, Integer> mapResult = new HashMap<>();
	final static Map<Character, Character> mapTotal = new HashMap<>();
	
	/**
	public static void main(String[] args) {
		if(!validaPalavra()){
			valor1 = valor1.toLowerCase();
			valor2 = valor2.toLowerCase();
			preenchemap();
			if(calculaTotal()){
				System.out.println("Anagram");
			}else{
				System.out.println("Not anagrams");
			}
		}
		
	}
*/ 
	public static boolean validaPalavra(){
		int aux = valor1.length();
		return (aux != valor2.length() ? true : false);
	}
	
	
	public static void preenchemap(){
		for(int i= 0; i<valor2.length();i++){
			char letter = valor2.charAt(i);
			
			// sempre adiciona o valor ao mapa
			if(!mapResult.containsKey(letter)){
				mapResult.put(letter , 1);
			}else{
				Integer frequency = mapResult.get(letter);
				mapResult.put(letter, ++frequency);
			}
		}
	}
	
	public static boolean calculaTotal(){
		for(int k = 0; k < valor1.length(); k++){
			char letter = valor1.charAt(k);
			
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
