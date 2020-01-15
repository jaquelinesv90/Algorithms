package algorithms.staticblocks;

public class StaticBlocks {
	
	/**
	 * o bloco � executado antes do construtor,
	 * o objetivo � inicializar atributos e metodos
	 * estaticos.� executado uma unica vez quando 
	 * quando a classe � carregada na memoria
	 */
	static{
		System.out.println("static block");
	}
	
	
	public static void main(String[] args){
		System.out.println("main");
	}
	
	public StaticBlocks(){
		System.out.println("constructor");
	}
}
