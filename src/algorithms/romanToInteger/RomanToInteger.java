package algorithms.romanToInteger;


/* Roman numerals are represented by seven different symbols: I,V,X,L,C,D,M.
 * Symbol       Value
 *   I             1
 *   V			   5	
 *   X            10
 *   L 			  50
 *   C			  100
 *   D			  500
 *   M			 1000
 *   
 *   Roman numerals are usually written largest to smallest from left to right.
 *   
 *   Given a roman numeral, convert it to an integer.
 *   example: s = "III" output: 3
 *   example: 
 */

public class RomanToInteger {
	
	public int romanInt(String s){
		String[] roman = new String[] {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		int[] numeral = new int[] {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		
		int index = roman.length - 1;
		int sum = 0;
		
		while(index >= 0){
			if(s.startsWith(roman[index])){
				sum += numeral[index];
				s = s.substring(roman[index].length());
			}else{
				index --;
			}
		}
		return sum;
	}

	
	public static void main(String[] args) {
		RomanToInteger r = new RomanToInteger();
		System.out.println(r.romanInt("LVIII"));
	}
	

}
