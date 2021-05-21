package algorithms.anagrams;

/* Duas String 'a' e 'b', são chamadas anagramas se contém os mesmos
 * caracteres na mesma frequencia.O teste não é case sensitive.
 * Por exemplo o anagrama de CAT: ACT,TCA,aTC e CtA.
 * 
 * Two Strings, a and b called anagrams if they contain all the same 
 * characters in the same frequencies.For example anagrams of CAT: ACT,TAC..
 */
public class JavaAnagrams {

	public static boolean isAnagram(String a, String b) {
		int a_length = a.length();
		int b_length = b.length();

		a = a.toLowerCase();
		b = b.toLowerCase();
		
		if (a_length != b_length) {
			return false;
		}
		
		//para cada letra do alfabeto terá um array int
		//ele será inicializado com 0
		int[] char_frequencies = new int[26];

		for (int i = 0; i < a_length; i++) {
			char current_char = a.charAt(i);
			int index = current_char - 'a';
			char_frequencies[index]++;
		}

		for (int i = 0; i < b_length; i++) {
			char current_char = b.charAt(i);
			int index = current_char - 'a';
			char_frequencies[index]--;
		}

		for (int i = 0; i < 26; i++) {
			if (char_frequencies[i] != 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		isAnagram("CAT", "ACT");
	}
}
