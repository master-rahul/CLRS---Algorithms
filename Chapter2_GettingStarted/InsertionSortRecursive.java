package Chapter2_GettingStarted;

import java.util.Scanner;

public class InsertionSortRecursive {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arrayA = new int[n];
		for(int i = 0; i < n; i++) arrayA[i] = scanner.nextInt();
		scanner.close();
		insertionSortRecursive(arrayA, 0, n-1);
		for(int i : arrayA) System.out.print(i+" ");
	}
	
	public static void insertionSortRecursive(int[] arrayA, int i, int j) {
		if(i > j) return;
			int num = arrayA[j];
			insertionSortRecursive(arrayA, i, j-1);
			int j1 = j-1;
			while(j1 >= i && arrayA[j1] >  num) {
				arrayA[j1 + 1] = arrayA[j1]; 
				j1--;
			}
			arrayA[j1+1] =  num;
		
	}
}
