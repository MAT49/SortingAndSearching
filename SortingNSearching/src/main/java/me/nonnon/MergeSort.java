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
	
	void merge(int[] array, int[] helper, int low, int middle, int high) {
		// Copy both halves into a helper array
		for (int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		
		int helperLeft = low;	// location pointer for left half
		int helperRight = middle + 1;	// location pointer for right half
		int current = low;	// location pointer for the final array
		
		// Iterate through helper array. Compare left and right half, 
		// copying back the smaller element front he two halves into the original array
		while (helperLeft <= middle && helperRight <= high) {
			if (helper[helperLeft] <= helper[helperRight]) {
				array[current] = helper[helperLeft];
				helperLeft++;
			} else {	// that is, Right element <= Left element
				array[current]  = helper[helperRight];
			}
			current++;
		}
		
		// Copy the rest of the left array into the final array
		int remaining = middle - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[current + i] = helper[helperLeft + 1];
		}
		
	}

}
