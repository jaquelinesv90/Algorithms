package algorithms.camelcase;
import java.util.ArrayList;
import java.util.List;

//count how many words are in the phrase
public class CamelCase {

	static String phrase = "saveChangesInTheEditor";
	static int count = 1; //começa com 1 pois a primeira letra é minuscula, nesse caso não contaria a primeira palavra
						 // starts in 1 because the first letter is lower, in this case we don't count de first word 
	public static void main(String[] args) {
		countLetters();
		showWords();
	}

	public static void countLetters() {
		for (int i = 0; i < phrase.length(); i++) {

			if (Character.isUpperCase(phrase.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}

	// show which words in String
	public static void showWords() {
		String word = "";
		List<String> listWords = new ArrayList<String>();

		for (int i = 0; i < phrase.length(); i++) {
			
			if (Character.isUpperCase(phrase.charAt(i))) {
				char aux = phrase.charAt(i);
			}
			
			           
			/*
			do{
				word = String.valueOf(phrase.charAt(i));
			}while(Character.isLowerCase(phrase.charAt(i)));				
			
			listWords.add(word);
			
			word = "";
			*/
		}
	}
}
