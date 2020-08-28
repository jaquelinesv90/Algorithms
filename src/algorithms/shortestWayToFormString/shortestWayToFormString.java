package algorithms.shortestWayToFormString;

/* level: Medium
 From any string, we can form a subsequence
of that string by deleting some number of characters(possibly no deletions)
Given two string source and target, return the minium number of subsequences of
source such that their concatenation equals target.If the task is impossible, return -1.
ex: input = "abc", target ="abcbc"
output: 2 */
public class ShortestWayToFormString {
	
	public static void main(String[] args){
		String input = "abc";
		String target = "abcbc";
		System.out.println(shortestWay(input, target));
	}
	
	public static int shortestWay(String input, String target){
		int numSubsequences = 0;
		String remaining = target;
		
		while(remaining.length() > 0){
			StringBuilder subsequence = new StringBuilder();
			
			int i = 0;
			int j = 0;
			
			while(i< input.length() && j< remaining.length()){
				if(input.charAt(i++) == remaining.charAt(j)){
					subsequence.append(remaining.charAt(j++));
				}
			}
			
			if(subsequence.length() == 0){
				return -1;
			}
			numSubsequences++;
			remaining = remaining.substring(subsequence.length());
		}
		
		return numSubsequences;
	}
}
