package algorithms.string;

public class StringMethods {
	
	
	//charAt - retorna apenas um caractere em determinada posi��o
	public static void charat(){
		String valor = "Hello";
		char result = valor.charAt(0);
		System.out.println(result);
	}
	
	//compareTo - compara Strings considera letras mai�sculas e minusculas
	//compareToIgnoreCase - desconsidera letras mai�sculas e minusculas
	public static void  compare(){
		String valor = "DEVMEDIA-Java";
		
		System.out.println(valor.compareTo("DEVMEDIA-Java") == 0 ? true : false);
		System.out.println(valor.compareTo("DEVMEDIA-JAVA") == 0 ? true : false);
		System.out.println(valor.compareToIgnoreCase("DEVMEDIA-JAVA") == 0 ? true : false);
	}
	
	//endsWith - verifica se a String termina com o valor especificado
	//startsWith - verifica se a String come�a com o valor especificado
	//com parametro serve para dizer onde deve come�ar a verifica��o do 
	//inicio da String.
	public static void startEnd(){
		String valor = "DEVMEDIA-Java";
		
		System.out.println(valor.endsWith("Java"));
		System.out.println(valor.startsWith("DEV"));
		System.out.println(valor.startsWith("ME", 3));
	}
	
	
	
	
	//toCharArray
	
	//isEmpty
	
	//split
	
	//substring e subSequence
	
	//toLowerCase, toUpperCae e trim
	
	//valueOf
	
	//format
	public static void main(String[] args){
		//charat();
		//compare();
		startEnd();
	}

}
