package Chapter2_GettingStarted;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<Integer>(n);
		for(int i = 0; i < n; i++) arrayList.add(scanner.nextInt());
		scanner.close();
		// Insertion Sort Decreasing
		for(int j = 1; j < n; j++) {
			Integer keyInteger = arrayList.get(j);
			Integer i = j - 1;
			while(i > -1 && arrayList.get(i) < keyInteger) {
				arrayList.set(i+1, arrayList.get(i));					i = i -1;
			}
			arrayList.set(i+1, keyInteger);
		}	
		for(Integer integer : arrayList) System.out.print(integer+" ");
		System.out.println();	
		
		//Insertion Sort Increasing

		for(int j = 1; j < n; j++) {
			Integer keyInteger = arrayList.get(j);
			Integer i = j - 1;
			while(i > -1 && arrayList.get(i) > keyInteger) {
				arrayList.set(i+1, arrayList.get(i));
				i = i - 1;
			}
			arrayList.set(i+1, keyInteger);
		}
		for(Integer integer : arrayList) System.out.print(integer+" ");
		System.out.println();
	}
}
