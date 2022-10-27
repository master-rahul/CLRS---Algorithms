package Chapter2_GettingStarted;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<>(n);
		for(int i = 0; i < n; i++) arrayList.add(scanner.nextInt());
		Integer v = scanner.nextInt();
		scanner.close();
		// Linear Search
		Integer index = -1;
		for(int i = 0; i < n; i++) {
			if(arrayList.get(i) == v) {
				index = i+1;
				break;
			}
		}
		System.out.println(index);
	}
}
