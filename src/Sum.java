
//given a list of numbers and a number k, return whether any two number from the lis
//add up to k.
public class Sum {

	public static void main(String[] args){
		int[] listNumber = {10,7,5,15};
		int k = 17;
		calc(listNumber,k);
	}
	
	public static void calc(int[] listNumber, int k){
		int firstElement = 0;
		
		for(int i = 0; i< listNumber.length;i++){
			firstElement = listNumber[i];
			for(int j = listNumber.length -1; j>=1; j--){
				int lastElement = listNumber[j];
				if((firstElement+lastElement) == k){
					printResult(true);
					break;
				}
			}
		}
		printResult(false);	
	}
	
	public static void printResult(boolean result){
		if(result){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}
