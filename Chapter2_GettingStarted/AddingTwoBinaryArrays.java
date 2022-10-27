package Chapter2_GettingStarted;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingTwoBinaryArrays {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		ArrayList<Integer> arrayA = new ArrayList<>(n);
		ArrayList<Integer> arrayB = new ArrayList<>(n);
		for(int i = 0; i < n; i++) arrayA.add(scanner.nextInt());
		for(int i = 0; i < n; i++) arrayB.add(scanner.nextInt());
		scanner.close();
		// Adding two Binary Array
		int[] arrayC = new int[n+1];
		Integer carry = 0;
		for(int i = n-1; i > -1; i--) {
			arrayC[i+1] = (arrayA.get(i) + arrayB.get(i) + carry)%2;
			carry = (arrayA.get(i) + arrayB.get(i) + carry)/2;
		}
		arrayC[0] = carry;
		for(int i = 0; i < n+1; i++) System.out.print(arrayC[i] +" ");
		System.out.println();
	}
}
