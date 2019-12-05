import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Bingo {
	
	static int[] array = new int[16];
	static int[] sortedNumbers = new int[10];
	final static int AMOUNT_OF_NUMBERS_IN_CHART = 16;
	static int match = 0;
	static int playCount = 0;
	
	public static void main(String[] args){
		printTable();
		printMessage();
	}
	
	public static void printTable(){
		Random numberRandom = new Random();
		int aux = 0;
		
		for(int i = 0; i< AMOUNT_OF_NUMBERS_IN_CHART; i++){
			int number = numberRandom.nextInt(100);
			array[i] = number;
			
			System.out.print(number);
			System.out.print(" ");
			aux++;
			
			if(aux == 4){
				System.out.println();
				aux=0;
			}
		}
	}
	
	public static void generateNumbers(){
		Random number = new Random(); 
		playCount++; 
		
		if(playCount <= 10){
			for(int i =0; i< 1;i++){
				sortedNumbers[i] = number.nextInt(100);
				
				System.out.print(sortedNumbers[i] +",");
			}
			verifyTable();
		}
	}
	
	public static void verifyTable(){
		for(int i = 0; i < AMOUNT_OF_NUMBERS_IN_CHART; i++){
			for(int j = 0; j < sortedNumbers.length;j++){
				if(array[i] == sortedNumbers[j]){
					match++;
				}
			}
		}
		if(match == 6){
			System.out.println("Bingo!");
		}
		setTimeToGenerateNumbers();
	}
	
	public static void setTimeToGenerateNumbers(){
		int delay = 5000;
		int interval = 1000;
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){
			public void run(){
				generateNumbers();
			}
		},delay, interval);
	}
	
	
	public static void printMessage(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		System.out.println("Raffle? 1- yes  2 - no");

		int option = scanner.nextInt();
		if(option == 1){
			generateNumbers();
		}	
	}
}
