package Chapter2_GettingStarted;

import java.util.Scanner;

public class MergeSortedArray {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arrayA = new int[n];
		for(int i = 0; i < n; i++) arrayA[i] = scanner.nextInt();
		int p = scanner.nextInt();
		int q = scanner.nextInt();
		int r = scanner.nextInt();
		scanner.close();
		// MERGE
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] arrayL = new int[n1 + 1];
		int[] arrayR = new int[n2 + 1];
		int i = 0, j = 0;
		for(i = 0; i < n1; i++) arrayL[i] = arrayA[p + i - 1];
		for(j = 0; j < n2; j++) arrayR[j] = arrayA[q + j];
		arrayL[n1] = Integer.MAX_VALUE;
		arrayR[n2] = Integer.MAX_VALUE;
		for(i = 0; i < arrayL.length; i++) System.out.print(arrayL[i]+" ");
		System.out.println();
		for(i = 0; i < arrayR.length; i++) System.out.print(arrayR[i]+" ");
		System.out.println();
		i = 0;
		j = 0;
		for(int k = p-1; k < r; k++){
			if(arrayL[i] >= arrayR[j]) arrayA[k] = arrayR[j++];
			else arrayA[k] = arrayL[i++];
		}
		// Printing Values
		for(i = 0; i < n; i++) System.out.print(arrayA[i]+" ");
		System.out.println();
	}
}
