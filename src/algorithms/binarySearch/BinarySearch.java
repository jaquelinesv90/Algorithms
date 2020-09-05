package algorithms.binarySearch;

public class BinarySearch {
	
	public static int binarySearchIterative(int[] array, int x){
		int middle;
		int start, end;
		start = 0;
		end = array.length - 1;
		
		while(start <= end){
			middle = (start + end) / 2;
			if(array[middle] == x){
				return middle;
			}else if(array[middle] < x){
				start = middle + 1;
			}else if(array[middle] > x){
				end = middle -1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] array = {1,3,6,12,34,67,88,110};
		int numberToFind = 34;
		
		int index = binarySearchIterative(array,numberToFind);
		
		System.out.println(index);
	}
}