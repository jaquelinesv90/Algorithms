// Receive number and match them in pairs with the same numbers - return how many pairs you maked

public class SockMerchant {

	static int number = 9;
	static int[] array = { 10, 20, 60, 10, 40, 30, 50, 10, 20 };

	
	public static void main(String args[]) {
		calculate();
	}

	public static void calculate() {
		int match = 0;
		int comparator = 0;
		for (int i = 0; i < array.length; i++) {
			if (comparator == 0) {
				comparator = array[0];
			}

			if (comparator == array[i + 1]) {
				match += 1;
				////comparator = array[i + 1];-- erro
			}
		}
		System.out.print(match);
	}
}
