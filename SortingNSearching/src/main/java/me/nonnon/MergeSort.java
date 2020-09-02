package me.nonnon;

public class MergeSort {
	
	void mergesort(int[] array) {
		int[] helper = new int[array.length];
		mergesort(array, helper, 0, array.length - 1);
	}
	
	void mergesort(int[] array, int[] helper, int low, int high) {
		if (low < high) {
			int middle = (low + high) /2;
			mergesort(array, helper, low, middle);	// sort left half
			mergesort(array, helper, middle+1, high);	// sort right half
			merge(array, helper, low, middle, high);	// merge left and right halves
		}
	}
	
	void merge() {
		
	}

}
