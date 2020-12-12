package algorithms.twosum;

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
	
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int[] output = new int[2];
		int target = 9;
		int number = 0;

		for (int i = 0; i < nums.length; i++) {
			for(int j = 0; j< nums.length; j++){
			
				number = nums[i];
				if (number + nums[i + 1] == target) {
					output[i] = nums[i]; //adicionando na primeira casa do array
					output[j +1] = nums[i];  //adicionando na segunda casa do array
				}
			}
			break;
		}
		for(int i = 0; i < nums.length; i++){
			System.out.println("output: "+ output[i]);
		}

	}
}
