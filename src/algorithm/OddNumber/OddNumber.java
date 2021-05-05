package algorithm.OddNumber;

public class OddNumber {
	
	public static void main(String[]  args){
		int number1 = 30;
		int number2 = 100;
		calculate(number1,number2);
	}

	public static void calculate(int n1,int n2){
		for(int i = n1; i<=n2; i++){
			int j = i%2;
			if(j != 0){
				System.out.println("odd number"+ i);
			}
		}
	}
}
