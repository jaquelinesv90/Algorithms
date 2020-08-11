
public class Teste {
	
	public static void main(String[] args) {
		String s = "madam";
		System.out.print(reverse(s));
	}
	
	public static String reverse(String s){
		char[] characters = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		
		while(i < j){
			char temp = characters[i];
			characters[i++] = characters[j];
			characters[j--] = temp;
		}
		return new String(characters);	
	}
	
	
}
