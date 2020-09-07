package algorithms.binarySearch;

/*
is a search algorithm that finds the position of a target 
value within a sorted array.[4][5] Binary search compares 
the target value to the middle element of the array. If 
they are not equal, the half in which the target cannot 
lie is eliminated and the search continues on the remaining 
half, again taking the middle element to compare to the target 
value, and repeating this until the target value is found.
If the search ends with the remaining half being empty, 
the target is not in the array. 
*/
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