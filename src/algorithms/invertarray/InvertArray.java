package algorithms.invertarray;


// Receive one array of numbers and show inverted, the last number will be the first
public class InvertArray {

	static Object[] array = { "Joao", "maria", "carlos", "juliana" };

	public static void main(String[] args) {
		invertUsingFor();
	}

	static void invertUsingFor() {
		for (int i = 0; i < array.length / 2; i++) {
			Object temp = array[i];
			array[i] = array[array.length - 1 - i];//pegando ultimo objeto //cathing the last object
			array[array.length - 1 - i] = temp;
		}

		for (Object n : array) {
			System.out.print(n + " - ");
		}
	}
}
