package algorithms.longestCommonPrefix;

// flower, flow, flight
public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] input = {"flower","flow"};
		
		if(input.length == 0){
			System.out.println("no");
		}
		
		String prefix = args[0];
		for(int i = 1; i < input.length; i++){
			while(input[i].indexOf(prefix) != 0){
				
			}
		}
		
		
	}

}
