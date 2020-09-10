package algorithms.quickSort;

import java.util.Arrays;
import java.util.Random;
/*
An Array {15,3,2,1,9,5,7,8,6}, it first divides the input array 
into two smaller sub-arrays: the low elements and the high elements.
1.Pick an element,called a pivot, from the array.
2.Partioning: reorder the array so that all elements with values less than
the pivot come before the pivot, while all elements with values greater than the pivot
come after it(equal values can go either way).After this partioning, the pivot is in its final position.
3.Recursively apply the above steps to the sub-array of elements with smaller values and separately to
the sub-array of elements with greater values.*/

public class QuickSort {
	
	public void quickSort(int[] ar){
			quickSort(ar, 0 , ar.length - 1);
	}
	
	private void quickSort(int[] ar, int left, int right ){
		if(left < right + 1){
			int p = partition(ar, left,right);
			quickSort(ar, left, p-1);
			quickSort(ar, p+1,right);
		}
	}
	
	private void swap(int[] ar, int left, int right){
		int temp = ar[left];
		ar[left] = ar[right];
		ar[right] = temp;
	}
	
	private int getPivot(int left, int right){
		Random rand = new Random();
		return rand.nextInt((right - left) + 1) + left;
	}
	
	private int partition(int[] array, int left,int right){
		swap(array,left,getPivot(left,right));
		int border = left +1;
		for(int i = border; i<= right; i++){
			if(array[i] < array[left]){
				swap(array,i,border++);
			}
		}
		swap(array,left,border -1);
		return border -1;
	}
	
	public static void main(String[] args) {
		QuickSort quick = new QuickSort();
		int[] array = {15,3,9,8,5,2,7,1,6};
		
		System.out.println(Arrays.toString(array));
		
		quick.quickSort(array);
		System.out.println("Ordered array: "+ Arrays.toString(array));
	}
}
