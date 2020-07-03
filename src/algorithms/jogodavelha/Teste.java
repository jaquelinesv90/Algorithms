package algorithms.jogodavelha;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char[][] jovoVelha = new char[3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou){
			if((jogada %2) == 1){ //jogador 1
				System.out.println("Vez do jogador 1.Escolha linha e coluna(1-3)");
				sinal = 'X';
			}else{
				System.out.println("Vez do jogador 2.Escolha linha e coluna(1-3)");
				sinal = 'O';
			}
		}
		
		boolean linhaValida =false;
		while(!linhaValida){
			System.out.println("Entre com a linha (1,2 ou 3)");
			
		}
	}

}
