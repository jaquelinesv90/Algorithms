package algorithms.romanToInteger;

import java.util.HashMap;
import java.util.Map;

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
	
	String inputRomanNumeral= "I";
	Integer outputNumber;
	int total = 0;
	
	static Map<String,Integer> map = new HashMap<>();
	
	public static void main(String[] args){
		fillMap();
		
		while(){
			
		}
		
	}
	
	public static void fillMap(){
		map.put("I",1);
		map.put("V",5);
		map.put("X",10);
		map.put("L",50);
		map.put("C",1);
		map.put("D",1);
		map.put("M",1);
	}
	
	

}
