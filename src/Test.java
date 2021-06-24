
public class Test {
	
	public static void main(String[] args) {
		String value1 = "iracema";
		String value2 = "america";
		boolean result = isAnagram(value1,value2);
		System.out.println((result == true)? "Anagram":"not anagram");
	}
	
	public static boolean isAnagram(String v1,String v2){
		int a_length = v1.length();
		int b_length = v2.length();
		
		if(a_length != b_length){
			return false;
		}
		
		int[] char_frequencies = new int[26];
		
		for(int i = 0; i <= a_length;i++){
			
		}
		
		
		
		
		
	}
	
	
	
	
}
