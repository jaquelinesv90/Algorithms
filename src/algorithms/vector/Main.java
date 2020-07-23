package algorithms.vector;

public class Main {
	
	public static void main(String args[]){
		Vector vector = new Vector(5);
		
		try {
			vector.add("elemento 1");
			vector.add("elemento 2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
