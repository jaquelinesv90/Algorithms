package algorithms.palindromeIndex;

/*Given a string of lowercase letters in the range ascii[a-z], determine the index of a 
 * character that can be removed to make the string a palindrome.
 * There may be more than one solution, but any will do. If the word is 
 * already a palindrome or there is no solution, return -1. Otherwise,
 * return the index of a character to remove.
 * Example: s = "bcbc"
 * Either remove 'b' at index 0 or 'c' at index 3.
 * 
 * Function Description
 * Query 1: "aaab"
 *	Removing 'b' at index 3 results in a palindrome, so return 3.
 * Query 2: "baa"
 *	Removing 'b' at index 0 results in a palindrome, so return 0.
 * Query 3: "aaa"
 *  This string is already a palindrome, so return -1. Removing any 
 *  one of the characters would result in a palindrome, but this test comes first.
 */
public class PalindromeIndex {
	
	//não tem modificador de acesso então é default, acessivel a todas as classes dentro do mesmo pacote
	static int palindrome(String s){
		int palindromeIndex = -1;
		int len = s.length();
		
		for(int i =0; i< len / 2; i++){
			//aqui vai pegar a primeira letra e a ultima 
			if(s.charAt(i) != s.charAt(len - i -1)){
				//aqui ele vai cortar a string 
				boolean isRightStringValidPalindrome = isValidPalindrome(s.substring(i+1,len-i));
				if(isRightStringValidPalindrome){
					return i;
				}else
					return len - i- 1;
			}
		}
		return palindromeIndex;
	}
	
	public static boolean isValidPalindrome(String str){
		int len = str.length();
		for(int i= 0; i<len / 2; i++){
			if(str.charAt(i) != str.charAt(len -i -1)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(palindrome("aaabb"));
	}

}
