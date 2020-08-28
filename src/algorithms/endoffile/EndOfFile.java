package algorithms.endoffile;
import java.util.ArrayList;
import java.util.List;

/*Read some unknow lines and print with number
hello world

1 hello world*/
public class EndOfFile {

	static List<String> listInput = new ArrayList<String>();
	
	public static void main(String args[]){
		populateList();
		
		for(int i = 1; i< listInput.size(); i++){
			System.out.println(i +" " + listInput.get(i));
		}
	}
	
	public static void populateList(){
		listInput.add("Hello world");
		listInput.add("I am a file");
		listInput.add("try again");
		listInput.add("Hallo aus Berlin");
		listInput.add("Angra");
	}	
}
