package algorithms.bingo;
import java.util.Random;

public class Bingo {
	
	static int[] chartNumbers = new int[16];
	static int[] sortedNumbers = new int[10];
	final static int AMOUNT_OF_NUMBERS_IN_CHART = 16;
	static int match = 0;
	static int playCount = 0;
	
	public static void main(String[] args){
		printTable();
		printMessage();
		
		while(playCount < 10){
			generateNumbers();
			verifyTable();
		}
		
		if(match == 6){
			System.out.println("\nBingo!");
		}else{
			System.out.println("\nTry again!");
		}
	}
	
	// exibir a cartela de numeros -ok
	// sortear um numero  ok
	// verificar se na cartela tem o numero ok
	// se a tabela contiver o numero adicionar a caixa senão jogar novamente ok
	// verificar se na cartela tem o numero 
	// verificar se na cartela tem o numero até ser sorteado 10 numeros
	// se 6 dos 10 foram sorteados gera o bingo
	
	public static void printTable(){
		Random numberRandom = new Random();
		int aux = 0;
		
		for(int i = 0; i< AMOUNT_OF_NUMBERS_IN_CHART; i++){
			int number = numberRandom.nextInt(100);
			chartNumbers[i] = number;
			
			System.out.print(number);
			System.out.print(" ");
			aux++;
			
			if(aux == 4){
				System.out.println();
				aux=0;
			}
		}
	}
	
	public static void printMessage(){
		System.out.println("");
		System.out.println("## BINGO ##");
		
		System.out.println("Preparing to sort the numbers:");
	}
	
	public static void generateNumbers(){
		Random number = new Random(); 
		playCount = playCount+1;
		setTimeToGenerateNumbers();
		
		for(int i =0; i< 1;i++){
			sortedNumbers[i] = number.nextInt(100);
			
			System.out.print(sortedNumbers[i] +" ");
		}
	}
	
	public static void setTimeToGenerateNumbers(){
		SetTimerBingo.Init();
	}
	
	public static void verifyTable(){
		for(int i = 0; i < AMOUNT_OF_NUMBERS_IN_CHART; i++){
			for(int j = 0; j < sortedNumbers.length;j++){
				if(chartNumbers[i] == sortedNumbers[j]){
					match++;
				}
			}
		}
	}
}