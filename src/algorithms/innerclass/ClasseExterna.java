package algorithms.innerclass;

// a classe interna tem acesso a todos os m�todos
// da classe externa

/**
 * um exemplo do uso de classes internas � quando voc� quer implementar uma interface
 * sem violar o encapsulamento de sua classe.
 * 
 *ocultar classes que s� fazem sentido associadas a classe principal.Por
 *exemplo, voc� vai ter uma classe ListaEncadeada.Toda lista � um conjunto
 *de n�s, mas o conjunto de n�s s� tem sentido para a classe da lista. Ent�o, porque
 *deixar o n� p�blico? A classe N� poderia se interna privada da lista.
 */
public class ClasseExterna {
	
	private int valor;
	
	public void atribuiValor(){
		valor = 10;
	}
	 //classe interna
	public class ClasseInterna{
		
		public void imprimir(){
			System.out.print(valor);
		}
		
	}
	

}
