
public class Test {
	//count how many words are in the phrase
	public static void main(String[] args) {
		String phrase = "SaveChangesInTheEditor";
		int count = 1;
		//counter(phrase,count);
		showWords(phrase);
	}
	
	public static void counter(String phrase,int count){
		for(int i = 0; i< phrase.length();i++){
			if(Character.isUpperCase(phrase.charAt(i))){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void showWords(String phrase){
		for(int i = 0; i< phrase.length();i++){
			if(Character.isUpperCase(phrase.charAt(i))){
				System.out.println(phrase.substring(i));
			}
		}
		
		
	}
	
	
	
}
