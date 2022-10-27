package Chapter2_GettingStarted;

import java.util.Scanner;

public class BinarySearchIterative {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arrayA = new int[n];
		for(int i = 0; i < n; i++) arrayA[i] = scanner.nextInt();
		int find = scanner.nextInt();
		scanner.close();
		System.out.println(binarySearchIterative(arrayA, find));
	}
	
	public static int binarySearchIterative(int[] arrayA, int find) {
		int i = 0, j = arrayA.length -1;
		while(i <= j) {
			int mid = (i+j)/2;
			if(arrayA[mid] == find) return mid+1;
			else if(arrayA[mid] > find) j = mid - 1;
			else i = mid + 1;
		}
		return -1;
	}
}
