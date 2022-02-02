package algorithms.palindromeNumber;

/* Determine whether an integer is a palindrome.An integer is a
 * palindrome whe it reads the same backward as forward.
 * 
 * number % 10 = 0 ; any number ending with 0 return false
 */

public class PalindromeNumber {
	
	public static void main(String[] args){
		
		String num = "121";
		
		String reverse = "";
		
		for(int i = num.length()-1;i>=0; i--){
			
			reverse = reverse + num.charAt(i);
			System.out.println(reverse);
		}
		
		if(num.equals(reverse)){
			System.out.println("palindromo");
		}else{
			System.out.println("not palindrome");
		}	
	}
}
