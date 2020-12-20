package algorithms.twosum;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers num and an integer target, return indices 
 * of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and
 * you may not use the same element twice
 * 
 * input: nums = {2,7,11,15} target = 9
 * output: {0,1}
 * output: because  nums[0] + nums[1] == 9, return [0,1]
 */
public class TwoSum {
	
	Map<Integer,Integer> map = new HashMap<>();
	static int target = 18;
	
	public int[] calc(){
		int[] nums = { 2, 7, 11, 15 };
		
		for(int i = 0; i< nums.length; i++){
			for(int j = i+1;j<nums.length;j++){
				if(nums[j] == target - nums[i]){
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("no solution");
	}
	
	public static void main(String[] args) {
		
		TwoSum t = new TwoSum();
		int[] result = t.calc();
		
		for(int i = 0; i< result.length;i++){
			System.out.print(result[i] + ",");
		}
		
	}
}
