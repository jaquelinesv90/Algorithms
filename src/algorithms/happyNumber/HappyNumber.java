package algorithms.happyNumber;

import java.util.HashSet;

/*
 * Level : easy
 * 
 * Write an algorithm to determine if a number is "happy"
 * 
 * Happy number is a number defined by the following process: Starting
 * with any positive integer, replace the number by the sum of the squares
 * of its digits, and repeate the process until the number equals 1(where it will stay),
 * or it loops endlessly in a cycle which does not include 1.Those numbers for which 
 * this process ends in 1 are happy numbers.
 * 
 * ex: number 19
 * 
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * 
 * as we reached to 1, 19 is a Happy number
 */

public class HappyNumber {
	
	public static void main(String[] args) {
		int n = 19;
		if(isHappy(n)){
			System.out.println(n +" is a happy number");
		}else{
			System.out.println(n +" is not a happy number");
		}
		
	}
	
	public static boolean isHappy(int n){
		HashSet<Integer> seen = new HashSet<>();
		
		while(n != 1){
			int current = n;
			int sum = 0;
			while(current != 0){
				sum += (current % 10) * (current % 10);
				current /=10;
			}
			
			if(seen.contains(sum)){
				return false;
			}
			
			seen.add(sum);
			n = sum;
		}
		return true;
	}
}
