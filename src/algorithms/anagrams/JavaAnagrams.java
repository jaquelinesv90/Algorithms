package algorithms.anagrams;

/* Duas String 'a' e 'b', s�o chamadas anagramas se cont�m os mesmos
 * caracteres na mesma frequencia.O teste n�o � case sensitive.
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
		
		 /*para cada letra do alfabeto ter� um array int
		 * ele ser� inicializado com 0, ent�o 26 zeros
		 * em uma matriz agora, para qualquer coisa que 
		 * for fazer com frequencias de char fa�a uma matriz
		 * alfab�tica e use-a sempre, sempre melhor que um hashMap
		*/ 
		int[] char_frequencies = new int[26];

		//um for para cada String
		for (int i = 0; i < a_length; i++) {
			char current_char = a.charAt(i);
			//vai pegar o index do caracter atual, o 'a' � a primeira letra do alfabeto
			//ent�o vai ter index 0
			int index = current_char - 'a';
			char_frequencies[index]++;
		}

		for (int i = 0; i < b_length; i++) {
			char current_char = b.charAt(i);
			int index = current_char - 'a';
			char_frequencies[index]--;
		}

		//cada elemento deve ser zero 
		
		for (int i = 0; i < 26; i++) {
			if (char_frequencies[i] != 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		boolean result = isAnagram("CAT", "TFG");
		System.out.println((result == true)? "Anagram":"not anagram");
	}
}
