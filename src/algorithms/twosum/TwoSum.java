package algorithms.twosum;

/*Given an array of integers num and an integer target, return indices 
 * of the two numbers such taht they add up to target.
 * You may assume that each input would have exactly one solution, and
 * you may not use the same element twice
 * 
 */
public class TwoSum {
	
	public static void main(String[] args){
		int[] array = {2,7,11,15};
		int target = 9;
		int[] result = new int[2];
		int number = 0;
		for(int i =0; i< array.length; i++){
			number = array[i];
			if(number +array[i+1] == target){
				break;
			}else{
				
			}
		}
		
	}
}
