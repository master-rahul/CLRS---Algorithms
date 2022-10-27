package Chapter2_GettingStarted;

import java.util.Scanner;

public class MergeSort {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arrayA = new int[n];
		for(int i = 0; i < n; i++) arrayA[i] = scanner.nextInt();
		scanner.close();
		mergeSort(arrayA, 0, n-1);
		for(int i = 0; i < n; i++) System.out.print(arrayA[i] + " ");
	}
	
	private static void merger(int[] arrayA, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] arrayL = new int[n1 + 1];
		int[] arrayR = new int[n2 + 1];
		int i = 0, j = 0;
		for(i = 0; i < n1; i++) arrayL[i] = arrayA[p + i];
		for(j = 0; j < n2; j++) arrayR[j] = arrayA[q + j + 1];
		arrayL[n1] = Integer.MAX_VALUE;
		arrayR[n2] = Integer.MAX_VALUE;
		i = 0;
		j = 0;
		for(int k = p; k <= r; k++){
			if(arrayL[i] >= arrayR[j]) arrayA[k] = arrayR[j++];
			else arrayA[k] = arrayL[i++];
		}	
	}

	public static void mergeSort(int[] arrayA, int p, int r) {
		if(p >= r) return;
		int q = (p + r)/ 2;
		mergeSort(arrayA, p, q);
		mergeSort(arrayA, q+1, r);
		merger(arrayA, p, q, r);
	}
}
