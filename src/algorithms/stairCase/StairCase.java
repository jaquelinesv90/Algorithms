package algorithms.stairCase;

//receive a number of lines.It should print a staircase 
public class StairCase {

	public static void main(String[] args){
		int lines = 8;
		print(lines);
	}
	
	public static void print(int l){
		for(int i =0; i< l;i++){
			
			for(int j=l -i;j>1;j--){
				System.out.print(" ");
			}
			
			for(int k =0;k<=i;k++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
