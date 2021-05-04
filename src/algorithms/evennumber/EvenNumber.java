package algorithms.evennumber;

//calcular numero par entre eles
//give 2 numbers calculate even number between them
public class EvenNumber {
	
	
	public static void main(String[] args){
		int x = 30;
		int y = 100;
		calculate(x,y);
	}
	
	public static void calculate(int x, int y){
		for(int i = x; i<y;i++){
			int j = 0;
			j = i%2;
			if(j == 0){
				System.out.println("even number: " + i);
			}
		}
	}

}
