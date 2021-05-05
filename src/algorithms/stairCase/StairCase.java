package algorithms.stairCase;

// escadaria
//receive a number of lines.It should print a staircase 
public class StairCase {

	public static void main(String[] args){
		int lines = 6;
		print(lines);
	}
	
	public static void print(int lines){
		for(int i =0; i< lines;i++){
			
			for(int j=lines-i;j>1;j--){
				System.out.print(" ");
			}
			
			for(int k =0;k<=i;k++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
