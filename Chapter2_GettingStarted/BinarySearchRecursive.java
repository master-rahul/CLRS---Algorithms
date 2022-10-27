package Chapter2_GettingStarted;

import java.util.Scanner;

public class BinarySearchRecursive {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arrayA = new int[n];
		for(int i = 0; i < n; i++) arrayA[i] = scanner.nextInt();
		int find = scanner.nextInt();
		scanner.close();
		System.out.println(binarySearchRecursive(arrayA, find, 0, n -1));
	}

	private static int binarySearchRecursive(int[] arrayA, int find, int i, int j) {
		if(i > j) return -1;
		int mid = (i+j)/2;
		if(arrayA[mid] == find) return mid+1;
		else if(arrayA[mid] > find) return binarySearchRecursive(arrayA, find, i, mid-1);
		else return binarySearchRecursive(arrayA, find, mid+1, j);
	}
}
