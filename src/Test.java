import java.util.Random;


public class Test {

	public static void main(String[] args) {
		Random r = new Random();
		
		int n = r.nextInt(10);
		n+= 1;
		
		System.out.println(n);
	}
}
