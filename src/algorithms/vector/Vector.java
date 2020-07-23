package algorithms.vector;

public class Vector {

	private String[] elements;
	private int tamanho;

	public Vector(int capacity) {
		this.elements = new String[capacity];
		this.tamanho = 0;
	}

	//verifica se o array está vazio, quando encontrar a primeira
	// posição vazia ele  adiciona o elemento e para a pesquisa
	public void add(String element) {
		for (int i = 0; i < this.elements.length; i++) {
			if (this.elements[i] == null) {
				this.elements[i] = element;
				break;
			}
		}
	}

	// método add melhorado, para sabel qual foi a
	// ultima posição que guardamos elementos
	public void add1(String element) throws Exception {

		if (this.tamanho < this.elements.length) {//verifica se o tamanho é menor que a capacidade do vetor
			this.elements[this.tamanho] = element;
			this.tamanho++;
		} else {
			throw new Exception("Vetor cheio,não adicionar mais elementos");
		}
	}

}
