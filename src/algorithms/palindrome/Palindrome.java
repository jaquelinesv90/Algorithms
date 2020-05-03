package algorithms.palindrome;

// a palindrome is a word,phrase,number or other sequence of characters which reads the same backward or forward
// example : madam,arara,radar
public class Palindrome {
	
	public static void main(String args[]){
		String word = "arara";
		String r = new StringBuilder(word).reverse().toString();
		
		if(word.equals(r)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}

