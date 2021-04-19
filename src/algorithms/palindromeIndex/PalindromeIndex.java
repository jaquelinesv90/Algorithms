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
	
	
	public static void main(String[] args) {
		String s = "bcbc";
		palindrome(s);
	}
	
	public static void palindrome(String s){
		
		
	}

}
