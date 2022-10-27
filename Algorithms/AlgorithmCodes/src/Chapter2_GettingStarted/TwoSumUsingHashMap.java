package Chapter2_GettingStarted;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumUsingHashMap {
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
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arrayA.length; i++) {
			if(map.containsKey(arrayA[i])) {
				int arr[] = new int[2];
				arr[0] = (int)map.get(arrayA[i]);
				arr[1] = i;
				return arr;
			}
			map.put(num - arrayA[i], i);
		}
		return new int[0];
	}
}