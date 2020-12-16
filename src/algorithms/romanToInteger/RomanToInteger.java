package algorithms.romanToInteger;


/* Roman numerals are represented by seven different symbols: I,V,X,L,C,D,M.
 * 
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
	
	int value(char c){
		if(c == 'I')
			return 1;
		if(c == 'V')
			return 5;
		if(c == 'X')
			return 10;
		if(c == 'L')
			return 50;
		if(c == 'C')
			return 100;
		if(c == 'D')
			return 500;
		if(c == 'M')
			return 1000;
		return -1;
	}
	/*
	int romanToInt(String s){
		int total = 0;
		
		
	}
	*/
	
	
	public static void main(String[] args){
		RomanToInteger r = new RomanToInteger();
		String value = "MCMXCIV";
		//System.out.println(r.romanToInt(value));
		
	}
	
	
	
	

}
