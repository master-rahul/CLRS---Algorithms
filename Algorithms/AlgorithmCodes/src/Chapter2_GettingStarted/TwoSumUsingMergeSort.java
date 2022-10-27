package Chapter2_GettingStarted;

import java.util.Scanner;

public class TwoSumUsingMergeSort  {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arrayA = new int[n];
		for(int i = 0; i < n; i++) arrayA[i] = scanner.nextInt();
		int num = scanner.nextInt();
		scanner.close();
		int[] ans = twoSum(arrayA, num);
		if(ans.length != 0) System.out.println(arrayA[ans[0]] +", "+arrayA[ans[1]]);
		else System.out.println(-1);
	}
	
	public static int[] twoSum(int[] arrayA, int num) {
		MergeSort.mergeSort(arrayA,0, arrayA.length-1);
		int i = 0, j = arrayA.length-1;
		while(j > i) {
			if(arrayA[i] + arrayA[j] == num) {
				int[] arr = new int[2];
				arr[0] = i;
				arr[1] = j;
				return arr;
			}else if(arrayA[i] + arrayA[j] > num) j--;
			else i++;
		}
		return new int[0];
	}
}
