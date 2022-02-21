package algorithms.randomNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		int min = 1;
		int max = 10;
		int range = max - min;

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i < max; i++) {
			Random r = new Random();

			int n = r.nextInt(range);
			if (!list.contains(n)) {
				list.add(n);
			}

			for (Integer l : list) {
				System.out.print(l);
			}

		}
	}

}
