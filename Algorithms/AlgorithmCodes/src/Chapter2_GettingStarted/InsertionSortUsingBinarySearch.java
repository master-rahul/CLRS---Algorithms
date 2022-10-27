package Chapter2_GettingStarted;

import java.util.Scanner;

public class InsertionSortUsingBinarySearch {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arrayA = new int[n];
		for(int i = 0; i < n; i++) arrayA[i] = scanner.nextInt();
		scanner.close();
		insertionSortUsingBinarySearch(arrayA, 0, arrayA.length-1);
		for(int i : arrayA) System.out.print(i+" ");
	}
	
	public static void insertionSortUsingBinarySearch(int[] arrayA, int i, int j) {
		if(i >= j) return;
		int value = arrayA[j];
		insertionSortUsingBinarySearch(arrayA, i, j-1);
		int pos = binarySearch(arrayA, 0, j-1, value);
		for(int k = j; k > pos; k--) arrayA[k] = arrayA[k-1];
		arrayA[pos] = value;
	}
	public static int binarySearch(int[] arrayA, int i, int j, int value) {
		int mid = (i+j)/2;
		if(i == j) {
			if(arrayA[mid] == value) return mid;
			else if(arrayA[mid] > value) return mid;
			else return mid + 1;
		}else if(arrayA[mid] > value) return binarySearch(arrayA, i, mid, value);
		else return binarySearch(arrayA, mid+1, j, value);
	}
}
