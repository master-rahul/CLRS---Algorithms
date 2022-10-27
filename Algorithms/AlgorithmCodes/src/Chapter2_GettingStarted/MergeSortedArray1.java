package Chapter2_GettingStarted;

import java.util.Scanner;

public class MergeSortedArray1 {
	
	public static void merge(int[] arrayA, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] arrayL = new int[n1];
		int[] arrayR = new int[n2];
		for(int i = p; i <= q; i++) arrayL[i-p] = arrayA[i];
		for(int i = q+1; i <= r; i++) arrayR[i-(q+1)] = arrayA[i];
		int i = 0, j = 0, k = p;
		while(i < n1 && j < n2) {
			if(arrayL[i] <= arrayR[j]) arrayA[k++] = arrayL[i++];
			else arrayA[k++] = arrayR[j++];
		}
		while(i < n1) arrayA[k++] = arrayL[i++];
		while(j < n2) arrayA[k++] = arrayR[j++];
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arrayA = new int[n];
		for(int i = 0; i < n; i++) arrayA[i] = scanner.nextInt();
		int p = scanner.nextInt();
		int q = scanner.nextInt();
		int r = scanner.nextInt();
		scanner.close();
		merge(arrayA, p, q, r);
		for(int i : arrayA) System.out.print(i+" ");
	}

}
