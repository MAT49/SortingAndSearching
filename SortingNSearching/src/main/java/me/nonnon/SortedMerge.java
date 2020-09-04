package me.nonnon;

public class SortedMerge {
	// You are given two sorted arrays, A and B, where A has a large enough buffer at the
	// end to hold B. Write a method to merge B into A in sorted order.
	
	void merge(int[] a, int[] b, int lastA, int lastB) {
		int indexA = lastA - 1;	// Last element in array A
		int indexB = lastB - 1;	// Last element in array B
		int indexMerged = lastB + lastA -1;	// Last element in merged array
		
		// Merge A and B from the last (biggest) element
		while (indexB >= 0) {
			if (indexA >= 0 && a[indexA] > b[indexB]) {
				a[indexMerged] = a[indexA];
				indexA--;
			} else {
				a[indexMerged] = b[indexB];
				indexB--;
			}
			indexMerged--;
			
		}
	}

}
