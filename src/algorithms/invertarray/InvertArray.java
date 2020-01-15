package algorithms.invertarray;
import java.util.Arrays;


// Receive one array of numbers and show inverted, the last number will be the first
public class InvertArray {

	static int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
	static int[] result = new int[8];

	public static void main(String[] args) {
		invertArray();
		Arrays.sort(numbers);
	}

	public static void invertArray() {
		for (int i = 0; i < numbers.length - 1; i++) {
			result[i] = numbers[numbers.length - i - 1];
		}

		for (int ars : result) {
			System.out.print(ars + "");
		}
	}

}
