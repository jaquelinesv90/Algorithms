package algorithms.camelcase;

//Other way to solve de algorithm
public class CamelCase_2 {
	
	public static void main(String[] args){
		 String[] arrays = {"hi there","hello buddy"};
		 
		 for(String array : arrays ){
			 String result = makeCamelCase(array);
			 System.out.println(result);
		 }
	}
	
	static String makeCamelCase(String array){
		String[] strArray = array.split(" ");
		makeFirstLetterCapitalForEachWord(strArray);
		String result = String.join(" ", strArray);
		return result;
	}
	
	static void makeFirstLetterCapitalForEachWord(String[] array){
		for(int i = 0; i<array.length;i++){
			array[i] = firstLetterCapital(array[i]);
		}
	}
	
	static String firstLetterCapital(String str){
		String firstLetter = str.substring(0,1);
		
		String firstLetterCapital = firstLetter.toUpperCase();
		
		String strExcludeFirstLetter = str.substring(1,str.length());
		
		String result = firstLetterCapital+ strExcludeFirstLetter;
		
		return result;
	}

}
