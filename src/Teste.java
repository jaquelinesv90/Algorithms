
public class Teste {
	
	public static void main(String[] args){
		int number = 10;
		print(number);
	}
	
	public static void print(int number){
		
		for(int i = 0; i< number; i++){
			
			for(int j = number - i; j > 1; j--){
				System.out.print(" ");
			}
			
			for(int k= 0; k<= i;k++){
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		
		
		
	}
	
	
	
}
