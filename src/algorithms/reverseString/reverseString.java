package algorithms.reverseString;

/* Write a function that takes a string as input and
 returns the string reversed.
 ex. Given s = "hello", return "olleh".*/
public class ReverseString {
	
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverse(s));
	}
	
	public static String reverse(String s) {
		
		char[] characters = s.toCharArray();
		int i = 0;
		int j = s.length() -1; // because arrays are zero-based
		
		while( i < j){
			char temp = characters[i];
			characters[i++] = characters[j];
			characters[j--] = temp;
		}
		return new String(characters);
	}

}
