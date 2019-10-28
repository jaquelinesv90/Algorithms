import java.io.IOException;
import java.util.Scanner;


public class JogodaVelha {
	
	static char opcao = '-';
	
	public static void main(String[] args) throws IOException {
		printarMenu();
		printarTabuleiro();
		String cordenadas = selecionarCampo();
		insereJogadorNoTabuleiro(cordenadas);
	}

	public static void printarMenu() throws IOException{
		System.out.println("##############");
		System.out.println("Jogo da velha");
		System.out.println("##############");
		System.out.println("\n");
		System.out.println("Jogador  X");
		System.out.println("Jogador  O");
		
		System.out.print("Escolha uma jogador:");

		opcao = (char)System.in.read();
	}
	
	public static void printarTabuleiro(){
		System.out.println("\n  a b c");
		int contador = 1;
		
		for(int i = 0; i< 3;i++){
			
			System.out.print(contador);
			for(int j =0; j< 4;j ++){
				System.out.print("|");
				System.out.print("_");
			}
		 contador++;	
		 System.out.print("\n");
		}
	}	
	
	public static String selecionarCampo(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n");
		System.out.print("Digite a linha e coluna que deseja inserir o jogador:");

		return scanner.next();
	}
	
	public static void insereJogadorNoTabuleiro(String cordenadas){
		
	}
	
}